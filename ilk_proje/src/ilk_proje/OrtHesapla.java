package ilk_proje;

import java.util.Scanner;

public class OrtHesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		float x,y,z;
		
		
		System.out.println("Vize Notu Girin: ");
		x = scan.nextFloat();
		
		System.out.println("Final Notu Girin: ");
		y = scan.nextFloat();
		
		
		z= (float) ((x*0.4) + (y*0.6));
		
		
		if(z>=60) { 
			
			System.out.println(z+"---Geçti");
			
		}else {
			
			System.out.println(z+"---Kaldý");
			
		}
			
		
	}

}
