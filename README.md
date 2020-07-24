# SingletonBuster
Demonstration of breaking the Java enum singleton pattern:
```java
public enum MySingleton {
    INSTANCE;
    MySingleton() {
        System.out.println("should happen only once");
    }
}
```

### Build and run
Requires Java JDK version 8 or higher.
```
$ javac -version
javac 11.0.5
$ ./gradlew -q run
should happen only once
class test.MySingleton @ class loader java.net.FactoryURLClassLoader@7a7b0070
should happen only once
class test.MySingleton @ class loader java.net.FactoryURLClassLoader@77f03bb1
```

### Buster
[SingletonBuster.java](src/main/java/test/SingletonBuster.java)

---
Copyright © 2020, Christopher Alan Mosher, Shelton, Connecticut, USA, <cmosher01@gmail.com>
