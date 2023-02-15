package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedin {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver web = new ChromeDriver();
		
		web.get("https://in.linkedin.com/");
		
		web.manage().window().maximize();
		
		WebElement email = web.findElement(By.id("session_key"));
		
		email.sendKeys("vigneshkalanidhi67@gmail.com");
		
		WebElement password = web.findElement(By.id("session_password"));
		
		password.sendKeys("Leelavathi@2");
		
		Thread.sleep(5000);
		
		WebElement log = web.findElement(By.className("sign-in-form__submit-button"));
		
		log.click();
			

}
}
