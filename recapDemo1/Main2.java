package recapDemo1;

public class Main2 {

	public static void main(String[] args) {

		int yas1 = 32;
		int yas2 = 28;
		int yas3 = 22;
		int EnKucukYas = yas1;

		if (EnKucukYas > yas2) {
			EnKucukYas = yas2;
		}
		if (EnKucukYas > yas3) {
			EnKucukYas = yas3;
		}
		System.out.println("En küçük yaş = " + EnKucukYas);

	}

}
