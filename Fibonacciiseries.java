package week1.day3;

import java.util.Iterator;

public class Fibonacciiseries {
	public static void main(String[] args) {
		int l=10;
		int a=0;
		int b=1;
		int s=0;
		for (int i = 1; i <=l; i++) {
			s=a+b;
			System.out.println(s);
			a=b;
			b=s;
			
		}
	}

}
