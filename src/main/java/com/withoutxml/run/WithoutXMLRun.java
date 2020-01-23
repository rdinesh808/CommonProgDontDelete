package com.withoutxml.run;

import java.util.*;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlDefine;
import org.testng.xml.XmlDependencies;
import org.testng.xml.XmlGroups;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlRun;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.testng.TestNG_1;

public class WithoutXMLRun {
 public static void main(String[] args) {
	 
	 List<XmlSuite> suites = new ArrayList<XmlSuite>();
	    XmlSuite suite = new XmlSuite();
	    suites.add(suite);
	    suite.setName("MYSUITE");

	    List<XmlClass> classes = new ArrayList<XmlClass>();
	    XmlClass clz = new XmlClass();
	    clz.setClass(TestNG_1.class);
	    classes.add(clz);

	    XmlTest test = new XmlTest(suite);
	    test.setClasses(classes);
	    test.setName("New Test");
	    test.addIncludedGroup("reg");
	    
	  
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("name", "Chaur");

	    test.setParameters(params);
	    

//	    XmlInclude testLogin = new XmlInclude("reg");
//
//	    List<XmlInclude> includes = new ArrayList<XmlInclude>();
//	    includes.add(testLogin);
//
//	    clz.setIncludedMethods(includes);


	    TestNG testNg = new TestNG();
	    testNg.setXmlSuites(suites);
	    testNg.run();


}
}
