package ilk_proje;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		int sayi;
		int tahmin;
		int sayac1 = 0;
		int sayac2 = 0;
		
		sayi = r.nextInt(20);
		
		System.out.println("0 ile 20 arasý bir sayý girin : ");
		
		tahmin = scan.nextInt();
		
		while (tahmin != sayi) {
            
            
             if (tahmin < sayi) {
                    System.out.println("Daha büyük bir sayý giriniz: ");
                    System.out.println("---------------------------- ");
                    tahmin = scan.nextInt(); 
                    sayac1++;
                    }
            else{
                    System.out.println("Daha küçük bir sayý giriniz: ");
                    System.out.println("---------------------------- ");
                    tahmin = scan.nextInt();
                    sayac2++;
            }
        }
                    int Deneme=sayac1+sayac2;
                    System.out.println("Tebrikler doðru tahmin");
                    System.out.println("Random sayý:"+sayi);
                    System.out.println("Deneme sayýnýz:"+Deneme);
                    System.out.println("----------------------- ");                   
    
			
		
	}

}
