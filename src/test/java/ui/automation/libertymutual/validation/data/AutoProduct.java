package ui.automation.libertymutual.validation.data;

import ui.automation.libertymutual.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.automation.libertymutual.CommonController;
import ui.automation.libertymutual.constants.XpathConstants;

public class AutoProduct extends BaseTest {


    @Test(priority = 1)
    public void enterInvalidZip() throws Exception {
        Assert.assertTrue(applicationObject().homePage.clickAuto(),"Auto is clicked");

        boolean zipCodeClicked=applicationObject().selectProduct.enterZipCode(dataset.get("invalidZip").get("zipcode").asText());
        Assert.assertTrue(zipCodeClicked, "Zip code entered");

        Assert.assertTrue(applicationObject().selectProduct.clickGetPriceButton(), "Submit button is clicked");

        CommonController.waitForElement(driver, XpathConstants.ZIPCODE_VALIDATION_MESSAGE_XPATH, 15);
        WebElement zipCodeValidationMessage = driver.findElement(By.xpath(XpathConstants.ZIPCODE_VALIDATION_MESSAGE_XPATH));
        Assert.assertTrue(zipCodeValidationMessage.isDisplayed(), "Zip code validation message showed up as expected");
    }

    @Test(priority = 2)
    public void enterValidData() throws Exception {
        driver.navigate().to(driver.getCurrentUrl());
        Assert.assertTrue(applicationObject().homePage.clickAuto(),"Auto is clicked");

        boolean zipCodeClicked=applicationObject().selectProduct.enterZipCode(dataset.get("valid").get("zipcode").asText());
        Assert.assertTrue(zipCodeClicked, "Zip code entered");

        Assert.assertTrue(applicationObject().selectProduct.clickGetPriceButton(), "Submit button is clicked");

        applicationObject().personalInformation.enterPersonalInformation(dataset.get("valid").get("address").asText(), dataset.get("valid").get("yearsAtResidence").asInt());
    }
}
