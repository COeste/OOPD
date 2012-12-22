:: A batch script for unpacking a submission.
::
:: v.1.1.
::
:: The script finds all the jar files in the current directory and extracts them
:: to directories with the same name. For instance, if you have the file
:: A.0.HCOE.PN.jar in your working directory, the script creates a folder
:: A.0.HCOE.PN and extracts the jar file into that directory.

@echo off
for %%X in (*.jar) do (
  mkdir "%%~NX"
  cd "%%~NX"
  jar xvf ..\%%X
  cd ..
)
pause
