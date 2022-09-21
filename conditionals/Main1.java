package conditionals;

public class Main1 {

	public static void main(String[] args) {

		System.out.println("Herkese merhaba");
		
		int sicaklik = 20;

		if (sicaklik<25) {
			System.out.println("Sıcaklık 25 dereceden düşüktür.");
		} else if (sicaklik>25) {
			System.out.println("Sıcaklık 25 dereceden fazladır.");
		} else {
			System.out.println("Sıcaklık 25 dereceye eşittir.");
		}

	}

}
