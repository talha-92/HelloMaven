package com.graviton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MavenAssignment {
    public static void main(String [] args) throws InterruptedException {
        System.out.println("Hello Maven......");
        System.setProperty("webdriver.gecko.driver","/Users/talhaansari/desktop/driver/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.cars.com/");
        Thread.sleep(5000);
        driver.get("https://www.facebook.com/");

        Thread.sleep(5000);


        System.out.println("I am from NYC...");
    }
}
