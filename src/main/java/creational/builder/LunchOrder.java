package creational.builder;

public class LunchOrder {
   private String bread;
   private String dressing;
   private String condiments;
   private String meat;

   LunchOrder(Builder builder) {
      this.bread = builder.bread;
      this.dressing = builder.dressing;
      this.condiments = builder.condiments;
      this.meat = builder.meat;
   }

   public String getMeat() {
      return this.meat;
   }


   public static class Builder {
      private String bread;
      private String dressing;
      private String condiments;
      private String meat;

      public Builder() {
      }


      public LunchOrder build() {
         return new LunchOrder(this);
      }

      public Builder withBread(String bread) {
         this.bread = bread;
         return this;
      }

      public Builder withDressing(String dressing) {
         this.dressing = dressing;
         return this;
      }

      public Builder withCondiments(String condiments) {
         this.condiments = condiments;
         return this;
      }

      public Builder withMeat(String meat) {
         this.meat = meat;
         return this;
      }
   }
}

