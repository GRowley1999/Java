package week_5;

public class OneTimePadDecipher {
	
	public static String decipher(String encipheredText, String onetimepad) {
		String newStr = "";
		for (int i = 0; i < encipheredText.length(); i++) {
			char o = encipheredText.charAt(i);
			char k = onetimepad.charAt(i);
			
			if (OneTimePadEncipher.isAlpha(o)) {
				newStr += OneTimePadEncipher.intToChar(OneTimePadEncipher.charToInt(o) - OneTimePadEncipher.charToInt(k));
			} else {
				newStr += " ";
			}
			}
		return newStr.toUpperCase();
	}

}
