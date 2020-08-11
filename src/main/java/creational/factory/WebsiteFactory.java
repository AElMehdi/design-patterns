package creational.factory;

import creational.factory.websites.Blog;
import creational.factory.websites.Shop;
import creational.factory.websites.Website;
import creational.factory.websites.WebsiteTypes;

public class WebsiteFactory {

   public static Website getWebSite(WebsiteTypes websiteType) {
      switch (websiteType) {
         case BLOG:
            return new Blog();
         case SHOP:
            return new Shop();
         default:
            return null;
      }
   }
}
