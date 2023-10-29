
import java.util.Random;
import java.util.Scanner;
public class csTask1 {
	
	//Task 1 "Number Game"
	public static void main(String[] args) {
	    
		int gno=-1;
		int score=10;
		int attempt=0;
	    char choice='n';
		
		Random r1=new Random();
        Scanner scn=new Scanner(System.in);		
		
		do {
			int rno=r1.nextInt(100);
		System.out.println("Random Number:->"+rno);
		
		System.out.println("You have to find number into three Attempt");
		System.out.println("Guess the number between 1 to 100:->");
		
		do{
			gno=scn.nextInt();
			if(attempt==3) {
				System.out.println("you loose the game");
				
			}
			if(rno==gno) {
				System.out.println("Whooo! you guessed it right ");
				break;
			}else if(rno<50) {
				System.out.println("\nShit you guess it wrong");
				System.out.println("Number between 1-50");
				
			}else if(rno>50||gno<100) {
				System.out.println("\nShit you guess it wrong");
				System.out.println("Number between 50-100");
			}
			if(attempt<3)		
			System.out.println("\nNow again guessed right one:->");
		   
			attempt++;
			if(attempt==3) 
				System.err.println("\nYou loose this game.");
			
			
		}while(attempt<3);
		scn.nextLine();
		System.out.println("\nDo you want to play again");
		System.out.println("Enter y for for play again");
		System.out.println("Enter n for cancel");
		choice=scn.next().charAt(0);
		 
		}while(choice=='y');
	}


}
