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
import java.io.PipedWriter;
import java.nio.CharBuffer;

public class PipedReader extends java.io.PipedReader {

	/* (non-Javadoc)
	 * @see java.io.PipedReader#close()
	 */
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	/* (non-Javadoc)
	 * @see java.io.PipedReader#connect(java.io.PipedWriter)
	 */
	@Override
	public void connect(PipedWriter src) throws IOException {
		// TODO Auto-generated method stub
		super.connect(src);
	}

	/* (non-Javadoc)
	 * @see java.io.PipedReader#read()
	 */
	@Override
	public synchronized int read() throws IOException {
		// TODO Auto-generated method stub
		return super.read();
	}

	/* (non-Javadoc)
	 * @see java.io.PipedReader#read(char[], int, int)
	 */
	@Override
	public synchronized int read(char[] cbuf, int off, int len)
			throws IOException {
		// TODO Auto-generated method stub
		return super.read(cbuf, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.PipedReader#ready()
	 */
	@Override
	public synchronized boolean ready() throws IOException {
		// TODO Auto-generated method stub
		return super.ready();
	}

	/* (non-Javadoc)
	 * @see java.io.Reader#mark(int)
	 */
	@Override
	public void mark(int readAheadLimit) throws IOException {
		// TODO Auto-generated method stub
		super.mark(readAheadLimit);
	}

	/* (non-Javadoc)
	 * @see java.io.Reader#markSupported()
	 */
	@Override
	public boolean markSupported() {
		// TODO Auto-generated method stub
		return super.markSupported();
	}

	/* (non-Javadoc)
	 * @see java.io.Reader#read(java.nio.CharBuffer)
	 */
	@Override
	public int read(CharBuffer target) throws IOException {
		// TODO Auto-generated method stub
		return super.read(target);
	}

	/* (non-Javadoc)
	 * @see java.io.Reader#read(char[])
	 */
	@Override
	public int read(char[] cbuf) throws IOException {
		// TODO Auto-generated method stub
		return super.read(cbuf);
	}

	/* (non-Javadoc)
	 * @see java.io.Reader#reset()
	 */
	@Override
	public void reset() throws IOException {
		// TODO Auto-generated method stub
		super.reset();
	}

	/* (non-Javadoc)
	 * @see java.io.Reader#skip(long)
	 */
	@Override
	public long skip(long n) throws IOException {
		// TODO Auto-generated method stub
		return super.skip(n);
	}

	/**
	 * 
	 */
	public PipedReader() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param pipeSize
	 */
	public PipedReader(int pipeSize) {
		super(pipeSize);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param src
	 * @param pipeSize
	 * @throws IOException
	 */
	public PipedReader(PipedWriter src, int pipeSize) throws IOException {
		super(src, pipeSize);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param src
	 * @throws IOException
	 */
	public PipedReader(PipedWriter src) throws IOException {
		super(src);
		// TODO Auto-generated constructor stub
	}

}
