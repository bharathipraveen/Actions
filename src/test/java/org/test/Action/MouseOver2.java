package org.test.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\ActionsClass\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	WebElement mob = driver.findElement(By.xpath("") ); 
	Actions a=new Actions(driver);
	a.moveToElement(mob).perform();
	WebElement rs = driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
	rs.click();
	
	}

}
