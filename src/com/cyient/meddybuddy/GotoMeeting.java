package com.cyient.meddybuddy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GotoMeeting {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gotomeeting.com/en-in");
		
		Select selectCountry = new Select(driver.findElement(By.xpath("//select[@ng-model='language-modal__select-element']")));
        Select.selectCountry("India (English)");
		
		driver.findElement(By.xpath("//button[text()='Go']"));
		
		driver.findElement(By.id("firstname")).sendKeys("Rak");
		driver.findElement(By.id("lastname")).sendKeys("dhu");
		driver.findElement(By.name("login__email")).sendKeys("RD.gmail.com");
		driver.findElement(By.id("contact-number")).sendKeys("98677");
		
		Select selectJobTitle=new Select(driver.findElement(By.name("JobTitle")));
		selectJobTitle.selectByVisibleText("Help Desk");
		
		driver.findElement(By.id("login__password")).sendKeys("Auto-Tester");
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
		
		

	}

}
