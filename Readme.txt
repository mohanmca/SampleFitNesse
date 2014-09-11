For older versions - Execute the project with fitnesse.FitNesse.
For newer versions -  fitnesseMain.FitNesseMain
Argruments..
	-v  -l C:\Log\Users\mohan\git\SampleFitNesse\log\ -d C:\Log\Users\mohan\git\SampleFitNesse\

Modify the classpath..
	!path C:\Mohan\Tools\Repo\org\fitnesse\fitnesse\20140901\fitnesse-20140901.jar
	!path C:\Users\mohan\git\SampleFitNesse\target\classes
	

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

------------------
From Fresh
_________________


!path C:\Mohan\Tools\Repo\org\fitnesse\fitnesse\20140901\fitnesse-20140901.jar
!path C:\Users\mohan\git\SampleFitNesse\target\classes
!path C:\Users\mohan\git\SampleFitNesse\target\test-classes

Let us test the whole

* TestSuite


!contents -R2 -g -p -f -h

_________________


* SampleTest
* TableFixtureTest
* SayHiTest



_________________


!path C:\Mohan\Tools\Repo\org\fitnesse\fitnesse\20140901\fitnesse-20140901.jar
!path C:\Users\mohan\git\SampleFitNesse\target\classes
!define REMOTE_DEBUG_COMMAND {java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000 -cp %p %m}


!contents -R2 -g -p -f -h

!|com.nikias.SampleFitNesse.CalculatorFixture|
|first|second|sum?|product?|
|1|3|4|3|
|2|4|6|8|


_________________

!path C:\Mohan\Tools\Repo\org\fitnesse\fitnesse\20140901\fitnesse-20140901.jar
!path C:\Users\mohan\git\SampleFitNesse\target\classes
!define TEST_SYSTEM {slim}
!contents -R2 -g -p -f -h


!|com.nikias.SampleFitNesse.TableFixtureTest|
|Item|Product code|Price|
|Pragmatic Programmer|B978-0201616224|34.03|
|Sony RDR-GX330|ERDR-GX330|94.80|
|Test Driven Development By Example|B978-0321146533|32.39|
|Net Total||161.22|
|Tax (10% on applicable items)||9.48|
|Total||170.70|



_________________


!path C:\Mohan\Tools\Repo\org\fitnesse\fitnesse\20140901\fitnesse-20140901.jar
!path C:\Users\mohan\git\SampleFitNesse\target\classes
!define REMOTE_DEBUG_COMMAND {java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000 -cp %p %m}


!contents -R2 -g -p -f -h

!|com.nikias.SampleFitNesse.ActionFixtureTest|
|start|ActionFixtureTest|
|enter|firstPart|Hello|
|enter|secondPart|World|
|press|join|
|check|together|Hello, World|

_________________

