package MavenPackagepractice.MavenProjectpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	//step 1
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchfiled;
	
	
	//step 2
	public void search()
	{
		searchfiled.click();
		searchfiled.sendKeys("Shoes"+ Keys.ENTER);
		
	}
	//step 3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	}

