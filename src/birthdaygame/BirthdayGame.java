/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package birthdaygame;
import java.util.Scanner;
  
 /**
 * Plays a birthday guessing game with one player.
 */
 public class BirthdayGame {

	public static void main(String[] args) {
		int playerNum;
		int birthMonth, birthDay;
		Scanner input = new Scanner(System.in);
		
		/* Give the player directions for calculating the number */
		System.out.println("Using paper and pencil, perform the following calcuations:\n");
		System.out.println("1. Determine your birth month (January=1, February=2 and so on).");
		System.out.println("2. Multiply that number by 5.");
		System.out.println("3. Add 6 to that number.");
		System.out.println("4. Multiply the number by 4.");
		System.out.println("5. Add 9 to the number.");
		System.out.println("6. Multiply that number by 5.");
		System.out.println("7. Add your birth day to the number (10 if the 10th and so on).\n");
		System.out.print("Enter your number: ");
		playerNum = input.nextInt();
		input.close();
		
		/* Calculate birth day and month and display result. */
		playerNum -= 165;
		birthMonth = playerNum / 100;
		birthDay = playerNum % 100;
		
		System.out.println("Your birthday is " + birthMonth + "/" + birthDay);
	}
}