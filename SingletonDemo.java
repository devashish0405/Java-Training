package OOPS;

public class SingletonDemo {
    public static void main(String[] args) {

        SingletonDatabaseConnection instance = SingletonDatabaseConnection.getInstance();
        SingletonDatabaseConnection instance1 = SingletonDatabaseConnection.getInstance();
        System.out.println(instance);
        System.out.println(instance1);

    }
}

