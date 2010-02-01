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
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class OutputStreamWriter extends java.io.OutputStreamWriter {

	/* (non-Javadoc)
	 * @see java.io.OutputStreamWriter#close()
	 */
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	/* (non-Javadoc)
	 * @see java.io.OutputStreamWriter#flush()
	 */
	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub
		super.flush();
	}

	/* (non-Javadoc)
	 * @see java.io.OutputStreamWriter#getEncoding()
	 */
	@Override
	public String getEncoding() {
		// TODO Auto-generated method stub
		return super.getEncoding();
	}

	/* (non-Javadoc)
	 * @see java.io.OutputStreamWriter#write(char[], int, int)
	 */
	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		super.write(cbuf, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.OutputStreamWriter#write(int)
	 */
	@Override
	public void write(int c) throws IOException {
		// TODO Auto-generated method stub
		super.write(c);
	}

	/* (non-Javadoc)
	 * @see java.io.OutputStreamWriter#write(java.lang.String, int, int)
	 */
	@Override
	public void write(String str, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		super.write(str, off, len);
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
	 * @see java.io.Writer#append(java.lang.CharSequence)
	 */
	@Override
	public Writer append(CharSequence csq) throws IOException {
		// TODO Auto-generated method stub
		return super.append(csq);
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
	 * @param cs
	 */
	public OutputStreamWriter(OutputStream out, Charset cs) {
		super(out, cs);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param out
	 * @param enc
	 */
	public OutputStreamWriter(OutputStream out, CharsetEncoder enc) {
		super(out, enc);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param out
	 * @param charsetName
	 * @throws UnsupportedEncodingException
	 */
	public OutputStreamWriter(OutputStream out, String charsetName)
			throws UnsupportedEncodingException {
		super(out, charsetName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param out
	 */
	public OutputStreamWriter(OutputStream out) {
		super(out);
		// TODO Auto-generated constructor stub
	}

}
