package project1;

import java.util.Scanner;
import project1.veriler;

public class calisan_bilgisi {

	public static void main(String[] args) {
		
		System.out.println("**********UYGULAMA EKRANINA HOŞ GELDİNİZ!**********");
		Scanner scanner = new Scanner(System.in);
		System.out.println("ID Giriniz: ");
		int ID=scanner.nextInt();
		scanner.nextLine();
		
		if(ID==754) {
			System.out.println("Giriş ID'si doğru!");
			System.out.println("------------------------------");
		}else {
			System.out.println("ID YANLIŞ!");
			System.exit(0);
		}
		
		System.out.println("AD Giriniz: ");
		String ad=scanner.nextLine();
		
		System.out.println("SOYAD Giriniz: ");
		String soyad=scanner.nextLine();
		
		System.out.println("Maaşınızı Giriniz: ");
		float maas=scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Tecrübe Yılı Giriniz: ");
		double tecrube=scanner.nextDouble();
		scanner.nextLine();
		
		veriler calisan = new veriler(ID, ad, soyad, maas, tecrube);
		
		String isimler = "1. Çalışan bilgilerini göster.\n"
				+ "2. Zam Yap.\n"
				+ "3. Prim Artışı Yap.";
		System.out.println("------------------------------");
		System.out.println(isimler);
		System.out.println("------------------------------");
		System.out.println("YUKARIDAKİ SEÇENEKLERDEN BİR SEÇİM YAPINIZ!");
		System.out.println("------------------------------");
		int secim = scanner.nextInt();
		scanner.nextLine();
		
		switch (secim) {
		case 1: {
				System.out.println("------------------------------");
				calisan.calisanBilgisi();
				break;
		}
		case 2:
				System.out.println("------------------------------");
				System.out.println("Şu anki maaşınız: "+maas+" TRY.");
				System.out.println("Zam oranını giriniz. (örn. %60 zam için 0,6 giriniz!): ");
				float oran = scanner.nextFloat();
				calisan.zam(oran);
				break;
		case 3:
				System.out.println("------------------------------");
				System.out.println("TRY cinsinden prim tutarı giriniz: ");
				int prime = scanner.nextInt();
				calisan.prim(prime);
				break;
		default:
			System.out.println("------------------------------");
			System.out.println("Lütfen istenilen aralıkta değer giriniz!");
			break;
		}
	}

}
