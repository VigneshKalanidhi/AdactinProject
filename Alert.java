package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver web = new ChromeDriver();
		
		web.get("https://demoqa.com/alerts");
		web.manage().window().maximize();
		WebElement button = web.findElement(By.id("alertButton"));
		button.click();
		Thread.sleep(2000);
		
		web.switchTo().alert().accept();
        
        WebElement confirm = web.findElement(By.id("confirmButton"));
        confirm.click();
        Thread.sleep(2000);
        
        web.switchTo().alert().accept();
        
        WebElement prompt = web.findElement(By.id("promtButton"));
        prompt.click();
        
        String text = web.switchTo().alert().getText();
        
        System.out.println(text);
        Thread.sleep(5000);
        web.switchTo().alert().sendKeys("Ajathasatru");
        web.switchTo().alert().accept();
        
        
        
}
}