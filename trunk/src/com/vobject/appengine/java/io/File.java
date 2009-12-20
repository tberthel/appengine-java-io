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
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.vfs.FileObject;
import org.apache.commons.vfs.FileSystemException;
import org.apache.commons.vfs.FileType;


public class File {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2092369686030723158L;
	private GaeVFSFacade gaeVFS;
	private FileObject file;
	

	/**
	 * @param fileSystemManager the fileSystemManager to set
	 */
	public void setGaeVFSFacade(GaeVFSFacade gaeVFS) {
		this.gaeVFS = gaeVFS;
	}

	/**
	 * @param parent
	 * @param child
	 */
	public File(File parent, String child) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @param parent
	 * @param child
	 * @throws FileSystemException 
	 */
	public File(String parent, String child) {
		file = gaeVFS.resolveFile(parent + "/" + child);
	}

	/**
	 * @param pathname
	 * @throws FileSystemException 
	 */
	public File(String pathname) {
		file = gaeVFS.resolveFile(pathname);
	}

	/**
	 * @param uri
	 * @throws FileSystemException 
	 */
	public File(URI uri) {
		file = gaeVFS.resolveFile(uri.toString());
	}

	/* (non-Javadoc)
	 * @see java.io.File#canExecute()
	 */
	public boolean canExecute() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#canRead()
	 */

