package singleton;

public class SingletonClass {
    private static SingletonClass instance;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private int a;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
