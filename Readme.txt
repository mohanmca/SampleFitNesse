Execute the project with fitnesse.FitNesse.

Modify the classpath..
	!path C:\Mohan\Tools\Repo\org\fitnesse\fitnesse\20140901\fitnesse-20140901.jar
	!path C:\Users\mohan\git\SampleFitNesse\target\classes
	
Watch out for URL when debugging.
	http://192.168.1.103/DynaClasspathCalculatorTest?debug	

Ensure additional InheritDebugClassPathTestResponder configured for debug url to debug.


Add following in Wiki 
* SampleTest 

And click the above link, and add following

!|com.nikias.SampleFitNesse.CalculatorFixture|
|first|second|sum?|product?|
|1|3|4|3|
|2|4|6|8|



Description...
first - method we are setting (input).
product? - method we are testing.