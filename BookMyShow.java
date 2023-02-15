package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver book = new ChromeDriver();
		book.get("https://in.bookmyshow.com/explore/home/chennai");
		book.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement movies = book.findElement(By.xpath("//a[text()=\'Movies\']"));
		movies.click();
		
		 Thread.sleep(2000);
		 WebElement broker = book.findElement(By.xpath("//img[@alt='Malikappuram']"));
		 broker.click();
		 Thread.sleep(2000);
		 WebElement ticket = book.findElement(By.xpath("(//button[@data-phase='postRelease'])[1]"));
		 ticket.click();
		 
		 WebElement text = book.findElement(By.xpath("//div[@class='__text']"));
		 text.click();
		 
     	 WebElement pop = book.findElement(By.id("btnPopupAccept"));
		 pop.click();
		 
	}

}
