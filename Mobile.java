package week1.day1;

public class Mobile {
	String mobileBrandName="Realme";
	char mobileLogo='R';
	short noOfMobilePiece=8;
	int modelNumber=85854565;
	long mobileImeiNumber=84564654844L;
	float mobilePrice=25.000F;
	boolean isDamaged=false;
	public static void main(String[] args) {
		Mobile phone=new Mobile();
		System.out.println("Mobile Brand Name =" +phone.mobileBrandName);
		System.out.println("Mobile Logo =" +phone.mobileLogo);
		System.out.println("No of Mobile Piece =" +phone.noOfMobilePiece);
		System.out.println("Mobile Ime Number =" +phone.modelNumber);
		System.out.println("Mobile Price =" +phone.mobileImeiNumber);
		System.out.println("Is Damaged = " +phone.isDamaged);
		
		
	}

}
