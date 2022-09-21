package recapDemo1;

public class main {

	public static void main(String[] args) {
		int sayi1 = 700;
		int sayi2 = 40;
		int sayi3 = 650;
		int EnBuyukSayi = sayi1;

		if (EnBuyukSayi < sayi2) {
			EnBuyukSayi = sayi2;
		}
		if (EnBuyukSayi < sayi3) {
			EnBuyukSayi = sayi3;
		}

		System.out.println("En Büyük Sayı = " + EnBuyukSayi);

	}

}
