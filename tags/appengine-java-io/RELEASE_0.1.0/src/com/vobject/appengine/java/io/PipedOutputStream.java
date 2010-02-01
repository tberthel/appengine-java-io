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
import java.io.PipedInputStream;

public class PipedOutputStream extends java.io.PipedOutputStream {

	/* (non-Javadoc)
	 * @see java.io.PipedOutputStream#close()
	 */
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	/* (non-Javadoc)
	 * @see java.io.PipedOutputStream#connect(java.io.PipedInputStream)
	 */
	@Override
	public synchronized void connect(PipedInputStream snk) throws IOException {
		// TODO Auto-generated method stub
		super.connect(snk);
	}

	/* (non-Javadoc)
	 * @see java.io.PipedOutputStream#flush()
	 */
	@Override
	public synchronized void flush() throws IOException {
		// TODO Auto-generated method stub
		super.flush();
	}

	/* (non-Javadoc)
	 * @see java.io.PipedOutputStream#write(byte[], int, int)
	 */
	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		super.write(b, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.PipedOutputStream#write(int)
	 */
	@Override
	public void write(int b) throws IOException {
		// TODO Auto-generated method stub
		super.write(b);
	}

	/* (non-Javadoc)
	 * @see java.io.OutputStream#write(byte[])
	 */
	@Override
	public void write(byte[] b) throws IOException {
		// TODO Auto-generated method stub
		super.write(b);
	}

	/**
	 * 
	 */
	public PipedOutputStream() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param snk
	 * @throws IOException
	 */
	public PipedOutputStream(PipedInputStream snk) throws IOException {
		super(snk);
		// TODO Auto-generated constructor stub
	}

}
