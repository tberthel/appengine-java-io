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
package com.vobject.appengine.java.io.test;

import com.newatlanta.appengine.junit.vfs.gae.GaeVfsTestCase;
import groovy.runtime.metaclass.com.vobject.JavaIODelegatingMetaClassesInvoker

public class FileOutputStreamTest extends GaeVfsTestCase {
	public void setUp() throws Exception {
		super.setUp()
		JavaIODelegatingMetaClassesInvoker.register()
	}
	
	public void testWriteFileToDisk() throws Exception {
		def out
		def dest
		try {
			dest = new File("textFile.txt")
			//assertTrue (dest.length() == 0)	
			//Construct the BufferedOutputStream object
			out = new FileOutputStream(dest)
			//Start writing to the output stream
			out.write("Line one".getBytes())
			out.write("\n".getBytes()) //new line, you might want to use \r\n if you're on Windows
			out.write("Line two".getBytes())
			out.write("\n".getBytes())
				
		} finally {
			//Close the BufferedOutputStream
			try {
				if (out != null) {
					out.close()
					out = null
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}			
		assertTrue (dest.length() > 0)	
	}
}
