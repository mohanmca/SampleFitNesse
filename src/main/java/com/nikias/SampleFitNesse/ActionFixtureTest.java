package com.nikias.SampleFitNesse;


public class ActionFixtureTest extends fit.Fixture{
	private String first, second, both;
	public void firstPart(String s){
		first=s;
	}
	public void  secondPart(String s){
		second=s;
	}
	public void join(){
		both=first+ ", "+second;
	}
	public String together(){
		return both;
	}
}