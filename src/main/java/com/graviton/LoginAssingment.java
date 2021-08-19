package com.graviton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAssingment {
    // Code <-> driver <-> Browser    -> They are using a protocol named WebDriver protocol
    public static void main(String [] args) throws InterruptedException {
        System.out.println("Hello Selenium....");

        System.setProperty("webdriver.gecko.driver", "/Users/talhaansari/Downloads/geckodriver");
        //WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.broadleafcommerce.org/");
        WebElement myElement = driver.findElement(By.xpath("//a[@href='/login']"));
        Thread.sleep(5000);
        myElement.click();
        WebElement Myemail= driver.findElement(By.xpath("//*[@id=\"username\"]"));
        Thread.sleep(2000);
        Myemail.sendKeys("Talhaansari92@gmail.com");
        WebElement Mypassword = driver.findElement(By.xpath("(//input[@id=\"password\"])[1]"));
        Thread.sleep(2000);
        Mypassword.sendKeys("Talha123");
        WebElement Rememberme = driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/label"));
        Rememberme.click();
        WebElement Login = driver.findElement(By.xpath("//*[@id=\"login\"]/form/button"));
        Login.click();

    }
}
