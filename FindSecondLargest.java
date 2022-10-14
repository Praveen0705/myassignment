package week1.day4;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] num= {5,2,9,8,7};
		Arrays.sort(num);
		System.out.println("Second Largest = " + num[num.length-2]);
	}

}
