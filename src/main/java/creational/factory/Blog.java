package creational.factory;

public class Blog extends Website {


   @Override
   void createWebsite() {
      pages.add(new ContactPage());
      pages.add(new AboutPage());
   }
}
