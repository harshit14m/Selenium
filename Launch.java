package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driverNew = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.close();
		String id = driver.getWindowHandle();
		System.out.println(id);
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
