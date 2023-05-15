### To Run

#### Using  CMD Line

```
javac src/main/java/org/example/Main.java
java -cp src/main/java org.example.Main
```

#### Using Gradle

```
./gradlew jar
java -jar build/libs/java-basics-1.0-SNAPSHOT.jar
./gradlew test
``` 


### References
#### HTTP Client
Okhttp Client  - https://square.github.io/okhttp/

#### How to create a fat jar?
Add the following to the build.gradle
```
from {
configurations.runtimeClasspath.collect { it.isDirectory() ? it : zipTree(it) }
}
```
