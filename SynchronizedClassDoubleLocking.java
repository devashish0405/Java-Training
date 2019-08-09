package OOPS;

public class SynchronizedClassDoubleLocking {

    private static SynchronizedClassDoubleLocking instance=null;
    private SynchronizedClassDoubleLocking(){}
    public static synchronized SynchronizedClassDoubleLocking getInstance() {
        if(instance==null) {
            synchronized (SynchronizedClassDoubleLocking.class) {
                if (instance == null) {
                    instance = new SynchronizedClassDoubleLocking();
                }
            }
        }
        return instance;
    }

}
