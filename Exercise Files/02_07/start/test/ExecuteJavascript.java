import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jude.ibegbulam\\Downloads\\Ex_Files_Selenium_EssT\\Ex_Files_Selenium_EssT\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));
        //closeButton.click(); we cannot click because this element is not interractable
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeButton);


        driver.quit();
    }
}
