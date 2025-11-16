package Pekan7_2511531006;

import java.util.Scanner;

public class TugasAlproPekan7_2511531006 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("===== REGISTRASI AKUN BARU =====");
        System.out.print("Masukkan Username: ");
        String username = input.nextLine();

        System.out.print("Masukkan Password: ");
        String password = input.nextLine();

        System.out.print("Masukkan Email: ");
        String email = input.nextLine();

        System.out.print("Masukkan Pin (6 digit): ");
        int pinAngka = input.nextInt();

        Akun akun = new Akun(username, password, email, pinAngka);

        if (!akun.isEmailValid()) {
            System.out.println("\n--- REGISTRASI GAGAL ---");
            System.out.println("Email Anda '" + akun.getEmail() + "' tidak valid (harus mengandung '@' dan '.').");
            System.out.println("Silakan coba lagi.");
        } else if (!akun.isPasswordValid()) {
            System.out.println("\n--- REGISTRASI GAGAL ---");
            System.out.println("Password tidak valid (minimal 8 karakter). Silakan coba lagi.");
        } else {
        	    System.out.println("\n--- REGISTRASI BERHASIL ---");
        	    System.out.println("Akun untuk '" + akun.getUsername() + "' telah berhasil dibuat.\n");
        	    System.out.println("== Detail Akun ==");
        	    System.out.println("Username (lowercase): " + akun.getUsername().toLowerCase());
        	    System.out.println("Email (Uppercase): " + akun.getEmail().toUpperCase());
        	    System.out.println("ID Pengguna (Gabungan): " + akun.getUsername() + akun.getEmail());
        	    System.out.println("\n=== Uji Tipe Data (PIN Anda: " + akun.getPinAngka() + ") ==");
        	    System.out.println("PIN (int) * 10 = " + (akun.getPinAngka() * 10));
        	}

     

}
  




	

}




