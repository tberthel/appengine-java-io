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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.io.InputStream;

import org.apache.commons.vfs.FileSystemException;

public class FileInputStream {
	private InputStream in;
	private final GaeVFSFacade GAE_VFS = GaeVFSFacade.getInstance();

	/* (non-Javadoc)
	 * @see java.io.FileInputStream#available()
	 */
	public int available() throws IOException {
		return in.available();
	}

	/* (non-Javadoc)
	 * @see java.io.FileInputStream#close()
	 */
	public void close() throws IOException {
		in.close();
		in = null;
	}


	/* (non-Javadoc)
	 * @see java.io.FileInputStream#getChannel()
	 */
	public FileChannel getChannel() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.FileInputStream#read()
	 */
	public int read() throws IOException {
		return in.read();
	}

	/* (non-Javadoc)
	 * @see java.io.FileInputStream#read(byte[], int, int)
	 */
	public int read(byte[] b, int off, int len) throws IOException {
		return in.read(b, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.FileInputStream#read(byte[])
	 */
	public int read(byte[] b) throws IOException {
		return in.read(b);
	}

	/* (non-Javadoc)
	 * @see java.io.FileInputStream#skip(long)
	 */
	public long skip(long n) throws IOException {
		return in.skip(n);
	}

	/* (non-Javadoc)
	 * @see java.io.InputStream#mark(int)
	 */
	public void mark(int readlimit) {
		in.mark(readlimit);
	}

	/* (non-Javadoc)
	 * @see java.io.InputStream#markSupported()
	 */
	public boolean markSupported() {
		return in.markSupported();
	}

	/* (non-Javadoc)
	 * @see java.io.InputStream#reset()
	 */
	public synchronized void reset() throws IOException {
		in.reset();
	}

	/**
	 * @param file
	 * @throws FileNotFoundException
	 */
	public FileInputStream(File file) {
		try {
			in = file.getFileObject().getContent().getInputStream();
		} catch (FileSystemException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * @param fdObj
	 */
	public FileInputStream(FileDescriptor fdObj) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @param name
	 * @throws FileNotFoundException
	 */
	public FileInputStream(String name) {
		try {
			in = GAE_VFS.resolveFile(name).getContent().getInputStream();
		} catch (FileSystemException e) {
			throw new RuntimeException(e);
		}
	}

}
