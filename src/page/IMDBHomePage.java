package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDBHomePage  {

	@FindBy(id = "suggestion-search")
    WebElement searchField;
	
	@FindBy(id ="react-autowhatever-1--item-0")
	WebElement directorName;
	
	@FindBy(xpath ="//tbody/tr[1]/td[1]/div[1]/a[3]")
	WebElement director;
   
    public IMDBHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchField(String directorname)  {
    	
    	try {
    		searchField.sendKeys(directorname);
    		Thread.sleep(10000);
    		directorName.click();
    		Thread.sleep(10000);
    		director.click();
    		
		} catch (Exception e) {
			// TODO: handle exception

   }
	     
   }
}
