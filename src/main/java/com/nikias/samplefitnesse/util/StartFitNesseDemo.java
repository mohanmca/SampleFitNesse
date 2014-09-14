package com.nikias.samplefitnesse.util;

import fitnesseMain.FitNesseMain;

public class StartFitNesseDemo {
	public static void main(String[] args) throws Exception {
		String[] fitNesseArguments = "-v -l C:\\Log\\Users\\mohan\\git\\SampleFitNesse\\log\\ -d C:\\Log\\Users\\mohan\\git\\SampleFitNesse\\".split(" ");
		String[] hsqlDbArguments = "-database.0 file:mydb;user=test;password=test -dbname.0 xdb --port 9001".split(" ");
		FitNesseMain.main(fitNesseArguments);
		org.hsqldb.Server.main(hsqlDbArguments);
	}
}
