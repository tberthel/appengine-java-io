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

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.CharBuffer;

public class FileReader extends java.io.FileReader {

	/**
	 * @param file
	 * @throws FileNotFoundException
	 */
	public FileReader(File file) throws FileNotFoundException {
		super(file);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fd
	 */
	public FileReader(FileDescriptor fd) {
		super(fd);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	public FileReader(String fileName) throws FileNotFoundException {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.io.InputStreamReader#close()
	 */
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	/* (non-Javadoc)
	 * @see java.io.InputStreamReader#getEncoding()
	 */
	@Override
	public String getEncoding() {
		// TODO Auto-generated method stub
		return super.getEncoding();
	}

	/* (non-Javadoc)
	 * @see java.io.InputStreamReader#read()
	 */
	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		return super.read();
	}

	/* (non-Javadoc)
	 * @see java.io.InputStreamReader#read(char[], int, int)
	 */
	@Override
	public int read(char[] cbuf, int offset, int length) throws IOException {
		// TODO Auto-generated method stub
		return super.read(cbuf, offset, length);
	}

	/* (non-Javadoc)
	 * @see java.io.InputStreamReader#ready()
	 */
	@Override
	public boolean ready() throws IOException {
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
	 * @see java.io.Reader#read(char[])
	 */
	@Override
	public int read(char[] cbuf) throws IOException {
		// TODO Auto-generated method stub
		return super.read(cbuf);
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

}
