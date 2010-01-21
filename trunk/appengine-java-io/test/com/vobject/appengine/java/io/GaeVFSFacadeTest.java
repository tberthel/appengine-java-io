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

import org.apache.commons.vfs.FileSystemException;
import org.apache.commons.vfs.FileType;

import com.newatlanta.appengine.junit.vfs.gae.GaeVfsTestCase;
import com.vobject.appengine.java.io.GaeVFSFacade;

import junit.framework.TestCase;

public class GaeVFSFacadeTest extends GaeVfsTestCase {
	private GaeVFSFacade gaeVFS;
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	public void setUp() throws Exception {
		super.setUp();
		gaeVFS = GaeVFSFacade.getInstance();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	public void tearDown() throws Exception {
		gaeVFS = null;
		super.tearDown();
	}


	public void testIsGaeSchemeSupported() {
		String[] schemes = gaeVFS.getSchemes();
		boolean foundGae = false;
		for (int i = 0; i < schemes.length; i++) {
			if (schemes[i].equals("gae")) {
				foundGae = true;
				break;
			}
		}
		assertTrue(foundGae);
	}


	public void testGetBaseFile() throws Exception {
		assertTrue (gaeVFS.getBaseFile().getType() == FileType.FOLDER );
	}

}
