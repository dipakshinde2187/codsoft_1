
import java.util.Random;
import java.util.Scanner;

class Game{
	int computer;
	public Game() {                                     
		Random r=new Random();                          
		computer=r.nextInt(100);
		System.out.println("Please guess the number between 1 to 100!");
	}
	public int computerNumber() {                      
		return computer;
	}
}

public class codsoft {

	static int userInput(){                           
		int user;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		user=sc.nextInt();
		return user;
	}

	
	public static void main(String[] args) {
		
		int user,computer,maximumAttempts=8,score=0;
		Scanner p=new Scanner(System.in);
		boolean correctGuessing=false,playAgain=true;
		Game g=new Game();
		while(playAgain)
		{
			int attempts=0;
			
			while(attempts<maximumAttempts) {
				
				user=userInput();
				attempts++;
				computer=g.computerNumber();
				if(user==computer){
					System.out.println("Congratulations!! ");
					System.out.println("you guessed the correct number :) ");
					correctGuessing=true;	
					break;
				}
				else if(user>computer) {
					System.out.println("Sorry!!");
					System.out.println("its higher, please give another try");            
					
				}
				else {
					System.out.println("Sorry!!");
					System.out.println("its lower, Please give another.");             
					
				}
	
			}
			if(!correctGuessing) {
				System.out.println("Sorry you used all attempts");
				System.out.println("the answer is : "+g.computer);
			}
			score+=correctGuessing ? 1:0;                                      
			System.out.println("do you want to play again??  (y/n) : ");
			String playAgainIn=p.next().toLowerCase();
			playAgain=playAgainIn.equals("y");

		}		
		System.out.println("Thank you..");
		System.out.println("your score is : "+score);


	}

}