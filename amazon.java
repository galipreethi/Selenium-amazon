package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon
{
public static void main (String[] args)
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\selenium webdriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");


driver.findElement(By.id("twotabsearchtextbox")).clear();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("MacBook air");
driver.findElement(By.className("nav-input")).click();
String text = driver.findElement(By.xpath("//*[@id='result_0']/div/div[3]/div[1]/a/h2")).getText();

if (text.contains("MacBook air")){
driver.findElement(By.xpath("//*[@id='result_0']/div/div[3]/div[1]/a/h2")).click();
} else {
System.out.println("There is no MacBook Air");
}
driver.findElement(By.id("add-to-cart-button")).click();
}
}
driver.findElement(By.name("proceedToRetailCheckout"")).click();
}