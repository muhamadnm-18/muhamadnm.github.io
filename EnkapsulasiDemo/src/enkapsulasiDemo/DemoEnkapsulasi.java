package enkapsulasiDemo;

import java.text.DecimalFormat;

public class DemoEnkapsulasi {
	public static void main (String[]args)
	{
		DecimalFormat digitpresisi = new DecimalFormat ("0,00");
		System.out.println("\n DEMO ENKAPSULASI");
		System.out.println("===================");
		HitungGaji tony = new HitungGaji();
		tony.setGaji(25000000);
		tony.hitungGaji();
		System.out.println("Informasi Gaji Pegawai");
		System.out.println("\n besar Gaji Kotor : " + digitpresisi.format(tony.getgajiKotor()));
		System.out.println("\n besar Gaji yang dibawa pulang : " + digitpresisi.format(tony.getgajiBersih()));	
	}
}
