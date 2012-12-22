:: A batch script for cleaning up the ./bin subdirectory.
::
:: v.1.1.

@echo off
if exist .\bin echo Y | rmdir /s .\bin
mkdir .\bin
pause
