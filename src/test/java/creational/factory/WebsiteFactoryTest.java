package creational.factory;

import creational.factory.pages.AboutPage;
import creational.factory.pages.CartPage;
import creational.factory.websites.Website;

import static creational.factory.websites.WebsiteTypes.BLOG;
import static creational.factory.websites.WebsiteTypes.SHOP;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class WebsiteFactoryTest {

   @Test
   void should_create_a_blog() {
      Website blog = WebsiteFactory.getWebSite(BLOG);

      assertThat(blog.pages().get(1)).isInstanceOf(AboutPage.class);
   }

   @Test
   void should_create_a_shop() {
      Website shop = WebsiteFactory.getWebSite(SHOP);

      assertThat(shop.pages().get(1)).isInstanceOf(CartPage.class);
   }
}