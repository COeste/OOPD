:: A batch script for building Java(TM) programs.
::
:: v.1.1.
::
:: The script assumes the existance of the subdirectory ./src, as well as
:: the file ./lib/junit-4.10.jar. The subdirectory ./bin is created if it
:: does not exist.
::
:: The script runs javac on all the .java files in the subdirectory ./src,
:: with classpath ./lib/junit-4.10.jar, and destination ./bin.
::
:: The build succeeded if no errors were reported.

@echo off
if not exist .\bin mkdir .\bin
dir /b /s ".\src\*.java" > ..java
javac -cp .\lib\junit-4.10.jar -d .\bin -Xlint @..java
del ..java
pause
