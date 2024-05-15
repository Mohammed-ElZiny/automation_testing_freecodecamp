package Tests;

import Pages.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestForumSearch extends TestBase{


    ForumPage forumPage;
    HomePage homePage;

    @Test
    public void testForumSearch(){
    homePage = new HomePage(driver);
    homePage.open_forum_page();
    forumPage = new ForumPage(driver);
    wait = new WebDriverWait(driver,  Duration.ofSeconds(60));
    wait.until(ExpectedConditions.visibilityOf(forumPage.curriculumNav));
    forumPage.searchForCategory("python");

    }
}
