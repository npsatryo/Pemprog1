//package Latihan.CO.bin;

public class DemoClassObject
{
	public static void main(String[] Xx)
	{
		Mahasiswa12.jumlah=0;
		System.out.println("Jumlah Mahasiswa : "+Mahasiswa12.jumlah);
		
		Mahasiswa12 m1 = new Mahasiswa12();
		m1.nim = "123";
		m1.nama = "Candra";
		m1.jumlah = 1;
		
		Mahasiswa12 m2 = new Mahasiswa12();
		m2.nim = "456";
		m2.nama = "Nursari";
		m2.jumlah = 2;
		
		tampilkanMahasiswa(m1);
		tampilkanMahasiswa(m2);
		System.out.println("Jumlah Mahasiswa : "+Mahasiswa12.jumlah);
	}
	public static void tampilkanMahasiswa(Mahasiswa12 m)
	{
		System.out.println("NIM      : "+m.nim);
		System.out.println("NAMA     : "+m.nama);
		System.out.println("ALAMAT   : "+m.jumlah);
		System.out.println(" ");
		System.out.println(" ");
	}
}