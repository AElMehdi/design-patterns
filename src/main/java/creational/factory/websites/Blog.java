package creational.factory.websites;

import creational.factory.pages.AboutPage;
import creational.factory.pages.ContactPage;

public class Blog extends Website {


   @Override
   void createWebsite() {
      pages.add(new ContactPage());
      pages.add(new AboutPage());
   }
}
