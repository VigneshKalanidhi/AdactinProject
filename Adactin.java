package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver hotel = new ChromeDriver();
		
		hotel.get("https://adactinhotelapp.com/index.php");
		
		hotel.manage().window().maximize();
		
		WebElement user = hotel.findElement(By.id("username"));
		user.sendKeys("nvkstunner");
		
		WebElement pass = hotel.findElement(By.id("password"));
		pass.sendKeys("9840117988");
		
		Thread.sleep(5000);
		
		WebElement login = hotel.findElement(By.id("login"));
		login.click();
		
		WebElement location = hotel.findElement(By.id("location"));
		
		Select s = new Select(location);
		
		s.selectByValue("London");
		
		List<WebElement> locations = s.getAllSelectedOptions();
		
		for(WebElement l:locations) {
			System.out.println(l.getText());
			
		}
		
		WebElement hotels = hotel.findElement(By.xpath("//select[@name=\'hotels\']"));
		
		Select h = new Select(hotels);
		
		h.selectByValue("Hotel Sunshine");
		
		List<WebElement> Hotels = h.getAllSelectedOptions();
		
		for(WebElement H:Hotels) {
			System.out.println(H.getText());
		}
		
		WebElement room = hotel.findElement(By.xpath("//select[@name=\'room_type\']"));
		
		Select r = new Select(room);
		
		r.selectByIndex(1);
		
		List<WebElement> rooms = s.getAllSelectedOptions();
		
		for(WebElement R:rooms) {
			
		}
		WebElement person = hotel.findElement(By.xpath("//select[@name=\'adult_room\']"));
		
		Select p = new Select(person);
		
		p.selectByIndex(2);
		
		List<WebElement> persons = p.getOptions();
		
		for(int i = 0; i<persons.size();i++) {
			System.out.println(persons.get(i).getText());
			
		}
		WebElement child = hotels.findElement(By.xpath("//select[@name=\'child_room\']"));
		
		Select c = new Select(child);
		
		c.selectByIndex(0);
		List<WebElement> children = c.getAllSelectedOptions();
		
		for(WebElement C:children) {
			
		}
		
		Thread.sleep(2000);
		WebElement submit = hotels.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		WebElement button = hotel.findElement(By.xpath("//input[@name='radiobutton_0']"));
		button.click();
		
		Thread.sleep(2000);
		
		WebElement search = hotel.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		
		WebElement name = hotel.findElement(By.xpath("//input[contains(@name,'first_name')]"));
		name.sendKeys("Ajathasatru");
		
		WebElement last = hotel.findElement(By.xpath("//input[contains(@name,\'last_name\')]"));
		last.sendKeys("Bimbisara");
		
		WebElement address = hotel.findElement(By.id("address"));
		address.sendKeys("Rajgir,Bihar,India");
		
		WebElement cc = hotel.findElement(By.id("cc_num"));
		cc.sendKeys("9874563211234567");
		
		WebElement type = hotel.findElement(By.xpath("//select[contains(@name,\'cc_type\')]"));
		
		Select t = new Select(type);
		t.selectByIndex(2);
		List<WebElement> types = t.getAllSelectedOptions();
		for(WebElement T:types) {	
		}
		WebElement month = hotel.findElement(By.xpath("//select[contains(@name,\'cc_exp_month\')]"));
		Select m = new Select (month);
		m.selectByIndex(6);
		List<WebElement> months = m.getAllSelectedOptions();
		for(int i = 0; i<months.size();i++) {
	}
		WebElement year = hotel.findElement(By.xpath("//select[contains(@name,\"cc_exp_year\")]"));
		Select y = new Select(year);
		y.selectByVisibleText("2022");
	    List<WebElement> years = y.getAllSelectedOptions();
		for(WebElement Y:years) {
		}
		
		WebElement input = hotel.findElement(By.id("cc_cvv"));
		input.sendKeys("741");
		
		WebElement buttons = hotel.findElement(By.xpath("//input[(@type='button')]"));
		buttons.click();
		
		WebElement my = hotel.findElement(By.id("my_itinerary"));
		my.click();
		
		
	}
}
