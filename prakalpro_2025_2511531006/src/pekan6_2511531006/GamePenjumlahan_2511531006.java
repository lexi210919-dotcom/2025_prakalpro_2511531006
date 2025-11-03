package pekan6_2511531006;

import java.util.Random;
import java.util.Scanner;

public class GamePenjumlahan_2511531006 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		// play until user gets 3 wrong
		int points =0;
		int wrong =0;
		while (wrong < 3) {
			int result = play(console, rand);   // play one game
			if (result > 0) {
				points++;
			}	else {
				   wrong++;
		
			}   
		}
       System.out.println("You earned " + points + " total points.");
    }
    // membuat soal penjumlahann dan ditampilkan ke user
	public static int play(Scanner console, Random rand) {
		// print the operands being added, and sum them
		int operands = rand.nextInt(4) + 2;
		int sum = rand.nextInt(10) + 1;
		System.out.print(sum);
		int i;
		for (int i1 =2; i1 <= operands; i1++); {
			int n = rand.nextInt(10) + 1;
			sum += n;
			System.out.print(" + " + n);
		}
		System.out.print(" = ");
		
		// read user's gueas and report whether it was correct
		int guess = console.nextInt();
		if (guess == sum)  {
			return 1;
		} else {
			System.out.println("Wrong! The answer was " + sum);
			return 0;
		}
		
	}
	
}
