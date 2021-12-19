# SingletonBuster
Demonstration of breaking the Java enum singleton pattern:
```java
public enum MySingleton {
    INSTANCE;
    MySingleton() {
        System.out.println("Should happen only ONCE!");
    }
}
```

### Build and run
Requires Java JDK version 8 or higher.
```
$ java -version
openjdk version "17.0.1" 2021-10-19
OpenJDK Runtime Environment (build 17.0.1+12-Ubuntu-120.04)
OpenJDK 64-Bit Server VM (build 17.0.1+12-Ubuntu-120.04, mixed mode, sharing)

$ ./gradlew -q run
Should happen only ONCE!
class test.MySingleton.INSTANCE/0x18b4aac2 @ class loader jdk.internal.loader.ClassLoaders$AppClassLoader@30946e09
Should happen only ONCE!
class test.MySingleton.INSTANCE/0x6bc7c054 @ class loader java.net.FactoryURLClassLoader@2a139a55
```

### Buster
[SingletonBuster.java](src/main/java/test/SingletonBuster.java)

---
Copyright © 2020-2021, Christopher Alan Mosher, Shelton, Connecticut, USA, <cmosher01@gmail.com>
