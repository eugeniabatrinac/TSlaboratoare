package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.CompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        // C:\Users\jenifer\Downloads\chromedriver_win32
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        setProperty("webdriver.chrome.driver", "C:\\Users\\jenifer\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://vk.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.cssSelector("#index_email"));
        searchBox.sendKeys("+37369294810");
        searchBox = driver.findElement(By.cssSelector("#index_pass"));
        searchBox.sendKeys("parola");
        WebElement element = driver.findElement(By.id("index_login_button"));
        element.submit();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://vk.com/feed");
        driver.close();
        driver.quit();

    }
}

