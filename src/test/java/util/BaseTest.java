package util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import ui.automation.libertymutual.application.ApplicationObject;

import java.io.File;
import java.lang.reflect.Method;
import org.testng.Assert;

public class BaseTest {
        public static ObjectNode dataset;
        public static ObjectMapper mapper = new ObjectMapper();
        public static ChromeDriver driver;
        public ApplicationObject applicationObject;
        static
        {
                try
                {

                        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\lib\\drivers\\windows\\chromedriver.exe");
                        dataset= (ObjectNode) mapper.readTree(new File(System.getProperty("user.dir")+"\\dataset\\production\\prod.json"));
                        System.out.println("Prod Json: "+ System.getProperty("user.dir")+"\\dataset\\production\\prod.json");
                        System.out.println("Data set: "+ dataset);

                        System.out.println("Chrome browser launched");
                        driver=new ChromeDriver();
                }
                catch (Exception ex)
                {
                        ex.printStackTrace();
                }
        }

        public ApplicationObject applicationObject() throws Exception {
                if (this.applicationObject == null) {
                        applicationObject = new ApplicationObject(driver);
                }
                return applicationObject;
        }


        @BeforeMethod(alwaysRun = true)
        public void beforeMethod(Method method) throws Exception {
                System.out.println("Before method application");

        }

        @AfterSuite(alwaysRun = true)
        public void afterSuite() throws Exception
        {
                System.out.println("Close application");
                driver.close();
        }

}
