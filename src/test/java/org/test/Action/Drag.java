package org.test.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\ActionsClass\\driver\\chromedriver.exe"); 
	WebDriver driver=new ChromeDriver();
	driver.get(" http://demo.guru99.com/test/drag_drop.html ");
	WebElement source1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement destination1 = driver.findElement(By.xpath("(//ol[@id='bank'])[1]"));
	Actions a=new Actions(driver);
	a.dragAndDrop(source1, destination1).perform();
	
	WebElement source2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement destination2 = driver.findElement(By.id("amt7"));
	a.dragAndDrop(source2, destination2).perform();
	
	WebElement source3 = driver.findElement(By.xpath(" //a[text()=' SALES ']"));
	WebElement destination3 = driver.findElement(By.id("loan"));
	a.dragAndDrop(source3, destination3).perform();
	
	
	WebElement source4 = driver.findElement(By.xpath(" //a[text()=' 5000 ']"));
	WebElement destination4 = driver.findElement(By.id("amt8"));
	a.dragAndDrop(source4, destination4).perform();
	
	
	}

}
