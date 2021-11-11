package Maven_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class KeyWords {
    WebDriver driver; // Class Level Driver
    public KeyWords(WebDriver driver) { // This Driver Coming from PomRunner(TestNG Class)
        this.driver = driver; // this.driver tells that Class Level driver
    }
    public void getUrl(String url) {
        driver.get(url);
    }
    public void selectFromDropDown(String locatorType, String locatorValue, String option) {
        Select sc=null;
        if (locatorType.equals("id"))
            sc = new Select(driver.findElement(By.id(locatorValue)));
        else if(locatorType.equals("name"))
            sc = new Select(driver.findElement(By.name(locatorValue)));
        else if(locatorType.equals("link"))
            sc = new Select(driver.findElement(By.linkText(locatorValue)));
        else if(locatorType.equals("css"))
            sc = new Select(driver.findElement(By.cssSelector(locatorValue)));
        else if(locatorType.equals("xpath"))
            sc = new Select(driver.findElement(By.xpath(locatorValue)));
        else
            System.out.println("Invalid Locator");
       
        sc.selectByVisibleText(option);
    }
    public void click(String locatorType, String locatorValue) {
        if (locatorType.equals("id"))
            driver.findElement(By.id(locatorValue)).click();
        else if(locatorType.equals("name"))
            driver.findElement(By.name(locatorValue)).click();
        else if(locatorType.equals("link"))
            driver.findElement(By.linkText(locatorValue)).click();
        else if(locatorType.equals("css"))
            driver.findElement(By.cssSelector(locatorValue)).click();
        else if(locatorType.equals("xpath"))
            driver.findElement(By.xpath(locatorValue)).click();
        else
            System.out.println("Invalid Locator");       
    }
}
