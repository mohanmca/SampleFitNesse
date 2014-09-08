package com.nikias.SampleFitNesse;

import fit.*;

public class CalculatorFixture extends ColumnFixture {
	public int first;
	public int second;

	public int sum() {
		return first + second;
	}

	public int product() {
		return first * second;
	}

}
