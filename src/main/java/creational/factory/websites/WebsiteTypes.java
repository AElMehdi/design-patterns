package creational.factory.websites;

public enum WebsiteTypes {
   BLOG("blog"), SHOP("shop");

   private String value;

   public String getValue() {
      return value;
   }

   WebsiteTypes(String value) {
      this.value = value;
   }
}