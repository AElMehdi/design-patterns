package creational.prototype;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RegistryTest {


   @Test
   void should_create_new_objects_from_a_default_set_up_without_reusing_new() {
      Registry registry = new Registry();

      Item javaTimor = registry.createItem("Movie");
      Item theHacker = registry.createItem("Movie");

      assertThat(javaTimor).isNotNull();

      assertThat(theHacker)
            .isNotNull()
            .isNotEqualTo(javaTimor);
   }
}