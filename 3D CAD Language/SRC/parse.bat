@echo off
del *.txt  >nul 2>&1

@echo off
rem Change the next line to point at the directory containing art.jar
set arthome=..

java -classpath %arthome%/art.jar uk.ac.rhul.cs.csle.art.v3.ARTV3 %1.art
javac -Xlint -classpath .;%arthome%/art.jar ARTGeneratedParser.java ARTGeneratedLexer.java
java -classpath .;%arthome%/art.jar ARTTest %2 %3 %4 %5 %6 %7 %8 %9 +inputFileIfExists:'%1.str' +showAll +phaseAG

@echo off
setLocal EnableDelayedExpansion

for /f "tokens=* delims= " %%a in (term.txt) do (
echo ^^!try %%a, __map >>esolTranslation.txt
)

copy /b eSOS_CAD3.art+esolTranslation.txt temp.art



..\artfx temp.art

clean


