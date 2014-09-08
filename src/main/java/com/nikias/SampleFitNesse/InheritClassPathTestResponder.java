package com.nikias.SampleFitNesse;

import fitnesse.responders.run.TestResponder;
import fitnesse.wiki.PageData;

public class InheritClassPathTestResponder extends TestResponder {
	@Override
	protected String buildCommand(PageData data, String program,
			String classPath) throws Exception {
		classPath = updateClasspath(classPath);
		
		return super.buildCommand(data, program, classPath);
	}

	private String updateClasspath(String classPath) {
		String parentCp = System.getProperty("java.class.path");
		String[] cpElements = parentCp.split(System.getProperty("path.separator"));
		
		for(String cp : cpElements) {
			classPath += System.getProperty("path.separator") + "\"" +  cp + "\"";
		}
		return classPath;
	}
}
