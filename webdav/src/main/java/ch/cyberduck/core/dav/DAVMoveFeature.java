package ch.cyberduck.core.dav;

/*
 * Copyright (c) 2002-2013 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to:
 * feedback@cyberduck.ch
 */

import ch.cyberduck.core.ConnectionCallback;
import ch.cyberduck.core.DescriptiveUrl;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.PathAttributes;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.features.Delete;
import ch.cyberduck.core.features.Move;
import ch.cyberduck.core.http.HttpExceptionMappingService;
import ch.cyberduck.core.shared.DefaultUrlProvider;
import ch.cyberduck.core.transfer.TransferStatus;

import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.message.BasicHeader;

import java.io.IOException;

import com.github.sardine.impl.SardineException;
import com.github.sardine.impl.handler.VoidResponseHandler;
import com.github.sardine.impl.methods.HttpMove;

public class DAVMoveFeature implements Move {

    private final DAVSession session;

    public DAVMoveFeature(final DAVSession session) {
        this.session = session;
    }

    @Override
    public Path move(final Path file, final Path renamed, final TransferStatus status, final Delete.Callback callback, final ConnectionCallback connectionCallback) throws BackgroundException {
        try {
            final String target = new DefaultUrlProvider(session.getHost()).toUrl(renamed).find(DescriptiveUrl.Type.provider).getUrl();
            final HttpRequestBase move = new HttpMove(new DAVPathEncoder().encode(file), file.isDirectory() ? String.format("%s/", target) : target, true);
            if(status.getLockId() != null) {
                // Indicate that the client has knowledge of that state token
                move.addHeader(new BasicHeader(HttpHeaders.IF, String.format("(<%s>)", status.getLockId())));
            }
            session.getClient().execute(move, new VoidResponseHandler());
            // Copy original file attributes
            return new Path(renamed.getParent(), renamed.getName(), renamed.getType(), new PathAttributes(file.attributes()));
        }
        catch(SardineException e) {
            throw new DAVExceptionMappingService().map("Cannot rename {0}", e, file);
        }
        catch(IOException e) {
            throw new HttpExceptionMappingService().map(e, file);
        }
    }

    @Override
    public boolean isRecursive(final Path source, final Path target) {
        return true;
    }

    @Override
    public Move withDelete(final Delete delete) {
        return this;
    }
}
