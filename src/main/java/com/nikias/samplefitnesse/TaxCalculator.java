package com.nikias.samplefitnesse;

public class TaxCalculator {

	public double GetTax(String text, double parseDouble) {
		return (text.equals("ERDR-GX330") ? parseDouble * 0.1 : 0);
	}

}
