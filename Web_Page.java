package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Web_Page {
	
public static void main(String[] args) throws InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver web = new ChromeDriver();
		
		web.get("https://in.linkedin.com/in/vignesh-kalanidhi-6bb978158");
		Thread.sleep(2000);
		
		TakesScreenshot t = (TakesScreenshot)web;
		File f1 = t.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Screenshot\\linkedin.jpeg");
		//FileHandler.copy(f1, f);
		FileUtils.copyFile(f1, f);
		
	}

}

