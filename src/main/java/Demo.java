import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://zoom.us/");
        driver.findElement(By.xpath("//ul[@role='menubar']/li[1]/a[1]")).click();
        driver.findElement(By.id("email")).sendKeys("sripraksh@gmail.com");
        driver.findElement(By.id("company")).sendKeys("company");
        driver.findElement(By.className("first_name")).sendKeys("company");
        Thread.sleep(10000);
        driver.quit();
    }
}
