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
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.ObjectOutputStream.PutField;

public class ObjectOutputStream extends java.io.ObjectOutputStream {

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#annotateClass(java.lang.Class)
	 */
	@Override
	protected void annotateClass(Class<?> cl) throws IOException {
		// TODO Auto-generated method stub
		super.annotateClass(cl);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#annotateProxyClass(java.lang.Class)
	 */
	@Override
	protected void annotateProxyClass(Class<?> cl) throws IOException {
		// TODO Auto-generated method stub
		super.annotateProxyClass(cl);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#close()
	 */
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#defaultWriteObject()
	 */
	@Override
	public void defaultWriteObject() throws IOException {
		// TODO Auto-generated method stub
		super.defaultWriteObject();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#drain()
	 */
	@Override
	protected void drain() throws IOException {
		// TODO Auto-generated method stub
		super.drain();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#enableReplaceObject(boolean)
	 */
	@Override
	protected boolean enableReplaceObject(boolean enable)
			throws SecurityException {
		// TODO Auto-generated method stub
		return super.enableReplaceObject(enable);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#flush()
	 */
	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub
		super.flush();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#putFields()
	 */
	@Override
	public PutField putFields() throws IOException {
		// TODO Auto-generated method stub
		return super.putFields();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#replaceObject(java.lang.Object)
	 */
	@Override
	protected Object replaceObject(Object obj) throws IOException {
		// TODO Auto-generated method stub
		return super.replaceObject(obj);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#reset()
	 */
	@Override
	public void reset() throws IOException {
		// TODO Auto-generated method stub
		super.reset();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#useProtocolVersion(int)
	 */
	@Override
	public void useProtocolVersion(int version) throws IOException {
		// TODO Auto-generated method stub
		super.useProtocolVersion(version);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#write(byte[], int, int)
	 */
	@Override
	public void write(byte[] buf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		super.write(buf, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#write(byte[])
	 */
	@Override
	public void write(byte[] buf) throws IOException {
		// TODO Auto-generated method stub
		super.write(buf);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#write(int)
	 */
	@Override
	public void write(int val) throws IOException {
		// TODO Auto-generated method stub
		super.write(val);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeBoolean(boolean)
	 */
	@Override
	public void writeBoolean(boolean val) throws IOException {
		// TODO Auto-generated method stub
		super.writeBoolean(val);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeByte(int)
	 */
	@Override
	public void writeByte(int val) throws IOException {
		// TODO Auto-generated method stub
		super.writeByte(val);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeBytes(java.lang.String)
	 */
	@Override
	public void writeBytes(String str) throws IOException {
		// TODO Auto-generated method stub
		super.writeBytes(str);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeChar(int)
	 */
	@Override
	public void writeChar(int val) throws IOException {
		// TODO Auto-generated method stub
		super.writeChar(val);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeChars(java.lang.String)
	 */
	@Override
	public void writeChars(String str) throws IOException {
		// TODO Auto-generated method stub
		super.writeChars(str);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeClassDescriptor(java.io.ObjectStreamClass)
	 */
	@Override
	protected void writeClassDescriptor(ObjectStreamClass desc)
			throws IOException {
		// TODO Auto-generated method stub
		super.writeClassDescriptor(desc);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeDouble(double)
	 */
	@Override
	public void writeDouble(double val) throws IOException {
		// TODO Auto-generated method stub
		super.writeDouble(val);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeFields()
	 */
	@Override
	public void writeFields() throws IOException {
		// TODO Auto-generated method stub
		super.writeFields();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeFloat(float)
	 */
	@Override
	public void writeFloat(float val) throws IOException {
		// TODO Auto-generated method stub
		super.writeFloat(val);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeInt(int)
	 */
	@Override
	public void writeInt(int val) throws IOException {
		// TODO Auto-generated method stub
		super.writeInt(val);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeLong(long)
	 */
	@Override
	public void writeLong(long val) throws IOException {
		// TODO Auto-generated method stub
		super.writeLong(val);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeObjectOverride(java.lang.Object)
	 */
	@Override
	protected void writeObjectOverride(Object obj) throws IOException {
		// TODO Auto-generated method stub
		super.writeObjectOverride(obj);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeShort(int)
	 */
	@Override
	public void writeShort(int val) throws IOException {
		// TODO Auto-generated method stub
		super.writeShort(val);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeStreamHeader()
	 */
	@Override
	protected void writeStreamHeader() throws IOException {
		// TODO Auto-generated method stub
		super.writeStreamHeader();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeUnshared(java.lang.Object)
	 */
	@Override
	public void writeUnshared(Object obj) throws IOException {
		// TODO Auto-generated method stub
		super.writeUnshared(obj);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectOutputStream#writeUTF(java.lang.String)
	 */
	@Override
	public void writeUTF(String str) throws IOException {
		// TODO Auto-generated method stub
		super.writeUTF(str);
	}

	/**
	 * @throws IOException
	 * @throws SecurityException
	 */
	public ObjectOutputStream() throws IOException, SecurityException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param out
	 * @throws IOException
	 */
	public ObjectOutputStream(OutputStream out) throws IOException {
		super(out);
		// TODO Auto-generated constructor stub
	}

}
