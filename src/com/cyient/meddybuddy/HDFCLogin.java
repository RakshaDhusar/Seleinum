package com.cyient.meddybuddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame("login_page");
				
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("test123");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
	       
		
	}

}
