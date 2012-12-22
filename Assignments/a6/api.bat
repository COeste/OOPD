:: A batch script for building documentation of Java(TM) programs.
::
:: v.1.1.
::
:: The script assumes the existance of the subdirectory ./src. The subdirectory
:: ./doc is created if it does not exist.
::
:: The script runs javadoc on all the .java files in the subdirectory ./src,
:: with destination ./doc.
::
:: The build succeeded if no errors were reported.

@echo off
if not exist .\doc mkdir .\doc
dir /b /s ".\src\*.java" > ..java
javadoc -d .\doc @..java
del ..java
pause
