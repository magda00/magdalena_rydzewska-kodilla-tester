del build/libs/*.jar
call gradlew build
if exist build/libs/*.jar goto copied
else goto error

:copied
copy build/libs*.jar /

:error
echo Compilation error.
