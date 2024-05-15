package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CreateAccTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @Test
    public void TestCreateAccount() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.open_signin_page();
        loginPage=new LoginPage(driver);
        loginPage.signupPage();
        registerPage=new RegisterPage(driver);
        registerPage.signupWithEmail("mohammed4ziny@gmail.com");
    }
}