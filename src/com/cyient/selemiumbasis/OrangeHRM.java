package com.cyient.selemiumbasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		
		/*drive.findElements(By.id("menu_pim_viewMyDetails")).click();*/
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("personal_txtOtherID")).sendKeys("testing");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.LinkText("Emerergency Contacts")).click();
		driver.findElement(By.id("Saks")).sendKeys("adm");
		driver.findElement(By.name("emgcontacts_relationship")).sendKeys("Mother");
		driver.findElement(By.id("contact_relationship")).sendKeys("98764");
		
		)

	}

}
