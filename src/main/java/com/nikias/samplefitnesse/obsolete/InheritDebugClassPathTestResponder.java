package com.nikias.samplefitnesse.obsolete;
//package com.nikias.SampleFitNesse;
//
//import fitnesse.responders.run.TestResponder;
//import fitnesse.wiki.PageData;
//
//public class InheritDebugClassPathTestResponder extends TestResponder {
//
//	private static final int DEBUG_PORT = 12000;
//
//	@Override
//	protected String buildCommand(PageData data, String program,
//			String classPath) throws Exception {
//		classPath = updateClasspath(classPath);
//
//		// return super.buildCommand(data, program, classPath);
//
//		String debugOption = "-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address="
//				+ DEBUG_PORT;
//
//		return "java " + debugOption + " -cp " + classPath + " " + program;
//	}
//
//	private String updateClasspath(String classPath) {
//		String parentCp = System.getProperty("java.class.path");
//		String[] cpElements = parentCp.split(System
//				.getProperty("path.separator"));
//
//		for (String cp : cpElements) {
//			classPath += System.getProperty("path.separator") + "\"" + cp
//					+ "\"";
//		}
//		return classPath;
//	}
//
//}
