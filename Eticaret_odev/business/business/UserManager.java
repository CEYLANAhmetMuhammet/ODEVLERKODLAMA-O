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
					System.out.println("Girmiþ Olduðunuz Mail Adresi sistemde mevcut lütfen baþka bir mail adresi deneyiniz");
					return;
					
					
				
				}
			}
			
			if (!EmailVaidator.isEmailValid(user.getEmail())) {
				System.out.println("Hata:mail adresi formata uygun deðil!");
			}	else if (user.get.firstName().length()< 2 || user.getLastName().length() < 2) {
					System.out.println("Ad soyad en az iki karakter olmalýdýr");
					
			}	else if (user.getPaswoord().length() < 6 ) {
					System.out.println("þifre en az altý karakter olmalýdýr");
			}	else {
				
				userDao.register(user);
				
			}
				
		}
		
		@Override
		public void login(User user) {
			if (user.isFlag()) {
				userDao.login(user);
				
			}	else {
				System.out.println("giriþ baþarýsýz,"+user.getEmail() + ": adresine giden mail doðrulanamadý ");
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
				System.oun.println("kayýt olmada giriþ yapamazsýnýz.");
			
			
			}
			
				
			
			
			
		
			
		
		
	

	}

}
