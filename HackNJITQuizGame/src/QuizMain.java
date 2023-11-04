import java.util.Scanner;

public class QuizMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		
		
		 MarineLife marine = new MarineLife();
		 marine.question1();
		 
	     String answer = marine.answer1(input.next());
	     System.out.println(answer);
	     
		 
	     String answer1 = marine.answer1(input.next());
	     System.out.println(answer1);
	        
	   //Ports port = new Ports();
	   //OceanFacts oceanF = new OceanFacts();
	   //ShipFacts ship = new ShipFacts();
		

	}

}
