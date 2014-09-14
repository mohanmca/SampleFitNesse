1) Ensure Maven is properly setup.
2) Donwload DbFIT and configure in local directory, and should be in eclipse classpath.
3) To install DBFIT.
mkdir C:\Mohan\apps\dbFit\dbfit-complete-3.1.0\lib
wget -N https://github.com/dbfit/dbfit/releases/download/v3.1.0/dbfit-complete-3.1.0.zip
wget -N https://codeload.github.com/dbfit/dbfit/tar.gz/v3.1.0/dbfit-3.1.0.tar.gz


For newer versions -  fitnesseMain.FitNesseMain
Argruments..	-v  -l C:\Log\Users\mohan\git\samplefitnesse\log\ -d C:\Log\Users\mohan\git\samplefitnesse\
Use StartFitNesseDemo

1) http://localhost/DbFit
2) 

Modify the classpath.. in the wiki TestSuite
!path C:\Mohan\Tools\Repo\org\fitnesse\fitlibrary\20080812\fitlibrary-20080812.jar
!path C:\Mohan\Tools\Repo\org\fitnesse\fitnesse\20140901\fitnesse-20140901.jar
!path C:\Users\mohan\git\SampleFitNesse\target\classes
!path C:\Mohan\apps\dbFit\dbfit-complete-3.1.0\lib\*.jar
!path: C:/Mohan/Tools/Repo/org/hsqldb/hsqldb/2.3.2/hsqldb-2.3.2.jar

Remote Debugging

!define COMMAND_PATTERN {java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=1044 -cp %p %m}
!define REMOTE_DEBUG_COMMAND {java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000 -cp %p %m}
?responder=test&remote_debug=true                    
                                   
Add following in Wiki 
* NikiasTestSuit 



------------------
drop table dual;
truncate table dual;
create table dual(col char(10));
insert into dual values('test');
select col from dual;
_________________




Let us test the whole

And select suite page the above link, and and add test add following

!|com.nikias.samplefitnesse.CalculatorFixture|
|first|second|sum?|product?|
|1|3|4|3|
|2|4|6|8|

Description...
first - method we are setting (input).
product? - method we are testing.

_________________

!path C:\Mohan\Tools\Repo\org\fitnesse\fitnesse\20140901\fitnesse-20140901.jar
!path C:\Users\mohan\git\samplefitnesse\target\classes
!define TEST_SYSTEM {slim}
!contents -R2 -g -p -f -h


!|com.nikias.samplefitnesse.TableFixtureTest|
|Item|Product code|Price|
|Pragmatic Programmer|B978-0201616224|34.03|
|Sony RDR-GX330|ERDR-GX330|94.80|
|Test Driven Development By Example|B978-0321146533|32.39|
|Net Total||161.22|
|Tax (10% on applicable items)||9.48|
|Total||170.70|



_________________

     

for DoFixtureTest


!contents -R2 -g -p -f -h

!|com.nikias.samplefitnesse.DoFixtureTest|
|fill|10|times with|x|
|char at|4|is|x|
|set list|A,B,C,D|
|char at|2|is|C|


_________________



https://www.simple-talk.com/dotnet/.net-tools/acceptance-testing-with-fitnesse-multiplicities-and-comparisons/


_________________


run org.hsqldb.DatabaseManager

_______________
Suite

!contents -R2 -g -p -f -h
!path C:\Mohan\Tools\Repo\org\fitnesse\fitlibrary\20080812\fitlibrary-20080812.jar
!path C:\Mohan\Tools\Repo\org\fitnesse\fitnesse\20140901\fitnesse-20140901.jar
!path C:\Users\mohan\git\SampleFitNesse\target\classes
!path C:\Mohan\apps\dbFit\dbfit-complete-3.1.0\lib\*.jar
	

Some Content

Remove debug add url.

?responder=test&remote_debug=true

define COMMAND_PATTERN {java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=1044 -cp %p %m}
define REMOTE_DEBUG_COMMAND {java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000 -cp %p %m}

_______________

!path C:/Mohan/Tools/Repo/org/hsqldb/hsqldb/2.3.2/*.jar
!|dbfit.HSQLDBTest|
!|dbfit.fixture.DatabaseEnvironment|hsqldb|

|Connect|jdbc:hsqldb:hsql://localhost/xdb?user=test&password=test|
!|Query| select 'test' as x from dual|
|x|
|test|
!|Query| select col  from dual|
|col|
|test|
!|Query| select 'test' as x from dual|
|x|

_______________
