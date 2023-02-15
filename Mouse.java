package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        WebDriver mouse = new ChromeDriver();
        mouse.get("https://demo.guru99.com/test/drag_drop.html");
        mouse.manage().window().maximize();
        Actions a = new Actions(mouse);
        
        Thread.sleep(5000);
        
        WebElement drag = mouse.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        WebElement drop = mouse.findElement(By.xpath("(//li[@class=\'placeholder\'])[1]"));
        a.clickAndHold(drag).build().perform();
        a.dragAndDrop(drag,drop).build().perform();
        
        
        
//        WebElement drag1 = mouse.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
//        WebElement drop1 = mouse.findElement(By.xpath("(//li[@class=\'placeholder\'])[2]"));
//        a.click(drag1).build().perform();
//        a.dragAndDrop(drag1, drop1).build().perform();
        
        
		
	}

}
