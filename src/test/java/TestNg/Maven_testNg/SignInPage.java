package TestNg.Maven_testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
@Test

public class SignInPage extends HomePage {




	public void password (String Passwords) {

		WebElement we =driver.findElement(By.xpath(Password));
		sendKeys(we, Passwords);
		WebElement we1 =driver.findElement(By.xpath(Signinbtnaftr));
		click(we1);

	}

	public void signIn1(String EmailID) {
		WebElement we1 = driver.findElement(By.xpath(Email));
		sendKeys(we1, EmailID);
		WebElement we2=driver.findElement(By.xpath(Continue));

		click(we2);	
	}

}
