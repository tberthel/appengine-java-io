/**
 * 
 */
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

import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream extends java.io.BufferedInputStream {

	public BufferedInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param in
	 * @param size
	 */
	public BufferedInputStream(InputStream in, int size) {
		super(in, size);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.io.BufferedInputStream#available()
	 */
	@Override
	public synchronized int available() throws IOException {
		// TODO Auto-generated method stub
		return super.available();
	}

	/* (non-Javadoc)
	 * @see java.io.BufferedInputStream#close()
	 */
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	/* (non-Javadoc)
	 * @see java.io.BufferedInputStream#mark(int)
	 */
	@Override
	public synchronized void mark(int readlimit) {
		// TODO Auto-generated method stub
		super.mark(readlimit);
	}

	/* (non-Javadoc)
	 * @see java.io.BufferedInputStream#markSupported()
	 */
	@Override
	public boolean markSupported() {
		// TODO Auto-generated method stub
		return super.markSupported();
	}

	/* (non-Javadoc)
	 * @see java.io.BufferedInputStream#read()
	 */
	@Override
	public synchronized int read() throws IOException {
		// TODO Auto-generated method stub
		return super.read();
	}

	/* (non-Javadoc)
	 * @see java.io.BufferedInputStream#read(byte[], int, int)
	 */
	@Override
	public synchronized int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return super.read(b, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.BufferedInputStream#reset()
	 */
	@Override
	public synchronized void reset() throws IOException {
		// TODO Auto-generated method stub
		super.reset();
	}

	/* (non-Javadoc)
	 * @see java.io.BufferedInputStream#skip(long)
	 */
	@Override
	public synchronized long skip(long n) throws IOException {
		// TODO Auto-generated method stub
		return super.skip(n);
	}

	/* (non-Javadoc)
	 * @see java.io.FilterInputStream#read(byte[])
	 */
	@Override
	public int read(byte[] b) throws IOException {
		// TODO Auto-generated method stub
		return super.read(b);
	}

}
