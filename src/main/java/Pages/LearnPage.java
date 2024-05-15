package Pages;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearnPage   extends PageBase {
    public LearnPage(WebDriver driver){super(driver);}

    @FindBy(xpath = "//*[@id=\"learn-app-wrapper\"]/div/div/div/div[6]/ul[1]/li[1]/a")
    WebElement firstCourse;
   @FindBy(xpath = "//*[@id=\"learn-app-wrapper\"]/div/div/div/div[6]/ul[1]/li[2]/a/div")
    WebElement secondCourse;

   @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div/main/div/div/div[7]/div[1]/h3/button/span")
    WebElement projectTitleSpan;
   @FindBy(className = "challenge-jump-link")
    WebElement startProjectBtn;



   public void openFirstCourse(){
       firstCourse.click();
   }
   public void openSecondCourse(){secondCourse.click();}
   public void startProject(){
       if(startProjectBtn != null){startProjectBtn.click();}
       else {
           projectTitleSpan.click();
           startProjectBtn.click();
       }
       }


}

