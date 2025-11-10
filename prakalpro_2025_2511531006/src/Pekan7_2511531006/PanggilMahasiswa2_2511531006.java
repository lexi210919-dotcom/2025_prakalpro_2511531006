package Pekan7_2511531006;

import java.util.Scanner;

public class PanggilMahasiswa2_2511531006 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    String x = "2511531006";
	    String y = "Lexi Mulia Yunaspi";

	    System.out.println(x);
	    System.out.println(y);

	    Mahasiswa_2511531006 a = new Mahasiswa_2511531006();
	    a.setNim(x);
	    a.setNama(y);

	    if (x.startsWith("25")) {
	        System.out.println(y + " anda angkatan 2025");
	    }

	    if (x.contains("1153")) {
	        System.out.println("Anda Mahasiswa Informatika");
	    }

	    a.Cetak();
	    input.close();
	}
}
	
