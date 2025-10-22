package project1;

public class veriler {

	public int ID;
	public String ad;
	public String soyad;
	public float maas;
	public double tecrube;
	
	public veriler(int ID, String ad, String soyad,float maas,double tecrube) {
			ID=754;
			this.ad=ad;
			this.soyad=soyad;
			this.maas=maas;
			this.tecrube=tecrube;
	}
	
	public void calisanBilgisi() {
		System.out.println("-----------Çalışan Bilgi Ekranı-----------");
		System.out.println("ID Bilgisi     : "+ID);
		System.out.println("Ad             : "+ad.toUpperCase());
		System.out.println("Soyad          : "+soyad.toUpperCase());
		System.out.println("Maaş Bilgisi   : "+maas+" TRY.");
		System.out.println("Tecrübe Bilgisi: "+tecrube+" YIL.");
		
	}
	
	public void zam(float zamOrani) {
		System.out.println("-----------Çalışan Maaş Ekranı-----------");
		System.out.println("Güncel Maaşınız: "+maas+" TRY.");
		float yeniMaas=maas+(maas*zamOrani);
		System.out.println("% "+(zamOrani*100)+" zam oranı ile yeni maaşınız: "+yeniMaas+" TRY.");
	}
	
	public void prim(float primArtisi) {
		System.out.println("-----------Çalışan Prim Ekranı-----------");
		float primm=(maas+primArtisi);
		System.out.println("Maaşınıza eklenen prim: "+primArtisi+" TRY.");
		System.out.println("Güncel maaşınız: "+primm+" TRY.");
	}

}
