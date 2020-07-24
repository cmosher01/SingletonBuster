package test;

public enum MySingleton {
    INSTANCE;
    MySingleton() {
        System.out.println("should happen only once");
    }
}
