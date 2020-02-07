package validateLogin;

import org.testng.annotations.Test;
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
    public void enterValidData() throws Exception
    {
        applicationObject().selectProduct.selectProductDetails("01721");
        applicationObject.personalInformaion.enterPersonalInformation();
    }

    @Test
    public void enterInvalidZip() throws Exception
    {
        applicationObject().selectProduct.selectProductDetails("00000");
        applicationObject.personalInformaion.enterPersonalInformation();
    }
}
