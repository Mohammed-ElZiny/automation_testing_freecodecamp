package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForumPage extends PageBase {
    public ForumPage(WebDriver driver){super(driver);}

    @FindBy(className="curriculum-nav")
    public WebElement curriculumNav;
    @FindBy(xpath = "//*[@id=\"ember13-header\"]")
//    //*[@id="ember13-header"]
    public WebElement categoriesFilter;

     @FindBy(id = "ember1095")
   public WebElement searchField;


    public void searchForCategory(String category){
        categoriesFilter.click();
        searchField.sendKeys(category);
        searchField.submit();


    }


}