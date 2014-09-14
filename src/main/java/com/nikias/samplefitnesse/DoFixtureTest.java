package com.nikias.samplefitnesse;

import java.util.Arrays;
import fitlibrary.DoFixture;

public class DoFixtureTest extends DoFixture {
	public String letters;

	public void fillTimesWith(int count, char c) {
		char[] arr = new char[count];
		Arrays.fill(arr, c);
		letters = new String(arr);
	}

	public boolean charAtIs(int position, char c) {
		return letters.charAt(position) == c;
	}

	public void setList(char[] array) {
		letters = new String(array);
	}

	public char charAt(int position) {
		return letters.charAt(position);
	}
}