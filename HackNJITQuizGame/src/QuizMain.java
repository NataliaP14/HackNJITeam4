import java.util.Scanner;

public class QuizMain {

    public static void main(String[] args) {

        MarineLife marine = new MarineLife();
        Ports port = new Ports();
        OceanFacts oceanF = new OceanFacts();
        ShipFacts ship = new ShipFacts();

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Nautical Navigation: Quiz! Please choose a topic to take a quiz on:");
        int choice = 0;

        while(choice<5) {
        System.out.println("Main Menu");
        System.out.println("1. Quiz Instructions");
        System.out.println("2. Ports");
        System.out.println("3. Marine Life");
        System.out.println("4. Ocean Facts");
        System.out.println("5. Ship Facts");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");

        choice = input.nextInt();
       
        
         
        switch (choice) {
        	case 1:
        		System.out.println("Hello! You you can choose 1 of the 4 topics that we have. Once you choose a topic,"
        				+ "you will be given 3 random questions out of the 10 you have. If you get a wrong answer, you will be"
        				+ "sent back to the menu. If you get an answer correct, the program will give you another question. Once you've gotten"
        				+ "three correct, you will be sent back to to the menu. At the end, you can see how any points you've earned.\n");
            case 2:
            	do {
                    System.out.println("You chose Ports");
                    String randomQuestionP = port.getRandomQuestionP();
                    port.displayQuestionP(randomQuestionP);
                    String answerP = input.next();
                    if (port.checkAnswerP(randomQuestionP, answerP)) {
                        System.out.println("Correct");
                        
                    } else {
                        System.out.println("Incorrect");
                        
                        System.out.println("GAME OVER. You are now being sent to the main menu.\n");
                        break;
                    }
                    
                	} while(port.getPortsIncremenet()<3); 
            		break;
            case 3:
            	do {
                System.out.println("You chose Marine Life");
                String randomQuestionML = marine.getRandomQuestionML();
                marine.displayQuestionML(randomQuestionML);
                String answerML = input.next();
                if (marine.checkAnswerML(randomQuestionML, answerML)) {
                    System.out.println("Correct");
                    
                } else {
                    System.out.println("Incorrect");
                    
                    System.out.println("GAME OVER. You are now being sent to the main menu.\n");
                    break;
                }
                
            	} while(marine.getMarineLifeIncremenet()<3); 
                	break;
            case 4:
            	do {
                    System.out.println("You chose Ocean Facts");
                    String randomQuestionOF = oceanF.getRandomQuestionOF();
                    oceanF.displayQuestionOF(randomQuestionOF);
                    String answerOF = input.next();
                    if (oceanF.checkAnswerOF(randomQuestionOF, answerOF)) {
                        System.out.println("Correct");
                        
                    } else {
                        System.out.println("Incorrect");
                        
                        System.out.println("GAME OVER. You are now being sent to the main menu.\n");
                        break;
                    }
                    
                	} while(oceanF.getOceanFactsIncremenet()<3); 
            		break;
            	
            case 5:
            	do {
                    System.out.println("You chose Ship Facts");
                    String randomQuestionSF = ship.getRandomQuestionSF();
                    ship.displayQuestionSF(randomQuestionSF);
                    String answerSF = input.next();
                    if (ship.checkAnswerSF(randomQuestionSF, answerSF)) {
                        System.out.println("Correct");
                        
                    } else {
                        System.out.println("Incorrect");
                        
                        System.out.println("GAME OVER. You are now being sent to the main menu.\n");
                        break;
                    }
                    
                	} while(ship.getShipFactsIncremenet()<3); 
            		break;
            	
            case 6:
            	System.out.println("Thank you for playing our game");
        }
       }
        input.close();
        
    }
}


