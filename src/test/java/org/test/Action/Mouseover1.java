package org.test.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouseover1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\ActionsClass\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.gettyimages.in/");
	WebElement edit = driver.findElement(By.xpath("(//a[text()='EDITORIAL'])[2]"));
	edit.click();
	WebElement ent = driver.findElement(By.xpath("//a[text()='Entertainment']"));
	ent.click();
	}

}
