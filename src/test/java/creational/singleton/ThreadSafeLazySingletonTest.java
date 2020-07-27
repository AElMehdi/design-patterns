package creational.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ThreadSafeLazySingletonTest {


   @Test
   void should_be_thread_safe_singleton_creation() {
      ThreadSafeLazySingleton instance1 = ThreadSafeLazySingleton.getInstance();
      ThreadSafeLazySingleton instance2 = ThreadSafeLazySingleton.getInstance();

      Assertions.assertThat(instance1).isEqualTo(instance2);
   }
}