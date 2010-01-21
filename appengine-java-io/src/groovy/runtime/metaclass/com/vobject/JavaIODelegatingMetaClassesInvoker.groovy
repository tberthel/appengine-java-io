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
package groovy.runtime.metaclass.com.vobject

import org.codehaus.groovy.runtime.InvokerHelper
import static PrintUtil.*


class JavaIODelegatingMetaClassesInvoker {
	static def classPairs = [ 
	    "com.vobject.appengine.java.io.File":File.class,
	    "com.vobject.appengine.java.io.FileOutputStream":FileOutputStream.class	    
	] 	
	
	static void register() {		
		classPairs.each { key, value ->
			InvokerHelper.metaRegistry.setMetaClass(value, new JavaIODelegatingMetaClass(value, key))
		}
	}
}

class JavaIODelegatingMetaClass extends DelegatingMetaClass {
	private String implementClassName
	
	JavaIODelegatingMetaClass(Class delegate, String implementClassName) {
		super(delegate)
		initialize()	
		this.implementClassName = implementClassName
	}
	
	Object invokeConstructor(Object[] arguments) {
		printInvokeMethodEnter("invokeConstructor", null, null, arguments)
		Object returnValue = Class.forName(implementClassName).newInstance (arguments)
		printInvokeMethodExit("invokeConstructor", returnValue)
		return returnValue
	}		
}
