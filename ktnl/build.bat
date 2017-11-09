@echo off

setlocal

set DIR=.
set "PATH=..\..\dist\bin;..\..\bin;%PATH%"
if "%TARGET%" == "" set TARGET=mingw

call konanc -target "%TARGET%" "%DIR%\src\main\kotlin" -o ktnl
exit /b %ERRORLEVEL%