1) Execute the project with fitnesse.FitNesse.
2) Modify the classpath..
	classpath: C:\Mohan\Tools\Repo\org\fitnesse\fitnesse\20080812\fitnesse-20080812.jar
	classpath: C:\Mohan\Tools\Repo\org\fitnesse\fitlibrary\20080812\fitnesse-20080812.jar
	classpath: target\classes
	
1) Watch our for URL when debugging.
http://192.168.1.103/DynaClasspathCalculatorTest?debug	

2) Ensure additional InheritDebugClassPathTestResponder configured for debug url to debug.


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