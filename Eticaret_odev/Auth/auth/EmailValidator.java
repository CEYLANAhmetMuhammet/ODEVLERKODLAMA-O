package auth;
import java.util.regex.Pattern;

public class EmailValidator {

	private static final String EMAÝL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|info|)(.[A-Z]{2})?$";
	
	
	public static boolean isEmailValid(String emailInput) {
		
		Pattern pattern = Pattern.compile(EMAÝL_PATTERN,
				
		Pattern.CASE_INSENSITIVE);
		return pattern.matcher(emailInput).find();
		
		
		
	}
}
