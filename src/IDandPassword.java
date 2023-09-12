import java.util.HashMap;

public class IDandPassword {

	HashMap<String, String> logininfo = new HashMap<>();
	
	IDandPassword(){
		logininfo.put("Siyum", "mynameissiyum");
		logininfo.put("Naflet", "nafi");
		logininfo.put("Tsigu", "tsigu2023");
	}
	
	protected HashMap getLoginInfo() {
		return logininfo;
	}
}
