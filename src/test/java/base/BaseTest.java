package base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop;

	public BaseTest() {
		prop = new Properties();
		String path = System.getProperty("user.dir") + "/src/test/resources//configFiles//config.properties";
		FileInputStream file;

		try {
			file = new FileInputStream(path);
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initialize() {
		String browser = prop.getProperty("browser");
		// Singleton Pattern
		if (driver == null) {
			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

	}
}
