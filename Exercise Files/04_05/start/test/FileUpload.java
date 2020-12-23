import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jude.ibegbulam\\Downloads\\Ex_Files_Selenium_EssT\\Ex_Files_Selenium_EssT\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement upload = driver.findElement(By.id("file-upload-field"));
        upload.sendKeys("myfile.png");

        driver.quit();
    }
}
