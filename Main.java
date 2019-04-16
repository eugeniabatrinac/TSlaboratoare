package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        // C:\Users\jenifer\Downloads\chromedriver_win32
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        setProperty("webdriver.chrome.driver", "C:\\Users\\jenifer\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/hospital/public/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.cssSelector("#inputEmail"));
        searchBox.sendKeys("eu@dd.ru");
        searchBox = driver.findElement(By.cssSelector("#inputPassword"));
        searchBox.sendKeys("12");
        WebElement element = driver.findElement(By.cssSelector ("#bt"));
        element.submit();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        TimeUnit.SECONDS.sleep(10);
        driver.close();
        driver.quit();

    }
}

