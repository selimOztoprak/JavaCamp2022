package recapDemo2;

public class Main1 {

	public static void main(String[] args) {

		double[] clickRates = { 2.2, 8.5, 4.2, 3.1 };
		double total = 0;
		double min = clickRates[0];
		for (double number : clickRates) {
			if (min>number) {
				min = number;
			}
			total = total + number;
			System.out.println(number);

		}

		System.out.println("Toplam = " + total);
		System.out.println("En küçük = " + min);
	}

}
