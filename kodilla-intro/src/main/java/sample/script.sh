#!/usr/bin/env bash
rm build/libs/*.jar
./gradlew build

exist() {
  cp build/libs*.jar ~/project
}

notExist() {
  echo Compilation error.
}

if [ -e build/libs/*.jar ]; then
  exist
else
  notExist
fi
