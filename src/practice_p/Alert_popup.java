package practice_p;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup 
{
static 
{
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException 
	{
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButtonContainer")).click();
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			driver.findElement(By.xpath("//div[@class='components_button  withPlusIcon']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@class='firstNameField inputFieldWithPlaceholder'])[2]")).sendKeys("sanjay");
			driver.findElement(By.xpath("//div[@class='closeButton hideButton_panelContainer']")).click();
		Alert a=driver.switchTo().alert();
		//a.accept();
		//a.dismiss();
		String str = a.getText();
		System.out.println(str);

	}

}
