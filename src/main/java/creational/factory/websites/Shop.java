package creational.factory.websites;

import creational.factory.pages.CartPage;
import creational.factory.pages.ContactPage;

public class Shop extends Website {

   @Override
   void createWebsite() {
      pages.add(new ContactPage());
      pages.add(new CartPage());
   }
}
