package com.graviton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class RegisterAssignment {
    // Code <-> driver <-> Browser    -> They are using a protocol named WebDriver protocol
    public static void main(String [] args) throws InterruptedException {
        System.out.println("Hello Selenium....");

        System.setProperty("webdriver.gecko.driver","/Users/talhaansari/Downloads/geckodriver");
        //WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.broadleafcommerce.org/");
                                        //Register
        WebElement myElement = driver.findElement(By.xpath("//a[@href='/login']"));
        Thread.sleep(5000);
        myElement.click();
        Thread.sleep(5000);
        WebElement RegisterEmail = driver.findElement(By.xpath("//*[@id=\"customer.emailAddress\"]"));
        Thread.sleep(2000);
        RegisterEmail.sendKeys("talhaansari92@gmail.com");
        WebElement MyFirstName = driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]"));
        Thread.sleep(2000);
        MyFirstName.sendKeys("Talha");
        WebElement MyLastName = driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]"));
        Thread.sleep(2000);
        MyLastName.sendKeys("Ansari");
        WebElement Mypassword =driver.findElement(By.xpath("(//input[@id=\"password\"])[2]"));
        Thread.sleep(2000);
        Mypassword.sendKeys("Talha123");
        WebElement ConPassword= driver.findElement(By.xpath("//*[@id=\"passwordConfirm\"]"));
        Thread.sleep(2000);
        ConPassword.sendKeys("Talha123");
        WebElement Registerme= driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/button"));
        Registerme.click();
                                         //login







        //driver.quit();


    }

}
