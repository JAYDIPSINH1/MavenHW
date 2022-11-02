package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class computer {

    protected static ChromeDriver driver;

    private static class webDriver {


        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");

            driver = new ChromeDriver();
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
            System.out.println(timeStamp);
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
            driver.findElement(By.className("Computers ")).click();
            driver.findElement(By.id("desktops")).sendKeys("Add to cart");


        }
    }
}