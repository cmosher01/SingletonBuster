package test;

public enum MySingleton {
    INSTANCE;
    MySingleton() {
        System.out.println("Should happen only ONCE!");
    }
}
