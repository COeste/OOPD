:: A batch script for packing your submission.
::
:: v.1.1.
::
:: The script uses the JDK command-line utility jar to archive the contents of
:: the subdirectories ./lib, and ./src, which are hence assumed to exist.
::
:: The script requires a little bit of adjustment before every submission.
::
:: The ASSIGNMENT variable must be set to the number of the assignment hereby
:: solved.
::
:: The GROUP variable must describe the group that made the solution. In
:: particular, it should be the initials of the participants, upper cased,
:: separated by dots. For instance, if your names are Donald Ervin Knuth(DEK) 
:: and Edsger Wybe Dijkstra(EWD), GROUP. Your names must be listed in 
:: alphabetic order, as in (D)onald comes before (E)dsger.

:: The GROUP variable must describe the group that made the solution. In
:: particular, it should be the initials of the participants, upper cased,
:: separated by dots. Non-ASCII letters (e.g. Æ, Ø, and Å) should be replaced by
:: their ASCII equivalents (i.e. AE, OE, AA). For instance, if your names are
:: Peter Naur (PN) and Hans Christian Ørsted (HCOE), your should set the GROUP
:: variable to HCOE.PN. Your names must be listed in alphabetic order, as in
:: (H)ans comes before (P)eter.


@echo off
set ASSIGNMENT=2
set GROUP=CGDOE

jar cvf A.%ASSIGNMENT%.%GROUP%.jar lib/ src/
pause
