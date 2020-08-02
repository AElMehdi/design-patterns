package creational.prototype;

import static creational.prototype.ItemsName.*;

import java.util.HashMap;
import java.util.Map;

public class Registry {
   private Map<String, Item> items = new HashMap();

   public Registry() {
      loadItems();
   }

   public Item createItem(String type) {
      Item item = null;
      try {
         item = (Item) items.get(type).clone();
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      return item;
   }

   private void loadItems() {
      Movie movie = new Movie();
      movie.setTitle("Default movie");
      movie.setPrice(20);
      movie.setUrl("default movie URL");
      items.put(MOVIE.name(), movie);

      Book book = new Book();
      book.setTitle("GoF");
      book.setPrice(15);
      book.setUrl("Default book URL");
      items.put(BOOK.name(), book);
   }

}
