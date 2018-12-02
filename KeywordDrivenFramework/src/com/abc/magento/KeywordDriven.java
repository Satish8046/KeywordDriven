package com.abc.magento;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordDriven {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		FileInputStream fis=new FileInputStream("D:\\Selenium\\KeywordDrivenFramework\\src\\com\\abc\\utilities\\Keyword.properties"); 
		Properties p=new Properties();
		p.load(fis);
		driver.get("https://www.magento.com");
		driver.findElement(By.xpath(p.getProperty("myAcct"))).click();
		driver.findElement(By.xpath(p.getProperty("email"))).sendKeys("sucheendra.abc@gmail.com");
		driver.findElement(By.xpath(p.getProperty("pwd"))).sendKeys("Welcome123");
		driver.findElement(By.xpath(p.getProperty("login"))).click();
		driver.findElement(By.xpath(p.getProperty("logout"))).click();
		driver.close();
	}

}
