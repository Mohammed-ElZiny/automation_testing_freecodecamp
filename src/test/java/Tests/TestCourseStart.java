package Tests;

import Pages.HomePage;
import Pages.LearnPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCourseStart extends TestBase {

    HomePage homePage;
    LearnPage learnPage;
    @Test
    public void testCourseStart(){
        homePage = new HomePage(driver);
        homePage.open_curriculum_page();
        learnPage = new LearnPage(driver);
        learnPage.openFirstCourse();
        learnPage.startProject();
    }
}
