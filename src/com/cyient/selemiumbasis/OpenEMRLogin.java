package com.cyient.selemiumbasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class OpenEMRLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		//dropdown
		Select selectLanguage=new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Indian)");
		driver.findElement(By.linkText("btnLogin")).click();
		
		Select selectPatient/Client=new Select(driver.findElement(By.name("menuLabel dropdown-toggle oe-dropdown-toggle")));
		selectPatient/Client .selectByVisibleText("Patient");
		
		
		
		String obj=driver.getTitle();
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Billy']"))).perform();
		driver.findElement(By.xpath("//li[text()='Logout']")).clear();
		

	}

}
