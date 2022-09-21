package arraysDemo;

public class Main1 {

	public static void main(String[] args) {

		String[] dersler = new String[5];
		dersler[0] = "Matematik";
		dersler[1] = "Türkçe";
		dersler[2] = "Fizik";
		dersler[3] = "Edebiyat";
		dersler[4] = "Biyoloji";

		for (int i = 0; i < dersler.length; i++) {
			System.out.println(dersler[i]);
		}
		System.out.println("-------------");

		for (String ders : dersler) {
			System.out.println(ders);
			

		}

	}

}
