package creational.factory;

public class WebsiteFactory {

   public static Website getWebSite(String websiteType) {
      switch (websiteType) {
         case "blog":
            return new Blog();
         default:
            return null;
      }
   }
}
