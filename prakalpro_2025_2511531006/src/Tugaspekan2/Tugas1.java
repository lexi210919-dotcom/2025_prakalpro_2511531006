package Tugaspekan2;
import java.util.*;

public class Tugas1 {

	public static void main(String[] args) {
		String nama,nim;
		int umur;
		Scanner a = new Scanner(System.in);
		System.out.println("input nim");
		nim = a.next();
		System.out.println("input nama lengkap");
		nama = a.next();
		System.out.println("input umur");
		umur = a.nextInt();
		
		//sebelum
		/*
	    System.out.println("nim ="+nim);
	    System.out.println("nama ="+nama);
	    System.out.println("umur ="+umur);
	    */
	    
	    //konveksi
	    long NIM =Long.parseLong(nim);
	    String Umur = Integer.toString(umur);
	    
	    
	    System.out.println("=== Data Mahasiswa ===");
	    System.out.println("Nim    :"+nim);
	    System.out.println("Nama   :"+nama);
	    System.out.println("Umur   :"+umur+" tahun");
	    System.out.println("IPK    :3,80");
	    System.out.println();
	    System.out.println("Umur (String)= "+Umur);
	    System.out.println("Nim + Umur   = "+(NIM+umur));
	}
	
}
