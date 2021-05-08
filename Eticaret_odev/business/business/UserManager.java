package business;

import business.UserService;
import auth.AuthService;
import auth.EmailValidator;
import dataAccess.UserDao;
import entities.User;


public class UserManager implements UserService  {

	private UserDao userDao;
	private AuthService authService;
	
	
	public UserManager(UserDao userDao, AuthService authService) {
		
		super();
		this.userDao = userDao;
		this.authService = authService;
		
	
		@Override
		
		public void register(User user) {
			for (User users : UserDao.getUsers()) {
				if (users.getEmail().equals(user.getEmail())) {
					System.out.println("Girmi� Oldu�unuz Mail Adresi sistemde mevcut l�tfen ba�ka bir mail adresi deneyiniz");
					return;
					
					
				
				}
			}
			
			if (!EmailVaidator.isEmailValid(user.getEmail())) {
				System.out.println("Hata:mail adresi formata uygun de�il!");
			}	else if (user.get.firstName().length()< 2 || user.getLastName().length() < 2) {
					System.out.println("Ad soyad en az iki karakter olmal�d�r");
					
			}	else if (user.getPaswoord().length() < 6 ) {
					System.out.println("�ifre en az alt� karakter olmal�d�r");
			}	else {
				
				userDao.register(user);
				
			}
				
		}
		
		@Override
		public void login(User user) {
			if (user.isFlag()) {
				userDao.login(user);
				
			}	else {
				System.out.println("giri� ba�ar�s�z,"+user.getEmail() + ": adresine giden mail do�rulanamad� ");
			}
			
		}	
			
			
			@Override
			public void confirm(User user ) {
				userDao.confirm(user);
			
			}
				
			
		
		@Override
		
		
			public void registerWithGoogle(User user) {
				 user.isFlag(true);
				this.authService.register(user);
				
		}
		
		@Overrride
		
		public void loginWightGoogle(User user ) {
			if(user.isFlag()) {
				this.authService.login(user);
				
	
			}	else {
				System.oun.println("kay�t olmada giri� yapamazs�n�z.");
			
			
			}
			
				
			
			
			
		
			
		
		
	

	}

}
