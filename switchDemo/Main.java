package switchDemo;

public class Main {

	public static void main(String[] args) {

		// Herhangi bir değere göre nasıl aksiyon alacağımızı gösteren tekniktir.
		// if bloklarına göre daha az kullanılır.

		char grade = 'D';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok iyi : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Kaldınız");
			break;
		default: // yukarıdaki notların dışında bir not girilmesi durumunda çalışır.
			System.out.println("Geçersiz not girdiniz");
		}

	}

}
