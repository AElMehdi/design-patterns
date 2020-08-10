package creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
   protected List<Page> pages = new ArrayList<>();

   public Website() {
      this.createWebsite();
   }

   public List<Page> pages() {
      return pages;
   }

   abstract void createWebsite();
}
