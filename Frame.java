package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver frame = new ChromeDriver();
		
		frame.get("https://demo.automationtesting.in/Frames.html");
		frame.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement fr = frame.findElement(By.xpath("//a[@href=\'#Multiple\']"));
		fr.click();
		frame.switchTo().frame(1);
		frame.switchTo().frame(0);
		
		Thread.sleep(2000);
		frame.findElement(By.xpath("//input[@type='text']")).sendKeys("Ajathasatru");
		frame.switchTo().parentFrame();
		frame.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		WebElement my = frame.findElement(By.xpath("//a[@href='#Single']"));
		my.click();
		frame.switchTo().frame(0);
		Thread.sleep(2000);
		frame.findElement(By.xpath("//input[@type=\'text\']")).sendKeys("Hitler");
		
	}
	
	
	
	
	
	
	

}
