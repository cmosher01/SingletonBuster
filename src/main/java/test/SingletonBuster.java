package test;

import java.io.IOException;
import java.net.*;

@SuppressWarnings({"unchecked", "rawtypes"})
public class SingletonBuster {
    public static void main(String... args) throws ClassNotFoundException, IOException {
        SingletonBuster buster = new SingletonBuster();
        buster.createSingletonFromNewClassLoader();
        buster.createSingletonFromNewClassLoader();
    }

    void createSingletonFromNewClassLoader() throws ClassNotFoundException {
        URL[] classpath = {getClass().getClassLoader().getResource("")};
        ClassLoader loader = URLClassLoader.newInstance(classpath, null);
        Object instance = Enum.valueOf((Class)(loader.loadClass("test.MySingleton")), "INSTANCE");
        System.out.println(instance.getClass()+" @ class loader "+instance.getClass().getClassLoader());
    }
}
