package auth;
import entities.User;


public class GoogleAuthManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName()+" : Google ile Kay�t Ger�ekle�tirildi.");
		
		
	}
	public void login(User user) {
		System.out.println(user.getFirstName()+": Google �le Giri� ��lemi Tamamland�.");
		
	}

}
