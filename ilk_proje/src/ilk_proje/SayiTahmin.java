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
		
		System.out.println("0 ile 20 aras� bir say� girin : ");
		
		tahmin = scan.nextInt();
		
		while (tahmin != sayi) {
            
            
             if (tahmin < sayi) {
                    System.out.println("Daha b�y�k bir say� giriniz: ");
                    System.out.println("---------------------------- ");
                    tahmin = scan.nextInt(); 
                    sayac1++;
                    }
            else{
                    System.out.println("Daha k���k bir say� giriniz: ");
                    System.out.println("---------------------------- ");
                    tahmin = scan.nextInt();
                    sayac2++;
            }
        }
                    int Deneme=sayac1+sayac2;
                    System.out.println("Tebrikler do�ru tahmin");
                    System.out.println("Random say�:"+sayi);
                    System.out.println("Deneme say�n�z:"+Deneme);
                    System.out.println("----------------------- ");                   
    
			
		
	}

}
