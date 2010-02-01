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
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.ObjectInputValidation;
import java.io.ObjectStreamClass;
import java.io.StreamCorruptedException;

public class ObjectInputStream extends java.io.ObjectInputStream {

	/**
	 * @throws IOException
	 * @throws SecurityException
	 */
	public ObjectInputStream() throws IOException, SecurityException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param in
	 * @throws IOException
	 */
	public ObjectInputStream(InputStream in) throws IOException {
		super(in);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#available()
	 */
	@Override
	public int available() throws IOException {
		// TODO Auto-generated method stub
		return super.available();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#close()
	 */
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		super.close();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#defaultReadObject()
	 */
	@Override
	public void defaultReadObject() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		super.defaultReadObject();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#enableResolveObject(boolean)
	 */
	@Override
	protected boolean enableResolveObject(boolean enable)
			throws SecurityException {
		// TODO Auto-generated method stub
		return super.enableResolveObject(enable);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#read()
	 */
	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		return super.read();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#read(byte[], int, int)
	 */
	@Override
	public int read(byte[] buf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return super.read(buf, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readBoolean()
	 */
	@Override
	public boolean readBoolean() throws IOException {
		// TODO Auto-generated method stub
		return super.readBoolean();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readByte()
	 */
	@Override
	public byte readByte() throws IOException {
		// TODO Auto-generated method stub
		return super.readByte();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readChar()
	 */
	@Override
	public char readChar() throws IOException {
		// TODO Auto-generated method stub
		return super.readChar();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readClassDescriptor()
	 */
	@Override
	protected ObjectStreamClass readClassDescriptor() throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.readClassDescriptor();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readDouble()
	 */
	@Override
	public double readDouble() throws IOException {
		// TODO Auto-generated method stub
		return super.readDouble();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readFields()
	 */
	@Override
	public GetField readFields() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.readFields();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readFloat()
	 */
	@Override
	public float readFloat() throws IOException {
		// TODO Auto-generated method stub
		return super.readFloat();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readFully(byte[], int, int)
	 */
	@Override
	public void readFully(byte[] buf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		super.readFully(buf, off, len);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readFully(byte[])
	 */
	@Override
	public void readFully(byte[] buf) throws IOException {
		// TODO Auto-generated method stub
		super.readFully(buf);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readInt()
	 */
	@Override
	public int readInt() throws IOException {
		// TODO Auto-generated method stub
		return super.readInt();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readLine()
	 */
	@Override
	public String readLine() throws IOException {
		// TODO Auto-generated method stub
		return super.readLine();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readLong()
	 */
	@Override
	public long readLong() throws IOException {
		// TODO Auto-generated method stub
		return super.readLong();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readObjectOverride()
	 */
	@Override
	protected Object readObjectOverride() throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.readObjectOverride();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readShort()
	 */
	@Override
	public short readShort() throws IOException {
		// TODO Auto-generated method stub
		return super.readShort();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readStreamHeader()
	 */
	@Override
	protected void readStreamHeader() throws IOException,
			StreamCorruptedException {
		// TODO Auto-generated method stub
		super.readStreamHeader();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readUnshared()
	 */
	@Override
	public Object readUnshared() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.readUnshared();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readUnsignedByte()
	 */
	@Override
	public int readUnsignedByte() throws IOException {
		// TODO Auto-generated method stub
		return super.readUnsignedByte();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readUnsignedShort()
	 */
	@Override
	public int readUnsignedShort() throws IOException {
		// TODO Auto-generated method stub
		return super.readUnsignedShort();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#readUTF()
	 */
	@Override
	public String readUTF() throws IOException {
		// TODO Auto-generated method stub
		return super.readUTF();
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#registerValidation(java.io.ObjectInputValidation, int)
	 */
	@Override
	public void registerValidation(ObjectInputValidation obj, int prio)
			throws NotActiveException, InvalidObjectException {
		// TODO Auto-generated method stub
		super.registerValidation(obj, prio);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#resolveClass(java.io.ObjectStreamClass)
	 */
	@Override
	protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.resolveClass(desc);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#resolveObject(java.lang.Object)
	 */
	@Override
	protected Object resolveObject(Object obj) throws IOException {
		// TODO Auto-generated method stub
		return super.resolveObject(obj);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#resolveProxyClass(java.lang.String[])
	 */
	@Override
	protected Class<?> resolveProxyClass(String[] interfaces)
			throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.resolveProxyClass(interfaces);
	}

	/* (non-Javadoc)
	 * @see java.io.ObjectInputStream#skipBytes(int)
	 */
	@Override
	public int skipBytes(int len) throws IOException {
		// TODO Auto-generated method stub
		return super.skipBytes(len);
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

}
