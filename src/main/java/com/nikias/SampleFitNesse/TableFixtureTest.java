package com.nikias.SampleFitNesse;



import fitnesse.fixtures.TableFixture;

public class TableFixtureTest extends TableFixture{
	protected void doStaticTable(int rows) {
		 TaxCalculator tc=new TaxCalculator();
	      double totaltax = 0;

	      for (int row = 1; row < rows - 3; row++)
	      {
	        totaltax += tc.GetTax(getText(row, 1),
	          Double.parseDouble(getText(row, 2)));
	      }
	      double taxintable = Double.parseDouble(getText(rows - 2, 2));
	      if (taxintable == totaltax)
	        right(rows - 2, 2);
	      else
	        wrong(rows - 2, 2,String.valueOf(totaltax));
	    }
}