package com.Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver web = new ChromeDriver();
		
		web.get("https://www.amazon.in");
		web.manage().window().maximize();
		
		Thread.sleep(2000);
		
		web.navigate().to("https://www.flipkart.com/");
		
		String title = web.getTitle();
		System.out.println(title);
		
		String url = web.getCurrentUrl();
		System.out.println(url);
		
		web.navigate().back();
		
		Thread.sleep(2000);
		
		String title1 = web.getTitle();
		System.out.println(title1);
		
		String url1 = web.getCurrentUrl();
		System.out.println(url1);
		
		web.navigate().forward();
		
	    Thread.sleep(2000);
	    
	    web.navigate().to("https://www.facebook.com/");
		
	    String title2 = web.getTitle();
	    System.out.println(title2);
	    
	    String current = web.getCurrentUrl();
	    System.out.println(current );
	    
	    Thread.sleep(5000);
	    
	    web.navigate().refresh();
		
		
		
	}

}
