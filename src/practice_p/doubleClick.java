package practice_p;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/Sanjay/Desktop/Sanju/Programs/Double_click.html");
   WebElement text = driver.findElement(By.id("demo"));
   Actions a = new Actions(driver);
   a.doubleClick(text).perform();
   String str = text.getText();
   System.out.println(str);
   
   
		   

	
	
	}

}
