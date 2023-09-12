import java.util.HashMap;

public class IDandPassword {

	HashMap<String, String> logininfo = new HashMap<>();
	
	IDandPassword(){
		logininfo.put("Bro", "pizza");
		logininfo.put("Brometheus", "PASSWORD");
		logininfo.put("BroCode", "abc123");
	}
	
	protected HashMap getLoginInfo() {
		return logininfo;
	}
}
