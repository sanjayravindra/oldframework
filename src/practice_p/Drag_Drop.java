package practice_p;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	Actions a =new Actions(driver);
	//a.dragAndDrop(block1, block4).perform();
	//a.clickAndHold(block1).release(block4).perform();
	a.clickAndHold(block1).moveToElement(block4).perform();
	}

}
