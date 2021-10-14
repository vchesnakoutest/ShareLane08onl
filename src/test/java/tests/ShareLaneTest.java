package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShareLaneTest {
    //1. Open browser, URL - https://www.sharelane.com/cgi-bin/register.py
    //2. Enter value in ZIP code field
    //3. Click Continue button

    @Test
    public void fillInZipCodeFieldWithEmptyDataTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("444444");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        String text = driver.findElement(By.xpath("//*[@value='error_message']")).getText();
        Assert.assertEquals(text, "Oops, error on page. Some of your fields have invalid data or email was previously used");
        driver.quit();
    }

    @Test
    public void fillInZipCodeFieldWithMandatoryFieldsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("444444");
        driver.findElement(By.xpath("//*[@value='Continue1']")).click();
        driver.findElement(By.xpath("//*[@value='Register1']")).click();
    }

    @Test
    public void fillInZipCodeFieldWithMandatoryFieldsTest2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("444444");
        driver.findElement(By.xpath("//*[@value='git rm --cached -r .idea']")).click();
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }

    @Test
    public void fillInZipCodeFieldWithMandatoryFieldsTest3() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("444444");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }

    @Test
    public void fillInZipCodeFieldWithMandatoryFieldsTest4() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("444444");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }
}
