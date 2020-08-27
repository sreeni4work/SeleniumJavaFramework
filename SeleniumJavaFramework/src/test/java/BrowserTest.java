import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserTest {

	@Test
	public void chromeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumJavaFramework\\Resources\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	@Test
	public void fireFoxBrowser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumJavaFramework\\Resources\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		Thread.sleep(3000);
		driver.close();
	}
}
