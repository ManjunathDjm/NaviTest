package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetterboxdHomePage  {

	@FindBy(id ="search-q")
    WebElement searchField;
	
	@FindBy(xpath ="//header/section[1]/form[2]/fieldset[1]/input[2]")
	WebElement search;
	
	@FindBy(xpath="//body/div[@id='content']/div[1]/div[1]/section[1]/ul[1]/li[1]/div[2]/h2[1]/a[1]")
	WebElement directorlink;
	
	@FindBy(xpath="//a[contains(normalize-space(),'Director')]")
	WebElement directorOption;
   
    public LetterboxdHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchField(String directorname)  {
    	
    	try {
    		searchField.sendKeys(directorname);
    		Thread.sleep(10000);
    		search.click();
    		directorlink.click();
    		
		} catch (Exception e) {
			// TODO: handle exception
		}
   }
	   
    public void dropdown()  {
        	
        	try {
        		directorOption.click();
    		} catch (Exception e) {
    			// TODO: handle exception

       }
   }
}
