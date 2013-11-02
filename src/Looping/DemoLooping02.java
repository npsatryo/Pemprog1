package Latihan.Looping.bin;
import java.util.Random;

public class DemoLooping02
{
	static boolean selesai = false;
	public static void main (String[] Xx)
	{
		int faktor = 7;
			System.out.println("Looping Menggunakan While, Mencari kelipatan " +faktor);
		int ix=0;
		while(!selesai)
		{
			cariKelipatan(faktor);
		}
		System.out.println("Selesai Looping While");
		System.out.println();
		System.out.println();
		System.out.println("Looping Menggunakan FOR, Mencari kelipatan " +faktor);
		for( selesai=false; !selesai;)
		{
			cariKelipatan(faktor);
		}
		System.out.println("Selesai Looping For");
	}
	public static void cariKelipatan(int faktor)
	{
		int random = new Random().nextInt();
		System.out.println("Bilangan random : "+random);
		if(random%faktor==0)
		{
			System.out.println("Kelipatan "+faktor +" Ditemukan, yaitu : "+random);
			selesai=true;
		}
	}
}