	public boolean canRead() {
		boolean canRead = false;
		
		try {
			canRead = file.isReadable();
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return canRead;
	}

	/* (non-Javadoc)
	 * @see java.io.File#canWrite()
	 */
	public boolean canWrite() {
		boolean canWrite = false;
		
		try {
			canWrite = file.isWriteable();
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return canWrite;
	}

	/* (non-Javadoc)
	 * @see java.io.File#compareTo(java.io.File)
	 */

	public int compareTo(java.io.File pathname) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#createNewFile()
	 */
	public boolean createNewFile() throws IOException {
		boolean isExist = file.exists();
		if (!isExist) {
			file.createFile();
		}
		return !isExist;
	}
	

	/* (non-Javadoc)
	 * @see java.io.File#delete()
	 */
	public boolean delete()  throws IOException {
		// TODO Auto-generated method stub
		return file.delete();
	}

	/* (non-Javadoc)
	 * @see java.io.File#deleteOnExit()
	 */

	public void deleteOnExit() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof java.io.File)) return false;
    	String fileObjectPath = file.getName().getPath();
    	return (((java.io.File)obj).getAbsolutePath().equals(fileObjectPath) &&
    	((java.io.File)obj).getName().equals(file.getName().getBaseName()));	
	}

	/* (non-Javadoc)
	 * @see java.io.File#exists()
	 */
	public boolean exists() {
		boolean isExist = false;
		
		try {
			isExist =  file.exists();
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isExist;
	}

	/* (non-Javadoc)
	 * @see java.io.File#getAbsoluteFile()
	 */
	public java.io.File getAbsoluteFile() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getAbsolutePath()
	 */

	public String getAbsolutePath() {
	    return file.getName().getPath();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getCanonicalFile()
	 */

	public java.io.File getCanonicalFile() throws IOException {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getCanonicalPath()
	 */

	public String getCanonicalPath() throws IOException {
		return file.getName().getPathDecoded();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getFreeSpace()
	 */
	public long getFreeSpace() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getName()
	 */

	public String getName() {
		return file.getName().getBaseName();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getParent()
	 */

	public String getParent() {
		String parentPath = null;
		try {
			parentPath = file.getParent().getName().getPath();
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parentPath;
	}

	/* (non-Javadoc)
	 * @see java.io.File#getParentFile()
	 */
	public java.io.File getParentFile() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getPath()
	 */
	public String getPath() {
		// TODO Auto-generated method stub
		return file.getName().getPath();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getTotalSpace()
	 */

	public long getTotalSpace() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#getUsableSpace()
	 */

	public long getUsableSpace() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#hashCode()
	 */

	public int hashCode() {
		return file.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.io.File#isAbsolute()
	 */
	public boolean isAbsolute() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#isDirectory()
	 */

	public boolean isDirectory() {
		boolean isDirectory = false;
		
		try {
			isDirectory = (file.getType() == FileType.FOLDER);
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isDirectory;
	}

	/* (non-Javadoc)
	 * @see java.io.File#isFile()
	 */
	public boolean isFile() {
		boolean isFile = false;
		
		try {
			isFile = (file.getType() == FileType.FILE);
		} catch (FileSystemException e) {
			e.printStackTrace();
		}
		
		return isFile;
	}

	/* (non-Javadoc)
	 * @see java.io.File#isHidden()
	 */
	public boolean isHidden() {
		boolean isHidden = false;
		try {
			isHidden = file.isHidden();
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isHidden;
	}

	/* (non-Javadoc)
	 * @see java.io.File#lastModified()
	 */
	public long lastModified() {
		long lastModified = 0;
		
		try {
			lastModified = file.getContent().getLastModifiedTime();
		} catch (FileSystemException e) {
			e.printStackTrace();
		}
		
		return lastModified;
	}

	/* (non-Javadoc)
	 * @see java.io.File#length()
	 */
	public long length() {
		long length = 0;
		
		try {
			length = file.getContent().getSize();
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return length;
	}

	/* (non-Javadoc)
	 * @see java.io.File#list()
	 */
	public String[] list() {
		String[] list = null;
		try {
			list = listChildrenAsStringArray(file, false);
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see java.io.File#list(java.io.FilenameFilter)
	 */
	public String[] list(FilenameFilter filter) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#listFiles()
	 */
	public java.io.File[] listFiles() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#listFiles(java.io.FileFilter)
	 */
	public java.io.File[] listFiles(FileFilter filter) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#listFiles(java.io.FilenameFilter)
	 */
	public java.io.File[] listFiles(FilenameFilter filter) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#mkdir()
	 */
	public boolean mkdir() {
		boolean mkdir = false;
		try {
			file.createFolder();
			mkdir = true;
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mkdir;
	}

	/* (non-Javadoc)
	 * @see java.io.File#mkdirs()
	 */
	public boolean mkdirs() {
		boolean mkdirs = false;
		try {
			file.createFolder();
			mkdirs = true;
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mkdirs;
	}

	/* (non-Javadoc)
	 * @see java.io.File#renameTo(java.io.File)
	 */
	public boolean renameTo(java.io.File dest) {
		boolean renameTo = false;
		try {
			file.moveTo(gaeVFS.toFileObject(dest));
			renameTo = true;
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return renameTo;
	}

	/* (non-Javadoc)
	 * @see java.io.File#setExecutable(boolean, boolean)
	 */
	public boolean setExecutable(boolean executable, boolean ownerOnly) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#setExecutable(boolean)
	 */
	public boolean setExecutable(boolean executable) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#setLastModified(long)
	 */

	public boolean setLastModified(long time) {
		boolean setLastModified = false;
		
		try {
			file.getContent().setLastModifiedTime(time);
			setLastModified = true;
		} catch (FileSystemException e) {
			e.printStackTrace();
		}
		return setLastModified;
	}

	/* (non-Javadoc)
	 * @see java.io.File#setReadable(boolean, boolean)
	 */
	public boolean setReadable(boolean readable, boolean ownerOnly) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#setReadable(boolean)
	 */
	public boolean setReadable(boolean readable) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#setReadOnly()
	 */
	public boolean setReadOnly() {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#setWritable(boolean, boolean)
	 */
	public boolean setWritable(boolean writable, boolean ownerOnly) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#setWritable(boolean)
	 */
	public boolean setWritable(boolean writable) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see java.io.File#toString()
	 */

	public String toString() {
		return getPath();
	}

	/* (non-Javadoc)
	 * @see java.io.File#toURI()
	 */
	public URI toURI() {
		URI uri = null;
		
		try {
			uri = new URI(file.getName().getURI());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return uri;
	}

	/* (non-Javadoc)
	 * @see java.io.File#toURL()
	 */
	public URL toURL() throws MalformedURLException {
		URL url = null;
		
		try {
			url = file.getURL();
		} catch (FileSystemException e) {
			e.printStackTrace();
		}
		
		return url;
	}

    /**
     * Lists the children of a folder.
     */
    private String[] listChildrenAsStringArray(final FileObject dir,
    						  				   final boolean recursive)
        throws FileSystemException
    {
    	if (dir.getType() == FileType.FOLDER) {
	        final FileObject[] children = dir.getChildren();
	        final List list = new ArrayList();
	        for (int i = 0; i < children.length; i++)
	        {
	            final FileObject child = children[i];
	            list.add(child.getName().getBaseName());
	            if (child.getType() == FileType.FOLDER)
	            {
	                if (recursive)
	                {
	                 	String[] childNames = listChildrenAsStringArray(child, recursive);
	                 	list.addAll(Arrays.asList(childNames));
	                }
	            }
	        }
	        return (String[])list.toArray(new String[0]);
    	} else {
    		return null;
    	}
    }	
}
