
public class Main {

	public static void main(String[] args) {

		IDandPassword idandPassword = new IDandPassword();
		
		LoginPage loginPage = new LoginPage(idandPassword.getLoginInfo());
	}

}
