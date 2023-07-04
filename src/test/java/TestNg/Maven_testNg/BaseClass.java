package TestNg.Maven_testNg;



import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass extends AmazonConstants {

	static WebDriver driver;
	Actions actions;

	public BaseClass setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BaseUrl);

		return this;

	}

	public void click(WebElement ele) {
		ele.click();

	}
	public void sendKeys(WebElement element ,String textToEnter) {
		element.click();
		element.clear();
		element.sendKeys(textToEnter);

	}
	public void scrollToElement (WebElement ele) {
		actions = new Actions(driver);

		actions.moveToElement(ele);

	}
	public void waitForSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void switchmeth() {
		Set<String> handles  = driver.getWindowHandles();

		String[] array = handles.toArray(new String[0]);

		int arrayindex = 1;
		driver.switchTo().window(array[arrayindex]);

	}

}

