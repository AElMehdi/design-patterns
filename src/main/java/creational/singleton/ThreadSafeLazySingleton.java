package creational.singleton;

public class ThreadSafeLazySingleton {
   private static volatile ThreadSafeLazySingleton instance = null;

   private ThreadSafeLazySingleton() {
      // Protect constructor from the use of reflection
      if (instance != null) {
         throw new RuntimeException("Use the getInstance() method");
      }
   }

   // Synchronizing the whole method will have an impact on performance:
   // The whole class will be synchronized, which will slow it down
   public static ThreadSafeLazySingleton getInstance() {
      if (instance == null) {
         synchronized (ThreadSafeLazySingleton.class) {
            if (instance == null) {
               instance = new ThreadSafeLazySingleton();
            }
         }
      }

      return instance;
   }
}
