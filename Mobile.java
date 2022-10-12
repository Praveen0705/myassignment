package week1.day2;

public class Mobile {
	public void sendMessage() {
		System.out.println("send message");
	}
	public void shareDoccument() {
		System.out.println("share document");
	}
	public void call() {
		System.out.println("call");
	}
	public static void main(String[] args) {
		Mobile phone = new Mobile();
		phone.sendMessage();
		phone.shareDoccument();
		phone.call();
	}

}
