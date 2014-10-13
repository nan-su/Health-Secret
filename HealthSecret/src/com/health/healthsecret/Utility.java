package com.health.healthsecret;


public class Utility {
	
	private static final int NULL_CHAR = 0x00;
	
	public static boolean isMyChar(int code) {
		return (code >= 0x1000 && code <= 0x109F) || (code >= 0xAA60 && code <= 0xAA7B);
	}
	
	public static boolean isMyChar(int[] codes) {
		if(codes == null) return false;
		boolean isMyChar = false;
    	for(int i = 0; i < codes.length; i++) {
    		if(isMyChar(codes[i])) {
    			isMyChar = true;
    			break;
    		}
    	}
		return isMyChar;
	}
	
	public static boolean isMyChar(CharSequence label) {
		if(label == null) return false;
		boolean isMyChar = false;
    	for(int i = 0; i < label.length(); i++) {
    		if(isMyChar(label.charAt(i))) {
    			isMyChar = true;
    			break;
    		}
    	}
		return isMyChar;
	}

	public static CharSequence ZawGyiDrawFix(CharSequence input) {
		return ZawGyiDrawFix(input, 0xEA00);
	}
		
	public static CharSequence ZawGyiDrawFix(CharSequence input, int fixCode) {
		if (fixCode== 0x0) return input;
		String output = input.toString();
		int index = 0;
		char[] chArray = new char[output.length()];
		for(int i = 0; i < output.length(); i++) {
			int ch = (int)output.charAt(i);
			if((ch != NULL_CHAR) && (isMyChar(ch))) {
				chArray[index++] = (char)(ch + fixCode); // 0xEA00
			}
			else {
				chArray[index++] = (char)ch;
			}
    	}
		return String.valueOf(chArray);
	}
}
