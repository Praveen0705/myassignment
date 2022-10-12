package week1.day2;

public class MyCar {
	public void applyBreak() {
		System.out.println("apply break");
	}
	public void applyGear() {
		System.out.println("apply gear");
	}
	public void swichOnAc() {
		System.out.println("swich on Ac");
	}
	public void applyAcclerate() {
		System.out.println("apply acclerate");
	}
	public static void main(String[] args) {
		MyCar car = new MyCar();
		car.applyBreak();
		car.applyGear();
		car.swichOnAc();
		car.applyAcclerate();
	}

}
