Execute the project with fitnesse.FitNesse.

Modify the classpath..
	!path C:\Mohan\Tools\Repo\org\fitnesse\fitnesse\20140901\fitnesse-20140901.jar
	!path C:\Users\mohan\git\SampleFitNesse\target\classes
	
Watch out for URL when debugging.
	http://192.168.1.103/DynaClasspathCalculatorTest?debug	

Ensure additional InheritDebugClassPathTestResponder configured for debug url to debug.

Remote Debugging

!define COMMAND_PATTERN {java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=1044 -cp %p %m}
!define REMOTE_DEBUG_COMMAND {java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000 -cp %p %m}

?responder=test&remote_debug=true

                                   
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