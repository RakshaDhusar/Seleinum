package com.cyient.dynamic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoyalSignupTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			driver.get("https://www.royalcaribbean.com/account/create");
            
			 driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Rak");
			 driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("Dhu");
			 
			 driver.findElement(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c51-12 ng-star-inserted']")).click();
			 driver.findElement(By.xpath("//span[text()=' April ']")).click();
			 
			 driver.findElement(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c51-14 ng-star-inserted']")).click();
			 driver.findElement(By.xpath("//span[text()=' 4 ']")).click();
			 
			/* driver.findElement(By.xpath("input[@data-placeholder=' Year ']")).sendKeys("2021");*/
			 driver.findElement(By.xpath("//input[@aria-label='Year']")).click();
		        driver.findElement(By.xpath("//input[@aria-label='Year']")).sendKeys("2021");
			 
			/* driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
			 driver.findElement(By.xpath("//span[text()=' India ']")).click();*/
		        driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
		        driver.findElement(By.xpath("//span[text()=' India ']")).click();
		        
		        driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).click();
		        driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("RD@gmail.com");
		        
		        driver.findElement(By.xpath("//input[@data-placeholder=' Create new password ']")).click();
		        driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("fvbhhnbb");
		        		
		         driver.findElement(By.xpath("//span[text()='Select one security question']")).click();
		         driver.findElement(By.xpath("//span[text()=' Where did you take your first vacation? ']")).click();
		         		
		        driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).click();
		       driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("Jhansi");
		       		
		     driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();
		        driver.findElement(By.xpath("//button[@class='mat-royal-button btn-create']")).click();
}
}