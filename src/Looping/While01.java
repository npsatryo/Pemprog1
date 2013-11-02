package Latihan.WHILE.bin;

public class While01
{
	public static void main (String[] Xx)
	{
		String[][] daftarNilai = new String[][]
		{
			new String []{"001","A"},
			new String []{"002","B"},
			new String []{"003","C"},
		};
		System.out.println("Looping Menggunakan FOR");
		
		for( int i=0;i<daftarNilai.length;i++)
		{
			System.out.println("NPM  : "+daftarNilai[i][0]);
			System.out.println("Nama : "+daftarNilai[i][0]);
		}
		System.out.println("Selesai Looping For");
		System.out.println();
		System.out.println();
		System.out.println("Looping Menggunakan While");
		int ix=0;
		while(ix<daftarNilai.length)
		{
			System.out.println("NPM  : "+daftarNilai[ix][0]);
			System.out.println("Nama : "+daftarNilai[ix][0]);
			ix++;
		}
		System.out.println("Selesai Looping While");
	}
}