package practice_p;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
ChromeOptions op= new ChromeOptions();
op.addArguments("--disable-notification");
op.addArguments("--disable-geolocation");
ChromeDriver driver = new ChromeDriver(op);
	driver.get("https://www.cleartrip.com/");
	driver.navigate().refresh();
	}

}
