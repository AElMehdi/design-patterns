package creational.builder;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LunchOrderTest {
   @Test
   void should_instantiate_lunch_using_the_builder() {
      LunchOrder lunchOrder = new LunchOrder
            .Builder()
            .withBread("Cibatta")
            .withDressing("Honey Mustard")
            .withCondiments("Onions")
            .withMeat("Chicken breast")
            .build();

      assertThat(lunchOrder.getMeat()).isEqualTo("Chicken breast");
   }
}