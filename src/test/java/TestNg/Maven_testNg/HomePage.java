package TestNg.Maven_testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {

	public void menu() {
		WebElement menu = driver.findElement(By.xpath(Hamburgermenu));
		click(menu);

	}

	public void clickSignIn() {
		WebElement we = driver.findElement(By.xpath(SigninBtn));
		scrollToElement(we); 
		click(we);
	}

	public void searchBox(String search) {

		WebElement we = driver.findElement(By.xpath(SearchBox));
		sendKeys(we, search);

	}
	public void  iphone() {
		WebElement we = driver.findElement(By.xpath(Iphone14));
		click(we);
	}
	public void adToCrt() {
		WebElement we = driver.findElement(By.xpath(AddToCart));
		click(we);
	}
	public void sgnOut() {
		WebElement we = driver.findElement(By.xpath(SignOut));
		scrollToElement(we);
		click(we);
	}
	public void searchButton() {
		WebElement we = driver.findElement(By.xpath(SearchBtn));
		click(we);
	}

}
