package org.test.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\ActionsClass\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
	driver.get(" http://www.flipkart.com");
	
	Thread.sleep(2000);
	
	WebElement tv = driver.findElement(By.xpath("//span[text()='TVs & Appliances']")); 
	Actions a=new Actions(driver);
	a.moveToElement(tv).perform();
	
	WebElement invert = driver.findElement(By.xpath("//a[text()='Inverter AC']"));
	invert.click();
	Thread.sleep(2000);
	
	WebElement invertac = driver.findElement(By.xpath("(//div[contains(text(),'Voltas ')])[1]"));
	invertac.click();

	WebElement invertclick = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
	invertclick.click();
	}

}
