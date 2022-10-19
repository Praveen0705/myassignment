package week1.day5;

public class ReverseWords {
	public static void main(String[] args) {
		String word="Test leaf";
		String[] name = word.split(" ");
	
		char[]chararray=name[1].toCharArray();
		
		for (int i = chararray.length-1; i>=0; i--) {
			System.out.println(chararray[i]);
		}	
		}
}
