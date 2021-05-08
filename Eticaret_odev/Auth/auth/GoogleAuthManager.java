package auth;
import entities.User;


public class GoogleAuthManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName()+" : Google ile Kayýt Gerçekleþtirildi.");
		
		
	}
	public void login(User user) {
		System.out.println(user.getFirstName()+": Google Ýle Giriþ Ýþlemi Tamamlandý.");
		
	}

}
