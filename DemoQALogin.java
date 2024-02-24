package Homepage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class DemoQALogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\\\Downloads\\\\selenium jars\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		
		//Firstly registering the user 
		//with css selector
		driver.findElement(By.cssSelector("#newUser")).click();
		
		//now filling the first name which will be hello
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Hel");
		//now filling the last name which will be world 
		driver.findElement(By.id("lastname")).sendKeys("wor");
		
		//now enter the username 
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("he");
		
		//now enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abcd@1234");
		
		//clikcing on the not a robot
		//by the help of classname we will do 
		driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/iframe[1]")));
		Thread.sleep(5000);
		driver.findElement(By.className("recaptcha-checkbox-border")).click();
		Thread.sleep(10000);
		
		driver.switchTo().defaultContent();
		
		//clicking on Register
		driver.findElement(By.xpath("//button[@id='register']")).click();
		
		Thread.sleep(5000);
		
		
		
	
		
		driver.switchTo().defaultContent();
		
		//clicking on back to login 
		driver.findElement(By.xpath("//button[@id='gotologin']")).click();
		
		//filling username 
		driver.findElement(By.cssSelector("#userName")).sendKeys("he");
		
		//filling password
		driver.findElement(By.cssSelector("#password")).sendKeys("Abcd@1234");
		
		driver.findElement(By.xpath("//button[@id='login']")).click();
		

	}

}