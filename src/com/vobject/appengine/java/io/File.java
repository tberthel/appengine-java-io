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

import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class File extends java.io.File {

	/**
	 * @param parent
	 * @param child
	 */
	public File(File parent, String child) {
		super(parent, child);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parent
	 * @param child
	 */
	public File(String parent, String child) {
		super(parent, child);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param pathname
	 */
	public File(String pathname) {
		super(pathname);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uri
	 */
	public File(URI uri) {
		super(uri);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.io.File#canExecute()
	 */
	@Override
	public boolean canExecute() {
		// TODO Auto-generated method stub
		return super.canExecute();
	}

	/* (non-Javadoc)
	 * @see java.io.File#canRead()
	 */
	@Override
	public boolean canRead() {
		// TODO Auto-generated method stub
		return super.canRead();
	}

	/* (non-Javadoc)
	 * @see java.io.File#canWrite()
	 */
	@Override
	public boolean canWrite() {
		// TODO Auto-generated method stub
		return super.canWrite();
	}

	/* (non-Javadoc)
	 * @see java.io.File#compareTo(java.io.File)
	 */
	@Override
	public int compareTo(java.io.File pathname) {
		// TODO Auto-generated method stub
		return super.compareTo(pathname);
	}

	/* (non-Javadoc)
	 * @see java.io.File#createNewFile()
	 */
	@Override
	public boolean createNewFile() throws IOException {
		// TODO Auto-generated method stub
		return super.createNewFile();
	}

	/* (non-Javadoc)
	 * @see java.io.File#delete()
	 */
	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return super.delete();
	}

	/* (non-Javadoc)
	 * @see java.io.File#deleteOnExit()
	 */
	@Override
	public void deleteOnExit() {
		// TODO Auto-generated method stub
		super.deleteOnExit();
	}

	/* (non-Javadoc)
	 * @see java.io.File#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	/* (non-Javadoc)
	 * @see java.io.File#exists()
	 */
	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return super.exists();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getAbsoluteFile()
	 */
	@Override
	public java.io.File getAbsoluteFile() {
		// TODO Auto-generated method stub
		return super.getAbsoluteFile();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getAbsolutePath()
	 */
	@Override
	public String getAbsolutePath() {
		// TODO Auto-generated method stub
		return super.getAbsolutePath();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getCanonicalFile()
	 */
	@Override
	public java.io.File getCanonicalFile() throws IOException {
		// TODO Auto-generated method stub
		return super.getCanonicalFile();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getCanonicalPath()
	 */
	@Override
	public String getCanonicalPath() throws IOException {
		// TODO Auto-generated method stub
		return super.getCanonicalPath();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getFreeSpace()
	 */
	@Override
	public long getFreeSpace() {
		// TODO Auto-generated method stub
		return super.getFreeSpace();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getParent()
	 */
	@Override
	public String getParent() {
		// TODO Auto-generated method stub
		return super.getParent();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getParentFile()
	 */
	@Override
	public java.io.File getParentFile() {
		// TODO Auto-generated method stub
		return super.getParentFile();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getPath()
	 */
	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return super.getPath();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getTotalSpace()
	 */
	@Override
	public long getTotalSpace() {
		// TODO Auto-generated method stub
		return super.getTotalSpace();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getUsableSpace()
	 */
	@Override
	public long getUsableSpace() {
		// TODO Auto-generated method stub
		return super.getUsableSpace();
	}

	/* (non-Javadoc)
	 * @see java.io.File#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.io.File#isAbsolute()
	 */
	@Override
	public boolean isAbsolute() {
		// TODO Auto-generated method stub
		return super.isAbsolute();
	}

	/* (non-Javadoc)
	 * @see java.io.File#isDirectory()
	 */
	@Override
	public boolean isDirectory() {
		// TODO Auto-generated method stub
		return super.isDirectory();
	}

	/* (non-Javadoc)
	 * @see java.io.File#isFile()
	 */
	@Override
	public boolean isFile() {
		// TODO Auto-generated method stub
		return super.isFile();
	}

	/* (non-Javadoc)
	 * @see java.io.File#isHidden()
	 */
	@Override
	public boolean isHidden() {
		// TODO Auto-generated method stub
		return super.isHidden();
	}

	/* (non-Javadoc)
	 * @see java.io.File#lastModified()
	 */
	@Override
	public long lastModified() {
		// TODO Auto-generated method stub
		return super.lastModified();
	}

	/* (non-Javadoc)
	 * @see java.io.File#length()
	 */
	@Override
	public long length() {
		// TODO Auto-generated method stub
		return super.length();
	}

	/* (non-Javadoc)
	 * @see java.io.File#list()
	 */
	@Override
	public String[] list() {
		// TODO Auto-generated method stub
		return super.list();
	}

	/* (non-Javadoc)
	 * @see java.io.File#list(java.io.FilenameFilter)
	 */
	@Override
	public String[] list(FilenameFilter filter) {
		// TODO Auto-generated method stub
		return super.list(filter);
	}

	/* (non-Javadoc)
	 * @see java.io.File#listFiles()
	 */
	@Override
	public java.io.File[] listFiles() {
		// TODO Auto-generated method stub
		return super.listFiles();
	}

	/* (non-Javadoc)
	 * @see java.io.File#listFiles(java.io.FileFilter)
	 */
	@Override
	public java.io.File[] listFiles(FileFilter filter) {
		// TODO Auto-generated method stub
		return super.listFiles(filter);
	}

	/* (non-Javadoc)
	 * @see java.io.File#listFiles(java.io.FilenameFilter)
	 */
	@Override
	public java.io.File[] listFiles(FilenameFilter filter) {
		// TODO Auto-generated method stub
		return super.listFiles(filter);
	}

	/* (non-Javadoc)
	 * @see java.io.File#mkdir()
	 */
	@Override
	public boolean mkdir() {
		// TODO Auto-generated method stub
		return super.mkdir();
	}

	/* (non-Javadoc)
	 * @see java.io.File#mkdirs()
	 */
	@Override
	public boolean mkdirs() {
		// TODO Auto-generated method stub
		return super.mkdirs();
	}

	/* (non-Javadoc)
	 * @see java.io.File#renameTo(java.io.File)
	 */
	@Override
	public boolean renameTo(java.io.File dest) {
		// TODO Auto-generated method stub
		return super.renameTo(dest);
	}

	/* (non-Javadoc)
	 * @see java.io.File#setExecutable(boolean, boolean)
	 */
	@Override
	public boolean setExecutable(boolean executable, boolean ownerOnly) {
		// TODO Auto-generated method stub
		return super.setExecutable(executable, ownerOnly);
	}

	/* (non-Javadoc)
	 * @see java.io.File#setExecutable(boolean)
	 */
	@Override
	public boolean setExecutable(boolean executable) {
		// TODO Auto-generated method stub
		return super.setExecutable(executable);
	}

	/* (non-Javadoc)
	 * @see java.io.File#setLastModified(long)
	 */
	@Override
	public boolean setLastModified(long time) {
		// TODO Auto-generated method stub
		return super.setLastModified(time);
	}

	/* (non-Javadoc)
	 * @see java.io.File#setReadable(boolean, boolean)
	 */
	@Override
	public boolean setReadable(boolean readable, boolean ownerOnly) {
		// TODO Auto-generated method stub
		return super.setReadable(readable, ownerOnly);
	}

	/* (non-Javadoc)
	 * @see java.io.File#setReadable(boolean)
	 */
	@Override
	public boolean setReadable(boolean readable) {
		// TODO Auto-generated method stub
		return super.setReadable(readable);
	}

	/* (non-Javadoc)
	 * @see java.io.File#setReadOnly()
	 */
	@Override
	public boolean setReadOnly() {
		// TODO Auto-generated method stub
		return super.setReadOnly();
	}

	/* (non-Javadoc)
	 * @see java.io.File#setWritable(boolean, boolean)
	 */
	@Override
	public boolean setWritable(boolean writable, boolean ownerOnly) {
		// TODO Auto-generated method stub
		return super.setWritable(writable, ownerOnly);
	}

	/* (non-Javadoc)
	 * @see java.io.File#setWritable(boolean)
	 */
	@Override
	public boolean setWritable(boolean writable) {
		// TODO Auto-generated method stub
		return super.setWritable(writable);
	}

	/* (non-Javadoc)
	 * @see java.io.File#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	/* (non-Javadoc)
	 * @see java.io.File#toURI()
	 */
	@Override
	public URI toURI() {
		// TODO Auto-generated method stub
		return super.toURI();
	}

	/* (non-Javadoc)
	 * @see java.io.File#toURL()
	 */
	@Override
	public URL toURL() throws MalformedURLException {
		// TODO Auto-generated method stub
		return super.toURL();
	}

}
