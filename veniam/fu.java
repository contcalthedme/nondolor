public class ThreadSafeLazySingleton {

    // Private static variable to hold the single instance of the class
    private static volatile ThreadSafeLazySingleton instance;

    // Private constructor to prevent instantiation from outside
    private ThreadSafeLazySingleton() {
        // Initialization code, if any
    }

    // Static method to get the singleton instance
    public static ThreadSafeLazySingleton getInstance() {
        if (instance == null) {  // Check 1
            synchronized (ThreadSafeLazySingleton.class) {
                if (instance == null) {  // Check 2 (double-check locking)
                    instance = new ThreadSafeLazySingleton();
                }
            }
        }
        return instance;
    }

    // Other methods and fields can follow...
}
