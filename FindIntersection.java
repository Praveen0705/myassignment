package week1.day4;

public class FindIntersection {

	public static void main(String[] args) {
		
	int[] a = {3,2,11,4,6,7};
	int[] p= {1,2,8,4,9,7};
	
	for (int i = 0; i < a.length; i++) 
		for(int j =0; j< p.length; j++)
			
			if (a[i]==p[j]) {
				System.out.println(a[i]);
		
	}

	}

}
