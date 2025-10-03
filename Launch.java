package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//ChromeDriver driver = new ChromeDriver();
		//WebDriver driverNew = new ChromeDriver();
		//driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.close();
		//String id = driver.getWindowHandle();
		//System.out.println(id);
		//String title = driver.getTitle();
		//System.out.println(title);
		//driver.quit();
		//driver.findElement(By.id("APjFqb")).sendKeys("india vs west indies");
		//Thread.sleep(2000);
		//driver.findElement(By.id("APjFqb")).click();
		//Thread.sleep(2000);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("harshit@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("harshit@1234");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
	}

}
