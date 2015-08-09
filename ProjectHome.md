# Introduction #
Google App Engine doesn't support Java IO writing operation natively. The VObject AppEngine Java-IO is an open source project that intend to port gaevfs to java.io API to enable java.io classes support in Google App Engine (GAE) with Metaprogramming capability of the Groovy Programming Language. The initial scope of java.io classes porting is the classes to be ported are listed under white list of [The JRE Class White List](http://code.google.com/appengine/docs/java/jrewhitelist.html) of Google App Engine, other classes will be ported as and when it is necessary.

**Note :** The project owner no longer support this project since 30 Dec 2010, if you would like to take over, please contact the project owner.

# Release History #
**01 Feb 2010: appengine-java-io 0.1.0 and appengine-java-io-metaclass 0.1.0 released. ([Release Note](http://code.google.com/p/appengine-java-io/wiki/ReleaseNoteZeroDotOneDotZero))**

# Feasibility #
It is possible to extend java.io classes with Groovy Meta Programming capability. [Groovy JDK (GDK)](http://groovy.codehaus.org/groovy-jdk/) is good show case for feasibility of this project.

# Motivation #
The project kick off with following motivations:
  * Google App Engine Java project able to perform file operation using java.io classes in Virtual File System (VFS) like Google App Engine support file operation natively.
  * Java developer need not to learn new [GAEVFS](http://code.google.com/p/gaevfs/)/[Apache Commons VFS](http://commons.apache.org/vfs/) API, instead using the familiar Java IO API for file operation in Google App Engine.
  * All applications and java library built on top of Java IO API can run in Google App Engine without any code changes, eg: [super file upload grails plugin](http://www.grails.org/plugin/super-file-upload)

# Road Map #
## Version 0.1.0: ##
~~Able to run super file upload grails plugin in Google App Engine without code modification of the plugin.~~
Created a multiple files upload (with [Uploadify Plugin](http://www.uploadify.com/)) grails application called [VObject File Manager](http://vobject-file-manager.appspot.com/).

## Version 0.5.0: ##
Support all common (frequently used) Java IO classes which mentioned in Thinking in Java 4th Edition. Please refer to [JavaIOSupportedClasses](http://code.google.com/p/appengine-java-io/wiki/JavaIOSupportedClasses) for more information.

## Version 1.0.0: ##
Support all Java IO classes listed in  [The JRE Class White List](http://code.google.com/appengine/docs/java/jrewhitelist.html) of Google App Engine.

# References #
<p>1) Extend the JDK Classes with Jakarta Commons, Part III - VFS<br>
<br /><a href='http://www.devx.com/Java/Article/30117/0/page/2'>http://www.devx.com/Java/Article/30117/0/page/2</a></p>
<p>2) Writing code that runs unmodified in either GAE or non-GAE environments.<br>
<br /> <a href='http://code.google.com/p/gaevfs/wiki/ApplicationPortability'>http://code.google.com/p/gaevfs/wiki/ApplicationPortability</a></p>