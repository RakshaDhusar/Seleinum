package com.cyient.meddybuddy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.medibuddy.in/");
		
		/*Thread.sleep(10000);*///wait for 15 sec
		driver.findElement(By.linkText("Signup")).click();
		
		/*Thread.sleep(10000);*/
		driver.findElement(By.name("firstName")).sendKeys("Rak");
		driver.findElement(By.name("phone")).sendKeys("2345");
		driver.findElement(By.name("username")).sendKeys("RD.@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Rak");
		
		
		
		driver.findElement(By.xpath("//span[text()='Are you a corporate user?']"));
		
		driver.findElement(By.name("employeeId")).sendKeys("RD234");
		
		Select selectYear = new Select(driver.findElement(By.xpath("//select[@ng-model='date.year']")));
        selectYear.selectByVisibleText("2000");
        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@ng-model='date.month']")));
        selectMonth.selectByVisibleText("12");
        Select selectDate = new Select(driver.findElement(By.xpath("//select[@ng-model='date.day']")));
        selectDate.selectByVisibleText("06");
		
		driver.findElement(By.xpath("//span[text()='Male']"));
		driver.findElement(By.xpath("//span[text()='Female']"));
		
	}

}
