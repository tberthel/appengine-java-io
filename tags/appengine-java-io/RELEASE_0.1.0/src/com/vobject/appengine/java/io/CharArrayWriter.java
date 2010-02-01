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
import java.io.Writer;

public class CharArrayWriter extends java.io.CharArrayWriter {

	/* (non-Javadoc)
	 * @see java.io.CharArrayWriter#append(char)
	 */
	@Override
	public CharArrayWriter append(char c) {
		return null;

	}

	/* (non-Javadoc)
	 * @see java.io.CharArrayWriter#append(java.lang.CharSequence, int, int)
	 */
	@Override
	public CharArrayWriter append(CharSequence csq, int start, int end) {
		return null;

	}

	/* (non-Javadoc)
	 * @see java.io.CharArrayWriter#append(java.lang.CharSequence)
	 */
	@Override
	public CharArrayWriter append(CharSequence csq) {
		return null;

	}

	/* (non-Javadoc)
	 * @see java.io.CharArrayWriter#close()
	 */
	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.close();
	}

	/* (non-Javadoc)
	 * @see java.io.CharArrayWriter#flush()
	 */
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		super.flush();
	}

	/* (non-Javadoc)
	 * @see java.io.CharArrayWriter#reset()
	 */
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		super.reset();
	}

	/* (non-Javadoc)
	 * @see java.io.CharArrayWriter#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}

	/* (non-Javadoc)
	 * @see java.io.CharArrayWriter#toCharArray()
	 */
	@Override
	public char[] toCharArray() {
		// TODO Auto-generated method stub
		return super.toCharArray();
	}

	/* (non-Javadoc)
	 * @see java.io.CharArrayWriter#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	/* (non-Javadoc)
	 * @see java.io.CharArrayWriter#write(char[], int, int)
	 */
	@Override
	public void write(char[] c, int off, int len) {
		// TODO Auto-generated method stub
		super.write(c, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.CharArrayWriter#write(int)
	 */
	@Override
	public void write(int c) {
		// TODO Auto-generated method stub
		super.write(c);
	}

	/* (non-Javadoc)
	 * @see java.io.CharArrayWriter#write(java.lang.String, int, int)
	 */
	@Override
	public void write(String str, int off, int len) {
		// TODO Auto-generated method stub
		super.write(str, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.CharArrayWriter#writeTo(java.io.Writer)
	 */
	@Override
	public void writeTo(Writer out) throws IOException {
		// TODO Auto-generated method stub
		super.writeTo(out);
	}

	/* (non-Javadoc)
	 * @see java.io.Writer#write(char[])
	 */
	@Override
	public void write(char[] cbuf) throws IOException {
		// TODO Auto-generated method stub
		super.write(cbuf);
	}

	/* (non-Javadoc)
	 * @see java.io.Writer#write(java.lang.String)
	 */
	@Override
	public void write(String str) throws IOException {
		// TODO Auto-generated method stub
		super.write(str);
	}

	/**
	 * 
	 */
	public CharArrayWriter() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param initialSize
	 */
	public CharArrayWriter(int initialSize) {
		super(initialSize);
		// TODO Auto-generated constructor stub
	}

}
