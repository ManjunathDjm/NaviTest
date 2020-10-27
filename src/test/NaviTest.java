package test;

import base.BaseOne;
import page.IMDBHomePage;
import page.LetterboxdHomePage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NaviTest extends BaseOne {
	    
    @Parameters({ "directorname","url","letterboxdurl" })
    @Test
    public void searchButton(String directorname,String url,String letterboxdurl) throws InterruptedException, IOException  {
    	
    	driver.get(url);
    	IMDBHomePage hompage = new IMDBHomePage(driver);
    	hompage.searchField(directorname);
    	Thread.sleep(20000);
    	
		WebElement ls1 = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='root']/div[@id='pagecontent']/div[@id='content-2-wide']/div[@id='maindetails_center_bottom']/div[5]/div[3]/div[6]"));
		List<String> pageOneValues = new ArrayList<>();
	    pageOneValues.add(ls1.getText());
	    System.out.println(ls1.getText());
	    System.out.println("imdb--------------------");
	       	
	    driver.get(letterboxdurl);
	    LetterboxdHomePage letterboxd = new LetterboxdHomePage(driver);
        letterboxd.searchField(directorname);
        Thread.sleep(20000);
        WebElement searchBtn = driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/label[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(searchBtn);
        action.click().perform();
        Thread.sleep(20000);
        letterboxd.dropdown();
    	Thread.sleep(20000);
        	
    	WebElement ls2 = driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/section[1]/ul[1]"));
	    List<String> pageTwoValues = new ArrayList<>();
	    pageTwoValues.add(ls2.getText());
	    System.out.println(ls2.getText());
	    System.out.println("letterboxd--------------------");
	    
        //pageOneValues.removeAll(pageTwoValues);
        //System.out.println("Missing items from pagetwo " + pageOneValues);
	    
	    
    }
    
}

