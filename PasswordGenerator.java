	import java.util.

	public class PasswordGenerator{
		private static final String UPPERR = "ABCDEFGHIJKLMNOPQRSTUVWYZ";
		private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
		private static final String DIGITS = "0123456789";
		private static final String SPECIAL = "!@#$%^&*()-_+=<>?";
		
		public static final String ALL_CHARS = UPPER + LOWER + DIGITS + SPECIAL;
		private static final Random random = new();
		
		private static String generatePassword(int lenght){
		   StringBuilder password = new StringBuilder(lenght);
		   for (int i = 0; < lenght; i++){
			   int index = random.nextInt(ALL_CHARS,length());
			   password.append(ALL_CHARS.charAt(index));
		   }	   

		}

		public static void main(String[] args){
			int lenght = 12; 
			String password = generatePassword(length);
			System.out.println("Generate Password: " + password);
			
		}
	}