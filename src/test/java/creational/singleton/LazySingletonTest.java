package creational.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LazySingletonTest {

   @Test
   void should_return_same_instance_lazily() {
      LazySingleton instance1 = LazySingleton.getInstance();
      LazySingleton instance2 = LazySingleton.getInstance();

      assertThat(instance1).isEqualTo(instance2);
   }
}