package OOPS;

public class SingletonDatabaseConnection {
    private static SingletonDatabaseConnection instance=new SingletonDatabaseConnection();
    private SingletonDatabaseConnection(){}
    public static SingletonDatabaseConnection getInstance(){
        return instance;
    }
}
