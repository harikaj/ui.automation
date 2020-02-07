package ui.automation.libertymutual.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import ui.automation.libertymutual.constants.ApplicationConstants;
import ui.automation.libertymutual.CommonController;
import ui.automation.libertymutual.constants.XpathConstants;

public class PersonalInformaion {
    ChromeDriver driver;

    public PersonalInformaion(ChromeDriver driver) {
        this.driver = driver;
    }

    public void enterPersonalInformation() {
        CommonController.waitForElement(driver, XpathConstants.ADDRESS_XPATH, 20);

        WebElement address = driver.findElement(By.xpath(XpathConstants.ADDRESS_XPATH));
        address.sendKeys(ApplicationConstants.ADDRESS);

        Select yearsAtResidence = new Select(driver.findElement(By.xpath(XpathConstants.YEARS_AT_RESIDENCE_XPATH)));
        yearsAtResidence.selectByIndex(ApplicationConstants.YEARS_AT_RESIDENCE);

        WebElement nextButtonElement = driver.findElement(By.xpath(XpathConstants.NEXT_BUTTON_XPATH));
        nextButtonElement.click();
    }
}
