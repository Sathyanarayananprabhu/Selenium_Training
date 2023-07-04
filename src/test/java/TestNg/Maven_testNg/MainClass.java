package TestNg.Maven_testNg;

import java.util.Set;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainClass extends SignInPage{
	@BeforeTest
	public void setUp() {
		super.setup();
	}
@Test
public void amazonSignUp() {

	
	menu();
	clickSignIn();
	waitForSeconds(5);
	signIn1("sathyanarayanan.c2001@gmail.com");
	password("thanmadhi2k01");
	searchBox("iphone14");
	waitForSeconds(10);
	searchButton();
	iphone();
	switchmeth();
	adToCrt();
	menu();
	waitForSeconds(5);
	sgnOut();
	driver.quit();
	
	
}

}
