import org.testng.annotations.Test;

public class FacebookLogin {
	
	@Test
	public void loginWithValidCredentials(){
		System.out.println("Hi, I am sucessfully logged in");
	}

	@Test
	public void loginWithInvalidCredentials(){
		System.out.println("Hi, I am not able to log in");
	}
	
	@Test
	public void loginWithInvalidUsername(){
		System.out.println("Hi, I am not able to log in");
	}

}
