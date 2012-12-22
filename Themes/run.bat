:: A batch script for running Java(TM) programs.
::
:: v.1.1.
::
:: The script assumes the existance of the subdirectory ./bin, and the file
:: ./lib/junit-4.10.jar.
::
:: The script runs java (the command) with the classpath composed of the ./bin
:: subdirectory, and the file ./lib/junit-4.10.jar. The class run by the
:: JVM is the first command line argument supplied to the batch script.
::
:: For instance, if there exist the files ./bin/Main.class and
:: ./bin/Test.class,
::
:: >run.bat Main
::
:: runs the main method in the Main class, while
::
:: >run.bat Test
::
:: runs the main method in the Test class.
::
:: Tip: You can perform an ``Open command window here'' operation in Windows
:: Explorer if you hold the Shift key down while you right-click in the empty
:: area of a particular folder.

@echo off
if "%1"=="" goto noclass
java -ea -cp .\lib\junit-4.10.jar;.\lib\diku.jar;.\bin %1
goto exit

:noclass
echo Please specify a class to run.
goto exit

:exit
pause
