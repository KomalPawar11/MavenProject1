package MavenPackagepractice.MavenProjectpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class testcase1 {
	
	@Test
	
public void logintoAMZ() throws InterruptedException
	{
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	
		HomePage H1= new HomePage(driver);
		H1.search();
		
		
		
	}

}
