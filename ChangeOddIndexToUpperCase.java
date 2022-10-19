package week1.day5;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray=test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0) {
				String copy = "";
				copy = copy+charArray;
				
				System.out.println(copy.toUpperCase());
			}
			else {
				System.out.println(charArray[i]);
			}
			
		}
	}

}
