package com.vobject.appengine.java.io.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for com.vobject.appengine.java.io");
	
		suite.addTestSuite(FileTest.class);
		suite.addTestSuite(FileInputOutputStreamTest.class);
		
		return suite;
	}

}
