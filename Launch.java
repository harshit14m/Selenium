package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driverNew = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.close();
		//String id = driver.getWindowHandle();
		//System.out.println(id);
		//String title = driver.getTitle();
		//System.out.println(title);
		//driver.quit();
		driver.findElement(By.id("APjFqb")).sendKeys("india vs west indies");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).click();
		driver.findElement(By.id("APjFqb")).click();
		Thread.sleep(2000);
	}

}
