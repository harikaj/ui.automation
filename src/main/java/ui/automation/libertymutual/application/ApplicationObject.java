package ui.automation.libertymutual.application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.automation.libertymutual.pages.PersonalInformaion;
import ui.automation.libertymutual.pages.SelectProduct;

public class ApplicationObject {
    public PersonalInformaion personalInformaion;
    public SelectProduct selectProduct;



    public ApplicationObject(ChromeDriver driver) throws Exception {

        personalInformaion = new PersonalInformaion(driver);
        selectProduct = new SelectProduct(driver);

    }
}
