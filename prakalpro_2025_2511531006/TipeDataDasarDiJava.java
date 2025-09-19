package Tugaspekan2;
import java.util.Scanner;

public class TipeDataDasarDiJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a= new Scanner(System.in);
		int uang;
		float b;
		char a1 = 0;
		boolean d2;

		//naik angkot
		System.out.println("bayaran");
		uang = a.nextInt();
		System.out.println("waktu dalam menit");
		b = a.nextFloat();
		System.out.println("kode angkot");
		a1 = a.next().charAt(a1);
		System.out.println("apakah sampai");
		d2 = a.nextBoolean();
		
		System.out.println("bayaran= "+uang);
		System.out.println("waktu dalam menit ="+b);
		System.out.println("kode angkot ="+a1);
		System.out.println("apakah sampai ="+d2);

}
	
	
}
