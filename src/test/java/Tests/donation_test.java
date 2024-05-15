package Tests;

import Pages.*;
import Pages.SettingsPage;
import org.testng.annotations.Test;
import org.testng.Assert;


public class donation_test extends TestBase{

    HomePage homePage;
    DonationPage donationPage;
    @Test
    public void TestDonation(){
        homePage = new HomePage(driver);
        homePage.open_donation_page();
        donationPage = new DonationPage(driver);
        donationPage.setDonation(40);
        donationPage.confirmDonation();

        donationPage.selectPay(2);

    }

}
