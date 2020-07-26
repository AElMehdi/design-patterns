import creational.singleton.EagerSingleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EagerSingletonTest {

   @Test
   void should_create_only_one_instance_eagerly() {
      EagerSingleton instance1 = EagerSingleton.getInstance();
      EagerSingleton instance2 = EagerSingleton.getInstance();

      System.out.println("instance 1:" + instance1.toString());
      System.out.println("instance 2:" + instance2.toString());

      assertThat(instance1).isEqualTo(instance2);
   }

}