package week1.day5;

public class Palindrome {
	public static void main(String[] args) {
		String name= "madam";
		String rev="";
		
		
		char[]chararray=name.toCharArray();
		
	for (int  i=chararray.length-1; i>= 0; i--) {
	rev=rev+chararray[i];
	}
	if(name.equals(rev)) 
	{
		System.out.println("It is palindrome word");
	}

	else {System.out.println("it is not palindrome");
	}
	}
}
