package week1.day1;

public class TwoWheeler {
		int noOfWheels=2;
		short noOfmirrors=2;
		long chassisNumber=333464646433L;
		boolean isPunctered=false;
		String bikeName="Pulser 150";
		double runingKM=9558.63;
		public static void main(String[] args) {
			TwoWheeler bike= new TwoWheeler();
			System.out.println("No of wheels =" +bike.noOfWheels);
			System.out.println("No of Mirror =" +bike.noOfmirrors);
			System.out.println("Chassis nuumber ="+bike.chassisNumber);
			System.out.println("Is punctered =" +bike.isPunctered);
			System.out.println("Bike Name =" +bike.bikeName);
			System.out.println("Runing KM ="+bike.runingKM);
			
		}
}
