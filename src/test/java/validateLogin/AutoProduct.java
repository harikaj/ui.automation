package validateLogin;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import ui.automation.libertymutual.pages.PersonalInformaion;
import ui.automation.libertymutual.pages.SelectProduct;
import util.BaseTest;

import java.lang.reflect.Method;

public class AutoProduct extends BaseTest {

    @Test
    public void enterProductDetails() throws Exception
    {
      /*  SelectProduct selectProduct = new SelectProduct(driver);
        selectProduct.selectProductDetails();
        PersonalInformaion personalInformaion = new PersonalInformaion(driver);
        personalInformaion.enterPersonalInformation();*/
        applicationObject().selectProduct.selectProductDetails();
        applicationObject.personalInformaion.enterPersonalInformation();
        System.out.println("At close : "+ driver);
        driver.close();
    }
}
