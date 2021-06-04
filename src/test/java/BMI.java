import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BMI {
    @Test
    public void enterValidImperialValue(){
        System.setProperty("webdriver.chrome.driver","D:\\testing\\Health\\src\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElementByName("wg").sendKeys("70");
        Select dropDown = new Select(driver.findElementByName("opt1"));
        dropDown.selectByValue("pounds");
        Select height1 = new Select(driver.findElementByName("opt2"));
        height1.selectByValue("6");
        Select height2 = new Select(driver.findElementByName("opt3"));
        height2.selectByValue("2");
        driver.findElementByCssSelector("[value = Calculate]").click();
        String result = driver.findElementByName("desc").getAttribute("value");
        Assert.assertEquals(result,"Your category is Normal"," Incorrect category is displayed when " +
                "calculating in pounds");
driver.quit();
    }
    @Test
    public void enterValidMetricValue (){
        System.setProperty("webdriver.chrome.driver","D:\\testing\\Health\\src\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElementByName("wg").sendKeys("70");
        driver.findElementByName("ht").sendKeys("189");
        driver.findElementByCssSelector("[value = Calculate]").click();
        String result = driver.findElementByName("desc").getAttribute("value");
        Assert.assertEquals(result,"Your category is Normal", "Incorrect category is displayed when" +
                "calculating in pounds");
        driver.quit();
    }
    @Test
    public void checkBmiValueFor14 (){
        System.setProperty("webdriver.chrome.driver","D:\\testing\\Health\\src\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElementByName("wg").sendKeys("54");
        driver.findElementByName("ht").sendKeys("195");
        driver.findElementByCssSelector("[value = Calculate]").click();
        String index = driver.findElementByName("si").getAttribute("value");
        Assert.assertEquals(index,"14.2","BMI value calculated incorrectly ");
        String result = driver.findElementByName("desc").getAttribute("value");
        Assert.assertEquals(result,"Your category is Starvation", "Incorrect category is displayed when" +
                "calculating in pounds");
        driver.quit();
    }
    @Test
    public void checkBmiValueFor15 (){
        System.setProperty("webdriver.chrome.driver","D:\\testing\\Health\\src\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElementByName("wg").sendKeys("57");
        driver.findElementByName("ht").sendKeys("193");
        driver.findElementByCssSelector("[value = Calculate]").click();
        String index = driver.findElementByName("si").getAttribute("value");
        Assert.assertEquals(index,"15.3","BMI value calculated incorrectly ");
        String result = driver.findElementByName("desc").getAttribute("value");
        Assert.assertEquals(result,"Your category is Underweight", "Incorrect category is displayed when" +
                "calculating in pounds");
        driver.quit();
    }
    @Test
    public void checkBmiValueFor18_5 (){
        System.setProperty("webdriver.chrome.driver","D:\\testing\\Health\\src\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElementByName("wg").sendKeys("69");
        driver.findElementByName("ht").sendKeys("193");
        driver.findElementByCssSelector("[value = Calculate]").click();
        String index = driver.findElementByName("si").getAttribute("value");
        Assert.assertEquals(index,"18.52","BMI value calculated incorrectly ");
        String result = driver.findElementByName("desc").getAttribute("value");
        Assert.assertEquals(result,"Your category is Normal", "Incorrect category is displayed when" +
                "calculating in pounds");
        driver.quit();
    }
    @Test
    public void checkBmiValueFor25 (){
        System.setProperty("webdriver.chrome.driver","D:\\testing\\Health\\src\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElementByName("wg").sendKeys("92");
        driver.findElementByName("ht").sendKeys("191");
        driver.findElementByCssSelector("[value = Calculate]").click();
        String index = driver.findElementByName("si").getAttribute("value");
        Assert.assertEquals(index,"25.22","BMI value calculated incorrectly ");
        String result = driver.findElementByName("desc").getAttribute("value");
        Assert.assertEquals(result,"Your category is Overweight", "Incorrect category is displayed when" +
                "calculating in pounds");
        driver.quit();
    }
    @Test
    public void checkBmiValueFor30 (){
        System.setProperty("webdriver.chrome.driver","D:\\testing\\Health\\src\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElementByName("wg").sendKeys("89");
        driver.findElementByName("ht").sendKeys("172");
        driver.findElementByCssSelector("[value = Calculate]").click();
        String index = driver.findElementByName("si").getAttribute("value");
        Assert.assertEquals(index,"30.08","BMI value calculated incorrectly ");
        String result = driver.findElementByName("desc").getAttribute("value");
        Assert.assertEquals(result,"Your category is Obese", "Incorrect category is displayed when" +
                "calculating in pounds");
        driver.quit();
    }
}
