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

public class PushbackInputStream extends java.io.PushbackInputStream {

	/* (non-Javadoc)
	 * @see java.io.PushbackInputStream#available()
	 */
	@Override
	public int available() throws IOException {
		// TODO Auto-generated method stub
		return super.available();
	}

	/* (non-Javadoc)
	 * @see java.io.PushbackInputStream#close()
	 */
	@Override
	public synchronized void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	/* (non-Javadoc)
	 * @see java.io.PushbackInputStream#mark(int)
	 */
	@Override
	public synchronized void mark(int readlimit) {
		// TODO Auto-generated method stub
		super.mark(readlimit);
	}

	/* (non-Javadoc)
	 * @see java.io.PushbackInputStream#markSupported()
	 */
	@Override
	public boolean markSupported() {
		// TODO Auto-generated method stub
		return super.markSupported();
	}

	/* (non-Javadoc)
	 * @see java.io.PushbackInputStream#read()
	 */
	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		return super.read();
	}

	/* (non-Javadoc)
	 * @see java.io.PushbackInputStream#read(byte[], int, int)
	 */
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return super.read(b, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.PushbackInputStream#reset()
	 */
	@Override
	public synchronized void reset() throws IOException {
		// TODO Auto-generated method stub
		super.reset();
	}

	/* (non-Javadoc)
	 * @see java.io.PushbackInputStream#skip(long)
	 */
	@Override
	public long skip(long n) throws IOException {
		// TODO Auto-generated method stub
		return super.skip(n);
	}

	/* (non-Javadoc)
	 * @see java.io.PushbackInputStream#unread(byte[], int, int)
	 */
	@Override
	public void unread(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		super.unread(b, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.PushbackInputStream#unread(byte[])
	 */
	@Override
	public void unread(byte[] b) throws IOException {
		// TODO Auto-generated method stub
		super.unread(b);
	}

	/* (non-Javadoc)
	 * @see java.io.PushbackInputStream#unread(int)
	 */
	@Override
	public void unread(int b) throws IOException {
		// TODO Auto-generated method stub
		super.unread(b);
	}

	/* (non-Javadoc)
	 * @see java.io.FilterInputStream#read(byte[])
	 */
	@Override
	public int read(byte[] b) throws IOException {
		// TODO Auto-generated method stub
		return super.read(b);
	}

	/**
	 * @param in
	 * @param size
	 */
	public PushbackInputStream(InputStream in, int size) {
		super(in, size);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param in
	 */
	public PushbackInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

}
