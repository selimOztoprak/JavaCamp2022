package intro;

public class Main {

	public static void main(String[] args) {
	  System.out.println("hello world!");

	  //değişken isimlendirmeleri java da camelCase yazılır(yani ilk harf küçük ortadaki harf büyük.
	  String ortaMetin = "ilginizi çekebilir";
	  String altMetin = "Vade süresi";
	  
	  System.out.println(ortaMetin);
	  
	  //integer veri tipi sayısal değerleri tutar
	  int vade = 12;
	  
	 //ondalıklı sayısal verileri tutar.
	  double dolarDun = 18.20;
	  double dolarBugun = 18.20;
	
	// boolean veri tipi true veya false değerler tutar
	  boolean dolarDustuMu = false; 
	  
	  String okYonu = " ";
	  
	  if (dolarBugun<dolarDun) {
		  okYonu = "down.svg";
	  System.out.println(okYonu);
	} else if(dolarBugun>dolarDun) {
	  okYonu = "up.svg";
	  System.out.println(okYonu);
	} 
	  else {
	  okYonu = "equal.svg";
	  System.out.println(okYonu);
	  }
	  //array veri tipi birden fazla veriyi tutar
      String[] krediler = {"hızlı kredi","maaşını halkbanktan alanlar","mutlu emekli"};
	  
      //i++ birer birer arttır demek
      for (int i = 0; i < krediler.length; i++) {
		System.out.println(krediler[i]);
      }
      
      
      //Java da Main kodu çalıştırmak için gerekli metottur.
      //Java da her satırın sonuna noktalı virgül (;) konulur.
      //System.out.println(); kodu ekrana yazdırma işlemi yapar.
      // Tekli yorum satırı
      // Değişken tanımlamak için değişkenin tipi ve değişkenin adı yazılır.
      //Değişkenin tipi String, int, double, float, boolean, char, long, short, byte olabilir.
      //DeğişkenTipi değişkenAdı = değer;
      
      // if (koşul) { 
   // Koşul sağlandığında çalışacak kodlar }
      
      //else if(koşul2){
    	    // Koşul2 sağlandığında çalışacak kodlar}
      //else {
      // Koşul sağlanmadığında çalışacak kodlar}

      //for(başlangıç; koşul; artış) {
      // Koşul sağlandığı sürece çalışacak kodlar
	}
	
}
	  
	
	  
	  