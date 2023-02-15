package com.Selenium;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyEvent {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver web = new ChromeDriver();
		
		web.get("https://www.flipkart.com/");
		
		WebElement lazy = web.findElement(By.xpath("//img[@loading='lazy']"));
		Actions a = new Actions(web);
		a.contextClick().build().perform();
		
		Robot r = new Robot();
		
		for(int i=0;i<2;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
		}
	
	
	
	
	
	
	

}
