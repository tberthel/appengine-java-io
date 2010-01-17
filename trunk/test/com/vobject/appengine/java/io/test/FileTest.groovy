package com.vobject.appengine.java.io.test

import com.newatlanta.appengine.junit.vfs.gae.GaeVfsTestCase
import java.util.regex.*


class FileTest extends GaeVfsTestCase {

	private final static String[] FILES = [
		"1.java",
		"2.java",
		"3.java",
		"1.txt",
		"2.txt",
	]
	
	private final static String[] JAVA_FILES = [
			"1.java",
			"2.java",
			"3.java"
	]	
	
	private final static String[] TEXT_FILES = [
			"1.txt",
			"2.txt"
	]	
	
	public void setUp() throws Exception {
		super.setUp()
	}
	
	
	public void tearDown() throws Exception {
		// super.tearDown() // ???: calling super.tearDown causing error for test cases
	}
	
	
	private void createFiles() {
		for (int i = 0; i < FILES.length; i++) {
			def file = new File(FILES[i])
			assertTrue (file.createNewFile())
			file = null
		}
	}
	
	private void deleteFiles() {
		for (int i = 0; i < FILES.length; i++) {
			def file = new File(FILES[i])
			assertTrue (file.delete())
			file = null
		}				
	}	

	void testDirListAllFiles() {
		createFiles()
		def currentDir = new File(".")
		assertTrue (currentDir.exists())
		String[] list
		list = currentDir.list()
		//Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(int i = 0; i < FILES.length; i++) {
			assertEquals(FILES[i], list[i]);
		}
		deleteFiles()							
	}
	
	void testDirListFilesByFilter() {
		createFiles()
		def currentDir = new File(".")
		assertTrue (currentDir.exists())
		String[] list
		list = currentDir.list(new DirFilter(".*\\.java"))
		//Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(int i = 0; i < list.length; i++) {
			//System.out.println(list[i])
			assertEquals(JAVA_FILES[i], list[i])
		}
		
		list = currentDir.list(new DirFilter(".*\\.txt"))
		//Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(int i = 0; i < list.length; i++) {
			//System.out.println(list[i])
			assertEquals(TEXT_FILES[i], list[i])
		}		
		
		deleteFiles()				
	}	
}

class DirFilter implements FilenameFilter {
	private Pattern pattern;
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}
	public boolean accept(File dir, String name) {
		return pattern.matcher(name).matches();
	}
}	