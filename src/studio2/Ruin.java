package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("How much money u want");
		double startMoney = in.nextDouble();

		System.out.println("What is win probability");
		double winprob = in.nextDouble();

		System.out.println("What is win limit");
		double winLimit = in.nextDouble();

		System.out.println("How many days?");
		int totalSim = in.nextInt();
		
		double playMoney = startMoney;
		int counter = 0;
		
		for(int i = 0; i<totalSim; i++) {
			
			while (playMoney > 0 && playMoney < winLimit) {
				counter++;
				
				if(Math.random() < winprob) { //win
					playMoney++;
					
				}

				else { //lose
					playMoney--;
	
				}	
			}
			
			System.out.println("Day: " + (i+1) +". There were " + counter + " plays");
			
			if(playMoney == 0)
				System.out.println("You got ruined.");
			if(playMoney == winLimit)
				System.out.println("You won big!");
		
			playMoney = startMoney;
			
		}
		
		
		
		
	}





}
