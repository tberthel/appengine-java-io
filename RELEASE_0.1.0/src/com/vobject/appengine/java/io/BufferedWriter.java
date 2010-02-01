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

public class BufferedWriter extends java.io.BufferedWriter {

	/* (non-Javadoc)
	 * @see java.io.BufferedWriter#close()
	 */
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	/* (non-Javadoc)
	 * @see java.io.BufferedWriter#flush()
	 */
	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub
		super.flush();
	}

	/* (non-Javadoc)
	 * @see java.io.BufferedWriter#newLine()
	 */
	@Override
	public void newLine() throws IOException {
		// TODO Auto-generated method stub
		super.newLine();
	}

	/* (non-Javadoc)
	 * @see java.io.BufferedWriter#write(char[], int, int)
	 */
	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		super.write(cbuf, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.BufferedWriter#write(int)
	 */
	@Override
	public void write(int c) throws IOException {
		// TODO Auto-generated method stub
		super.write(c);
	}

	/* (non-Javadoc)
	 * @see java.io.BufferedWriter#write(java.lang.String, int, int)
	 */
	@Override
	public void write(String s, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		super.write(s, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.Writer#append(java.lang.CharSequence)
	 */
	@Override
	public Writer append(CharSequence csq) throws IOException {
		// TODO Auto-generated method stub
		return super.append(csq);
	}

	/* (non-Javadoc)
	 * @see java.io.Writer#append(char)
	 */
	@Override
	public Writer append(char c) throws IOException {
		// TODO Auto-generated method stub
		return super.append(c);
	}

	/* (non-Javadoc)
	 * @see java.io.Writer#append(java.lang.CharSequence, int, int)
	 */
	@Override
	public Writer append(CharSequence csq, int start, int end)
			throws IOException {
		// TODO Auto-generated method stub
		return super.append(csq, start, end);
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
	 * @param out
	 * @param sz
	 */
	public BufferedWriter(Writer out, int sz) {
		super(out, sz);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param out
	 */
	public BufferedWriter(Writer out) {
		super(out);
		// TODO Auto-generated constructor stub
	}

}
