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
import java.lang.reflect.Constructor;
import java.net.URLStreamHandlerFactory;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.vfs.CacheStrategy;
import org.apache.commons.vfs.FileContent;
import org.apache.commons.vfs.FileContentInfoFactory;
import org.apache.commons.vfs.FileName;
import org.apache.commons.vfs.FileObject;
import org.apache.commons.vfs.FileSystem;
import org.apache.commons.vfs.FileSystemConfigBuilder;
import org.apache.commons.vfs.FileSystemException;
import org.apache.commons.vfs.FileSystemManager;
import org.apache.commons.vfs.FileSystemOptions;
import org.apache.commons.vfs.FileType;
import org.apache.commons.vfs.FilesCache;
import org.apache.commons.vfs.NameScope;
import org.apache.commons.vfs.operations.FileOperationProvider;

import com.newatlanta.appengine.vfs.provider.GaeVFS;


public class GaeVFSFacade implements FileSystemManager {
	private static GaeVFSFacade gaeVfsFacade;
	private FileSystemManager fsManager;
	
	static GaeVFSFacade getInstance() {
		if (gaeVfsFacade == null) {
			gaeVfsFacade = new GaeVFSFacade();
			gaeVfsFacade.initialize();
		} 
		return gaeVfsFacade;
	}
	
    private void initialize() {
		//GaeVFS.setRootPath( "/" );
        try {
			fsManager = GaeVFS.getManager();
		} catch (FileSystemException e) {
			throw new RuntimeException (e);
		}
		//fsManager = GaeVFS.getManager().setCombinedLocal( false );
        //currentDir = fsManager.resolveFile("cheekin1");
	}

	/**
     * Does an 'ls' command.
     
    void ls() throws FileSystemException
    {
        final boolean recursive = true;

        final FileObject file;

        file = currentDir;

        if (file.exists()) {
	        if (file.getType() == FileType.FOLDER)
	        {
	            // List the contents
	            System.out.println("Contents of " + file.getName());
	            listChildren(file, recursive, "");
	        }
	        else
	        {
	            // Stat the file
	            System.out.println(file.getName());
	            final FileContent content = file.getContent();
	            System.out.println("Size: " + content.getSize() + " bytes.");
	            final DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
	            final String lastMod = dateFormat.format(new Date(content.getLastModifiedTime()));
	            System.out.println("Last modified: " + lastMod);
	        } 
        } else {
        	System.out.println("Folder not found. Creating the folder.");
            file.createFolder();
            fsManager.resolveFile("cheekin1/sample.txt").createFile();
        }
  
    }	
    */
    /**
     * Lists the children of a folder.
     
    private void listChildren(final FileObject dir,
                              final boolean recursive,
                              final String prefix)
        throws FileSystemException
    {
        final FileObject[] children = dir.getChildren();
        for (int i = 0; i < children.length; i++)
        {
            final FileObject child = children[i];
            System.out.print(prefix);
            System.out.print(child.getName().getBaseName());
            if (child.getType() == FileType.FOLDER)
            {
                System.out.println("/");
                if (recursive)
                {
                    listChildren(child, recursive, prefix + "    ");
                }
            }
            else
            {
                System.out.println();
            }
        }
    }

*/
	public void addOperationProvider(String arg0, FileOperationProvider arg1)
			throws FileSystemException {
		fsManager.addOperationProvider(arg0, arg1);
		
	}

	public void addOperationProvider(String[] arg0, FileOperationProvider arg1)
			throws FileSystemException {
		fsManager.addOperationProvider(arg0, arg1);
		
	}


	public boolean canCreateFileSystem(FileObject arg0)
			throws FileSystemException {
		return fsManager.canCreateFileSystem(arg0);
	}

	public void closeFileSystem(FileSystem arg0) {
		fsManager.closeFileSystem(arg0);
		
	}

	public FileObject createFileSystem(FileObject arg0)
			throws FileSystemException {
		return fsManager.createFileSystem(arg0);
	}

	public FileObject createFileSystem(String arg0, FileObject arg1)
			throws FileSystemException {
		return fsManager.createFileSystem(arg0, arg1);
	}


	public FileObject createVirtualFileSystem(String arg0)
			throws FileSystemException {
		return fsManager.createVirtualFileSystem(arg0);
	}


	public FileObject createVirtualFileSystem(FileObject arg0)
			throws FileSystemException {
		return fsManager.createVirtualFileSystem(arg0);
	}

	public FileObject getBaseFile() {
		try {
			return fsManager.getBaseFile();
		} catch (FileSystemException e) {
			
			throw new RuntimeException(e);
		}
	}

	public CacheStrategy getCacheStrategy() {
		return fsManager.getCacheStrategy();
	}

	public FileContentInfoFactory getFileContentInfoFactory() {
		return fsManager.getFileContentInfoFactory();
	}

	public Class getFileObjectDecorator() {
		return fsManager.getFileObjectDecorator();
	}

	public Constructor getFileObjectDecoratorConst() {
		return fsManager.getFileObjectDecoratorConst();
	}


	public FileSystemConfigBuilder getFileSystemConfigBuilder(String arg0)
			throws FileSystemException {

		return fsManager.getFileSystemConfigBuilder(arg0);
	}


	public FilesCache getFilesCache() {
		return fsManager.getFilesCache();
	}


	public FileOperationProvider[] getOperationProviders(String arg0)
			throws FileSystemException {
		return fsManager.getOperationProviders(arg0);
	}


	public Collection getProviderCapabilities(String arg0)
			throws FileSystemException {
		return fsManager.getProviderCapabilities(arg0);
	}

	public String[] getSchemes() {
		return fsManager.getSchemes();
	}


	public URLStreamHandlerFactory getURLStreamHandlerFactory() {
		return fsManager.getURLStreamHandlerFactory();
	}

	public boolean hasProvider(String arg0) {
		return fsManager.hasProvider(arg0);
	}

	public FileObject resolveFile(String arg0) {
		FileObject file = null;
		try {
			file = fsManager.resolveFile(arg0);
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}

	public FileObject resolveFile(String arg0, FileSystemOptions arg1) {
		FileObject file = null;
		try {
			file = fsManager.resolveFile(arg0, arg1);
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}


	public FileObject resolveFile(FileObject arg0, String arg1) {
		FileObject file = null;
		try {
			file = fsManager.resolveFile(arg0, arg1);
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}


	public FileObject resolveFile(File arg0, String arg1) {
		FileObject file = null;
		try {
			file = fsManager.resolveFile(arg0, arg1);
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}


	public FileName resolveName(FileName arg0, String arg1)
			throws FileSystemException {
		return fsManager.resolveName(arg0, arg1);
	}

	public FileName resolveName(FileName arg0, String arg1, NameScope arg2)
			throws FileSystemException {
		return fsManager.resolveName(arg0, arg1, arg2);
	}


	public FileName resolveURI(String arg0) throws FileSystemException {
		return fsManager.resolveURI(arg0);
	}

	public void setLogger(Log arg0) {
		fsManager.setLogger(arg0);
	}

	public FileObject toFileObject(File arg0) throws FileSystemException {
		return fsManager.toFileObject(arg0);
	}    
}
