package testcases;

import org.testng.annotations.Test;

public class LoginPageTests {

	@Test
	public void verifyLoginWithValidCred() {
		
		System.out.println("Verify Login with valid creditials is successfull");
	}
	
	@Test
	public void verifyLoginWithInValidCred() {
		
		System.out.println("Verify Login with invalid creditials is unsuccessfull");
	}
	
	
}
