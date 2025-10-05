package tugaspekan4;

import java.util.Scanner;

public class PembelianTiketBioskop {
      public static void main(String[] args) {
    	  Scanner input = new Scanner(System.in);
   	      String nama;
   	      int jumlahTiket;
   	      int hari;
   	      int waktu;
   	      int studio;
   	   

          System.out.print("Masukkan Nama Pembeli: ");
           nama = input.nextLine();

          System.out.print("Masukkan Jumlah Tiket: ");
          jumlahTiket = input.nextInt();

          System.out.println("Pilih Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
           hari = input.nextInt();

          System.out.println("Pilih Waktu Tayang (1=Pagi, 2=Siang, 3=Malam): ");
           waktu = input.nextInt();

          System.out.println("Pilih Jenis Studio (1=Regular, 2=Deluxe, 3=Premium): ");
           studio = input.nextInt();

          
          int hargaDasar = 50000;
          double hargaPerTiket = hargaDasar;

          
          double biayaHari = 0;
          String namaHari = "";
          switch (hari) {
              case 1: namaHari = "Senin-Kamis"; biayaHari = 0;
              break;
              case 2: namaHari = "Jumat"; biayaHari = 0.10; 
              break;
              case 3: namaHari = "Sabtu-Minggu"; biayaHari = 0.30;
              break;
          }
          hargaPerTiket += hargaDasar * biayaHari;

          
          double biayaWaktu = 0;
          String namaWaktu = "";
          switch (waktu) {
              case 1: namaWaktu = "Pagi"; biayaWaktu = 0;
              break;
              case 2: namaWaktu = "Siang"; biayaWaktu = 0.10;
              break;
              case 3: namaWaktu = "Malam"; biayaWaktu = 0.20;
              break;
          }
          hargaPerTiket += hargaDasar * biayaWaktu;

          // Biaya tambahan studio
          double biayaStudio = 0;
          String namaStudio = "";
          switch (studio) {
              case 1: namaStudio = "Regular"; biayaStudio = 0;
              break;
              case 2: namaStudio = "Deluxe"; biayaStudio = 0.25;
              break;
              case 3: namaStudio = "Premium"; biayaStudio = 0.50; 
              break;
          }
          hargaPerTiket += hargaDasar * biayaStudio;

          
         double subtotal = hargaPerTiket * jumlahTiket;
         double diskon = 0;
          if (jumlahTiket >= 5) {
              diskon = 0.20 * subtotal;
          }

          double totalBayar = subtotal - diskon;

          
          System.out.println("\n===== PEMBELIAN TIKET BIOSKOP =====");
          System.out.println("Nama Pembeli   : " + nama);
          System.out.println("Jumlah Tiket   : " + jumlahTiket);
          System.out.println("Hari           : " + namaHari);
          System.out.println("Waktu Tayang   : " + namaWaktu);
          System.out.println("Jenis Studio   : " + namaStudio);
          System.out.println("-----------------------------------");
          System.out.println("Harga Dasar    : Rp " + hargaDasar + "/tiket");
          System.out.println("Biaya Hari     : +" + (biayaHari * 30) + "%");
          System.out.println("Biaya Waktu    : +" + (biayaWaktu * 20) + "%");
          System.out.println("Biaya Studio   : +" + (biayaStudio * 100) + "%");
          System.out.println("Harga per Tiket: Rp " + hargaPerTiket);
          System.out.println("Subtotal       : Rp " + subtotal);
          System.out.println("Diskon (20%)   : Rp " + diskon);
          System.out.println("-----------------------------------");
          System.out.println("TOTAL BAYAR    : Rp " + totalBayar);
      }
  
   
      
		

	}


