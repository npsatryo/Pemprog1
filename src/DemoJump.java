package Latihan.Jump.bin;
import java.util.Random;

public class DemoJump
{
	public static void main(String[]Xx)
	{
		int faktor=7;
		int jmlFD=4;
		int BA=1000000;
		
		System.out.println("Mencari kelipatan "+faktor+" Dengan Break dan Continue");
		int jmlFDit=0;
		while(true)
		{
			Integer random = new Random().nextInt();
			System.out.println("Bilangan Random : "+random);
			
			if(random>BA)
			{
				System.out.println("Melewati batas atas, langsung selesai");
				return;
			}
			if(random%faktor==0)
			{
				System.out.println("Kelipatan "+faktor+" ditemukan,yaitu "+random);
				jmlFDit++;
				if(jmlFDit<jmlFD)
				{
					System.out.println("Baru menemukan "+jmlFDit+" Faktor");
					System.out.println("Dari "+jmlFD+" yang diminta,Lanjut lagi.");
					continue;
				}
				else
				{
					System.out.println("Sudah menemukan "+jmlFDit+". Selesai Looping");
					break;
				}
			}
		}
		System.out.println("Selesai MEncari");
	}
}