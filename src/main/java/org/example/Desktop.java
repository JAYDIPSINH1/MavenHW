package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class Desktop {


    protected static ChromeDriver driver;

    private static class webDriver {

        public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver","src/test/java/driver/chromedriver.exe");

            driver = new ChromeDriver();
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
            System.out.println(timeStamp);
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
            driver.findElement(By.className("news")).click();
            driver.findElement(By.id("AddNewComment.CommentTitle")).sendKeys("Working properly");
            driver.findElement(By.id("enter-comment-text")).sendKeys("ok");
            driver.findElement(By.id("New comment")).click();

            String regMsg= driver.findElement(By.className("result")).getText();
            System.out.println(regMsg);
            driver.close();



        }
    }
}