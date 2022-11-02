package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class Giftcards {


    protected static ChromeDriver driver;

    private static class WebDriver {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/test/java/driver/chromedriver.exe");


        driver=new ChromeDriver();
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        System.out.println(timeStamp);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("Gift Cards ")).click();
        driver.findElement(By.id("button-2 product-box-add-to-cart-button")).sendKeys("ADD TO CART");
        driver.findElement(By.id("recipient-name")).sendKeys("jay");
        driver.findElement(By.id("recipient-email")).sendKeys("jay@gmail.com");
        driver.findElement(By.id("sender-name")).sendKeys("Rathod");
        driver.findElement(By.id("sender-email")).sendKeys("rathod123@gmail.com");
        driver.findElement(By.id("giftcard_43_Message")).sendKeys("good");
        driver.findElement(By.id("add-to-cart-button-43")).click();

        String regMsg= driver.findElement(By.className("result")).getText();
        System.out.println(regMsg);
        driver.close();



    }
}
}