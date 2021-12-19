package test;

import java.net.*;

@SuppressWarnings({"unchecked", "rawtypes"})
public class SingletonBuster {
    public static void main(String... args) throws Throwable {
        print(getFromThisClassLoader());
        print(getFromOtherClassLoader());
    }

    static Object getFromThisClassLoader() {
        return MySingleton.INSTANCE;
    }

    static Object getFromOtherClassLoader() throws Throwable {
        var classLoader = URLClassLoader.newInstance(CLASSPATH, null);
        var clazz = (Class)classLoader.loadClass(MySingleton.class.getName());
        return Enum.valueOf(clazz, MySingleton.INSTANCE.name());
    }

    static void print(Object instance) {
        System.out.printf("%s.%s/0x%08x @ class loader %s\n",
            instance.getClass(),
            instance,
            instance.hashCode(),
            instance.getClass().getClassLoader());
    }

    static final URL[] CLASSPATH = new URL[]{SingletonBuster.class.getClassLoader().getResource("")};
}
