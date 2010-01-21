/*
 * The VObject AppEngine Java-IO is an open source project that porting gaevfs 
 * to java.io API to enable java.io classes support in Google App Engine (GAE). 
 * Copyright (C) VObject.com
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * Author: Lim Chee Kin (limcheekin@vobject.com)
 *
 */
package com.vobject.appengine.java.io;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import org.apache.commons.vfs.FileSystemException;

public class FileOutputStream {
	private OutputStream out;
	private final GaeVFSFacade GAE_VFS = GaeVFSFacade.getInstance();
	
	/* (non-Javadoc)
	 * @see java.io.FileOutputStream#close()
	 */

	public void close() throws IOException {
		// TODO Auto-generated method stub
		out.close();
		out = null;
	}

	/* (non-Javadoc)
	 * @see java.io.FileOutputStream#getChannel()
	 */
	public FileChannel getChannel() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.FileOutputStream#write(byte[], int, int)
	 */
	public void write(byte[] b, int off, int len) throws IOException {
		out.write(b, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.FileOutputStream#write(byte[])
	 */
	public void write(byte[] b) throws IOException {
		out.write(b);
	}

	/* (non-Javadoc)
	 * @see java.io.FileOutputStream#write(int)
	 */
	public void write(int b) throws IOException {
		out.write(b);
	}

	/**
	 * @param name
	 */
	public FileOutputStream(String name) {
		this(name, false);
	}

	/**
	 * @param file
	 */
	public FileOutputStream(File file) {
		this(file, false);
	}

	/**
	 * @param fdObj
	 */
	public FileOutputStream(FileDescriptor fdObj) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @param name
	 * @param append
	 */
	public FileOutputStream(String name, boolean append) {
		try {
			out = GAE_VFS.resolveFile(name).getContent().getOutputStream(append);
		} catch (FileSystemException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * @param file
	 * @param append
	 */
	public FileOutputStream(File file, boolean append) {
		try {
			out = file.getFileObject().getContent().getOutputStream(append);
		} catch (FileSystemException e) {
			throw new RuntimeException(e);
		}
	}

}
