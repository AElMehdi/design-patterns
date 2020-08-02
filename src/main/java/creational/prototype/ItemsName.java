package creational.prototype;

public enum ItemsName {
   MOVIE("Movie"), BOOK("Book"),
   ;

   private String value;

   public String getValue() {
      return value;
   }

   ItemsName(String value) {
      this.value = value;
   }
}