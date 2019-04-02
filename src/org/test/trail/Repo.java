package org.test.trail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baru\\Desktop\\check repository\\trail\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://accounts.google.com/ServiceLogin?sacu=1&continue=https%3A%2F%2Fwww.google.co.in%2Fsearch%3Fq%3Dgmail%26oq%3Dgma%26aqs%3Dchrome.0.0j69i61j69i60j69i57j0l2.1658j0j7%26sourceid%3Dchrome%26ie%3DUTF-8&hl=en#identifier");
	
	
	WebElement ID =driver.findElement(By.id("identifierId"));
	ID.sendKeys("ibharathillangovan");
	System.out.println("done");
	
	
}
}
