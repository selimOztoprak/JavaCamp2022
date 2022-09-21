package arraysDemo;

public class Main {

	public static void main(String[] args) {

		// Bu yöntem daha uzun ve kullanışsız
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Mehmet";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("----------");
		// Bu yöntem daha kısa ve kullanışlıdır

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Mehmet";
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("----------");

		// Bu yöntem ise en kısa ve en çok kullanılandır.
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
