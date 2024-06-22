@ECHO OFF
REM TODO: Add java modules, add argfile 
REM abbreviation is for (d)rive (p)ath, first argument (i.e. batch file itself). - See https://web.archive.org/web/20180120021145/https://www.microsoft.com/resources/documentation/windows/xp/all/proddocs/en-us/percent.mspx?mfr=true
SET SOURCEDIRECTORY=%~dp0
SET COMPILEDIRECTORY=%SOURCEDIRECTORY%*.java
SET TARGETDIRECTORY=%SOURCEDIRECTORY%out

:BUILD_OUT_FILE
IF NOT EXIST %TARGETDIRECTORY% (
    ECHO CREATING OUT FOLDER
    MKDIR %TARGETDIRECTORY%
) ELSE (
    ECHO OUT FOLDER ALREADY EXISTS
)

:COMPILE_JAVA
REM Handle compilation errors
REM NOTE that cmd parses directories without "" string syntax. 
javac -d %TARGETDIRECTORY% -g -sourcepath %SOURCEDIRECTORY% %COMPILEDIRECTORY%  || GOTO COMPILATION_FALIURE

REM File must end in new line or carriage to be parsed properly - see https://docs.oracle.com/javase/tutorial/deployment/jar/appman.html 
REM Logical expressions is a canonical way of error handling in batch - see https://en.wikibooks.org/wiki/Windows_Batch_Scripting#Error_level
REM jar cfe MiniCollectionManager.jar   (GOTO COMPILATION_FALIURE)


:COMPILATION_SUCCESSFUL
ECHO EXECUTABLE GENERATED SUCCESSFULLY 

:COMPILATION_FALIURE
ECHO COMPLIATION FAILED
pause