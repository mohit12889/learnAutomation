import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DEMO {

	public static void main(String[] args) {
		System.out.println("Testing eclipse setup");

		System.setProperty("webdriver.gecko.driver","C:\\Users\\MDWIVEDI\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		driver.get("https://www.google.com/");
	}

}
