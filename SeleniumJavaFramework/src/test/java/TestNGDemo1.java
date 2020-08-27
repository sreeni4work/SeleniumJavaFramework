import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	WebDriver driver = null;
	
	@BeforeTest
	public void setUp() {
		//driver = new FirefoxDriver();
		System.out.println("*** Driver setup completed ****");
	}
	@Test
	public void printOutput() throws InterruptedException {		
		//driver.get("https://www.google.com/");
		//driver.wait(5000);					
		System.out.println("*** This is a TestNG Demo ****");
	}
	@AfterTest
	public void tearDown() {
		//driver.quit();	
		System.out.println("*** Driver quit ****");
	}
}
