package org.veluka.Vapi.utilities.secure;

import org.springframework.lang.Nullable;

public class RegisterUtilities {
	
	private static int SALT_LENGHT = 45;
	
	public void generateNewUser(String username, String password, @Nullable String realName, @Nullable String age) {
		PasswordUtils passwordUtils = new PasswordUtils();
		
		String encryptPassword, passcrypt;
		passcrypt = passwordUtils.getSalt(SALT_LENGHT);
		encryptPassword = passwordUtils.generateSecurePassword(password, passcrypt);
		
		
		
	}
}
