package ui.automation.libertymutual.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import ui.automation.libertymutual.constants.ApplicationConstants;
import ui.automation.libertymutual.CommonController;
import ui.automation.libertymutual.constants.XpathConstants;

public class SelectProduct {

    ChromeDriver driver;
    public SelectProduct(ChromeDriver driver) {
        this.driver = driver;
    }

    public void selectProductDetails() {
        driver.get(ApplicationConstants.HTTPS_WWW_LIBERTYMUTUAL_COM);
        WebElement autoElement = driver.findElement(By.xpath(XpathConstants.PRODUCT_AUTO_XPATH));
        autoElement.click();
        CommonController.waitForElement(driver, XpathConstants.INPUT_NAME_ZIPCODE, 15);
        WebElement zipCodeElement = driver.findElement(By.xpath(XpathConstants.INPUT_NAME_ZIPCODE));
        Assert.assertTrue(zipCodeElement.isDisplayed(), "Zip code element is visible as expected");
        zipCodeElement.sendKeys(ApplicationConstants.ZIPCODE);

        CommonController.waitForElement(driver, XpathConstants.SUBMIT_XPATH, 15);
        WebElement submitElement = driver.findElement(By.xpath(XpathConstants.SUBMIT_XPATH));
        submitElement.click();
    }
}
