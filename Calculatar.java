package week1.day2;

public class Calculatar {
	public void addTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
		}
	public void subractionTwoNumber(int e,int f) {
		int g=e-f;
		System.out.println(g);
	}
	public void multipleTwonumber(double i,double j) {
		double k=i*j;
		System.out.println(k);
	}
	public void divideTwoNumber(float x,float y) {
		float z=x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Calculatar abi=new Calculatar();
		abi.addTwoNumber(20, 20);
		abi.subractionTwoNumber(50, 30);
		abi.multipleTwonumber(682.2, 448.25);
		abi.divideTwoNumber(52.2f, 25.2f);
		
	}

}
