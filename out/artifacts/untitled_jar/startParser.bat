
@ECHO OFF
java -jar "%CD%/untitled.jar"
powershell -c (New-Object Media.SoundPlayer "c:\windows\media\tada.wav").PlaySync();
pause