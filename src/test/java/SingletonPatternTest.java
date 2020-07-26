import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SingletonPatternTest {

   @Test
   void should_create_only_one_instance_eagerly() {
      SingletonPattern instance1 = SingletonPattern.getInstance();
      SingletonPattern instance2 = SingletonPattern.getInstance();

      System.out.println("instance 1:" + instance1.toString());
      System.out.println("instance 2:" + instance2.toString());

      assertThat(instance1).isEqualTo(instance2);
   }

}