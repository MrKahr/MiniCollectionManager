@ECHO OFF
REM TODO: Add java modules, add argfile 
REM abbreviation is for (d)rive (p)ath, first argument (i.e. batch file itself). - See https://web.archive.org/web/20180120021145/https://www.microsoft.com/resources/documentation/windows/xp/all/proddocs/en-us/percent.mspx?mfr=true
SET SOURCEDIRECTORY=%~dp0
SET COMPILEDIRECTORY=%SOURCEDIRECTORY%*.java
SET TARGETDIRECTORY=%SOURCEDIRECTORY%out

:BUILD_OUT_FILE
IF NOT EXIST %TARGETDIRECTORY% (
    ECHO CREATING OUT FOLDER FOR APP
    MKDIR %TARGETDIRECTORY%
) ELSE (
    ECHO OUT FOLDER FOR APP ALREADY EXISTS
)

:COMPILE_JAVA
REM Handle compilation errors
REM NOTE that cmd parses directories without "" string syntax. 
ECHO GENERATING JAR FILE FOR APP
javac -d %TARGETDIRECTORY% -g -sourcepath %SOURCEDIRECTORY% %COMPILEDIRECTORY%  || (ECHO COMPILATION FAILED GOTO EXECUTABLE_GENERATION_END)

REM File must end in new line or carriage to be parsed properly - see https://docs.oracle.com/javase/tutorial/deployment/jar/appman.html 
REM Logical expressions is a canonical way of error handling in batch - see https://en.wikibooks.org/wiki/Windows_Batch_Scripting#Error_level
ECHO RUNNING APPLICATION
jar cfe App.jar App * || (ECHO JAR CREATION FAILED GOTO EXECUTABLE_GENERATION_END)
:EXECUTABLE_GENERATION_END

java -jar %TARGETDIRECTORY%\App.jar
REM Always give user opportunity to see errors
pause