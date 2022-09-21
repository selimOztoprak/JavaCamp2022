package loopDemo;

public class Main {

	public static void main(String[] args) {
	//For en çok tercih edilen döngü türüdür.
	//int i=1 (sayacın kaçtan başlayacağı
	//i<=10 (i nin 10dan küçük ve eşit olduğu sürece	
	//i++ (sayacın kaçar kaçar artacağını belirleyen yer	
	//i+=2 tek sayıları yazdırmak için  
		
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		
	// while
	// for döngüsüyle yapılabilen her şey while döngüsüylede yapılabilir.	
		int i =1;
		while(i<=10) {
		System.out.println(i);
		i++;
		
		}
		
		System.out.println("while döngüsü bitti");

	//Do-While 
		int j =10;
		do {
		System.out.println(j);
		j++;
			
		}while(j<=10);
		System.out.println("Do-while döngüsü bitti");
	}

}
