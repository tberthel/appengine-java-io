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
import java.io.PipedOutputStream;

public class PipedInputStream extends java.io.PipedInputStream {

	/* (non-Javadoc)
	 * @see java.io.PipedInputStream#available()
	 */
	@Override
	public synchronized int available() throws IOException {
		// TODO Auto-generated method stub
		return super.available();
	}

	/* (non-Javadoc)
	 * @see java.io.PipedInputStream#close()
	 */
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	/* (non-Javadoc)
	 * @see java.io.PipedInputStream#connect(java.io.PipedOutputStream)
	 */
	@Override
	public void connect(PipedOutputStream src) throws IOException {
		// TODO Auto-generated method stub
		super.connect(src);
	}

	/* (non-Javadoc)
	 * @see java.io.PipedInputStream#read()
	 */
	@Override
	public synchronized int read() throws IOException {
		// TODO Auto-generated method stub
		return super.read();
	}

	/* (non-Javadoc)
	 * @see java.io.PipedInputStream#read(byte[], int, int)
	 */
	@Override
	public synchronized int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return super.read(b, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.PipedInputStream#receive(int)
	 */
	@Override
	protected synchronized void receive(int b) throws IOException {
		// TODO Auto-generated method stub
		super.receive(b);
	}

	/* (non-Javadoc)
	 * @see java.io.InputStream#mark(int)
	 */
	@Override
	public synchronized void mark(int readlimit) {
		// TODO Auto-generated method stub
		super.mark(readlimit);
	}

	/* (non-Javadoc)
	 * @see java.io.InputStream#markSupported()
	 */
	@Override
	public boolean markSupported() {
		// TODO Auto-generated method stub
		return super.markSupported();
	}

	/* (non-Javadoc)
	 * @see java.io.InputStream#read(byte[])
	 */
	@Override
	public int read(byte[] b) throws IOException {
		// TODO Auto-generated method stub
		return super.read(b);
	}

	/* (non-Javadoc)
	 * @see java.io.InputStream#reset()
	 */
	@Override
	public synchronized void reset() throws IOException {
		// TODO Auto-generated method stub
		super.reset();
	}

	/* (non-Javadoc)
	 * @see java.io.InputStream#skip(long)
	 */
	@Override
	public long skip(long n) throws IOException {
		// TODO Auto-generated method stub
		return super.skip(n);
	}

	/**
	 * 
	 */
	public PipedInputStream() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param pipeSize
	 */
	public PipedInputStream(int pipeSize) {
		super(pipeSize);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param src
	 * @param pipeSize
	 * @throws IOException
	 */
	public PipedInputStream(PipedOutputStream src, int pipeSize)
			throws IOException {
		super(src, pipeSize);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param src
	 * @throws IOException
	 */
	public PipedInputStream(PipedOutputStream src) throws IOException {
		super(src);
		// TODO Auto-generated constructor stub
	}

}
