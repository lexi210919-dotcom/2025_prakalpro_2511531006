package pekan6_2511531006;

import java.util.Random;
import java.util.Scanner;

public class TugasWhileDoWhile_2511531006 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random acak = new Random();
		String jawab1;
		int percobaan = 0;
		boolean menang = false;
		
		 do {
	       int dadu1 = acak.nextInt(6) + 1;
	       int dadu2 = acak.nextInt(6) + 1;
	       int total = dadu1 + dadu2;
	       percobaan++;

	  System.out.println(dadu1 + " + " + dadu2 + " = " + total);

	       if (total == 7) {
	          System.out.println("Tebakan Anda Benar");
	          System.out.println("Anda menang setelah " + percobaan + " percobaan!");
	          menang = true;
	          break;
	  } else {
	           System.out.println("Tebakan Anda Salah");
	           System.out.print("Apakah mau lempar dadu (ya / tidak)? ");
	           
	           String jawab = input.nextLine();
		   if (!jawab.equalsIgnoreCase("ya")) {
	           System.out.println("Anda gagal menang");
	           break;
	                }
	            }
	        } while (true);

	        
	    }
	}
		
		

	

