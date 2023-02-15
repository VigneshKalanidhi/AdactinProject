package com.Selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver cli = new ChromeDriver();
		
		cli.get("https://www.flipkart.com/");
		cli.manage().window().maximize();
		
		WebElement mobiles = cli.findElement(By.xpath("//img[@alt=\"Mobiles\"]"));
		Actions ac = new Actions(cli);
		ac.doubleClick(mobiles).build().perform();
		
		
	}

}
