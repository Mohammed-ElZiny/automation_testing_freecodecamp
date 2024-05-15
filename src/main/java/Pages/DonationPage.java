package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DonationPage   extends PageBase {
    public DonationPage(WebDriver driver){super(driver);}



    @FindBy(id = "radix-4-trigger-500")
    WebElement donation_5 ;
    @FindBy(id = "radix-4-trigger-1000")
    WebElement donation_10 ;
    @FindBy(id = "radix-4-trigger-2000")
    WebElement donation_20;
    @FindBy(id = "radix-4-trigger-4000")
    WebElement donation_50;
    @FindBy(className = "confirm-donation-btn")
    WebElement donate_button;

    @FindBy(className = "paypal-button-label-container")
    WebElement paypal;

        @FindBy(xpath = "//*[@id=\"buttons-container\"]/div/div[2]/div")
    WebElement debitCreditCard;

        @FindBy(className = "patreon-button")
    WebElement patreonButton;

      @FindBy(className = "edit-amount-button")
    WebElement editAmountButton;


public void setDonation(int don){
    switch (don){
        case 10: donation_10.click();
            break;
        case 20: donation_20.click();
            break;
        case 50: donation_50.click();
            break;
        default:donation_5.click(); break;

    }
}

public void confirmDonation(){
    donate_button.click();
}
public void selectPay(int option){
    switch (option){
        case 1: paypal.click();
            break;
        case 2: debitCreditCard.click();
            break;
        default: patreonButton.click(); break;
    }

}


public void editAmount(int don){
    editAmountButton.click();
    setDonation(don);
    confirmDonation();
}





}
