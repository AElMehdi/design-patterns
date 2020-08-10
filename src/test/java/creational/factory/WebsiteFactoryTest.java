package creational.factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class WebsiteFactoryTest {

   @Test
   void should_create_a_blog() {
      Website blog = WebsiteFactory.getWebSite("blog");

      assertThat(blog.pages.get(1)).isInstanceOf(AboutPage.class);
   }
}