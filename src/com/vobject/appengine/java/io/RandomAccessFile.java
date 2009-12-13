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
import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile extends java.io.RandomAccessFile {

	/* (non-Javadoc)
	 * @see java.io.RandomAccessFile#close()
	 */
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	/* (non-Javadoc)
	 * @see java.io.RandomAccessFile#getFilePointer()
	 */
	@Override
	public long getFilePointer() throws IOException {
		// TODO Auto-generated method stub
		return super.getFilePointer();
	}

	/* (non-Javadoc)
	 * @see java.io.RandomAccessFile#length()
	 */
	@Override
	public long length() throws IOException {
		// TODO Auto-generated method stub
		return super.length();
	}

	/* (non-Javadoc)
	 * @see java.io.RandomAccessFile#read()
	 */
	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		return super.read();
	}

	/* (non-Javadoc)
	 * @see java.io.RandomAccessFile#read(byte[], int, int)
	 */
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return super.read(b, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.RandomAccessFile#read(byte[])
	 */
	@Override
	public int read(byte[] b) throws IOException {
		// TODO Auto-generated method stub
		return super.read(b);
	}

	/* (non-Javadoc)
	 * @see java.io.RandomAccessFile#seek(long)
	 */
	@Override
	public void seek(long pos) throws IOException {
		// TODO Auto-generated method stub
		super.seek(pos);
	}

	/* (non-Javadoc)
	 * @see java.io.RandomAccessFile#setLength(long)
	 */
	@Override
	public void setLength(long newLength) throws IOException {
		// TODO Auto-generated method stub
		super.setLength(newLength);
	}

	/* (non-Javadoc)
	 * @see java.io.RandomAccessFile#skipBytes(int)
	 */
	@Override
	public int skipBytes(int n) throws IOException {
		// TODO Auto-generated method stub
		return super.skipBytes(n);
	}

	/* (non-Javadoc)
	 * @see java.io.RandomAccessFile#write(byte[], int, int)
	 */
	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		super.write(b, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.RandomAccessFile#write(byte[])
	 */
	@Override
	public void write(byte[] b) throws IOException {
		// TODO Auto-generated method stub
		super.write(b);
	}

	/* (non-Javadoc)
	 * @see java.io.RandomAccessFile#write(int)
	 */
	@Override
	public void write(int b) throws IOException {
		// TODO Auto-generated method stub
		super.write(b);
	}

	/**
	 * @param file
	 * @param mode
	 * @throws FileNotFoundException
	 */
	public RandomAccessFile(File file, String mode)
			throws FileNotFoundException {
		super(file, mode);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param mode
	 * @throws FileNotFoundException
	 */
	public RandomAccessFile(String name, String mode)
			throws FileNotFoundException {
		super(name, mode);
		// TODO Auto-generated constructor stub
	}

}
