import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


class ImagePanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private ImageIcon imageIcon;
    //width
    private int imageWidth; 
    //height
    private int imageHeight; 
    
    //constructor
    public ImagePanel(String imagePath, int width, int height) {
        imageIcon = new ImageIcon(imagePath);
        imageWidth = width;
        imageHeight = height;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imageIcon != null) {
            // Draw the image with the specified size
            g.drawImage(imageIcon.getImage(), 0, 0, imageWidth, imageHeight, this);
        }
    }
}

//Main
public class QuizMain {

    public static void main(String[] args) {
    	
    	
    	int count = 0;
    	int correctAnswers = 0;
    	int wrongAnswers = 0;

        MarineLife marine = new MarineLife();
        Ports port = new Ports();
        OceanFacts oceanF = new OceanFacts();
        ShipFacts ship = new ShipFacts();
        
        //jframe win
        JFrame frameWin = new JFrame("Keep The Boat Afloat");
        frameWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameWin.setSize(1500, 1300);
        
        //jframe lose 
        JFrame frameLose = new JFrame("Keep The Boat Afloat");
        frameLose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLose.setSize(1500, 1300);
        

        // Create a JPanel to hold the image
        ImagePanel imagePanel = new ImagePanel("giphy.gif", 1500, 800);
        ImagePanel imagePanel2 = new ImagePanel("sink_boat.gif", 1500, 800);
        
        JLabel messageLabel = new JLabel("Thank you for playing Keep the Boat Afloat");
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
    

        // Create a JPanel to hold both the image and message label
        JPanel contentPanelWin = new JPanel(new BorderLayout());
        contentPanelWin.add(imagePanel, BorderLayout.CENTER);
        contentPanelWin.add(messageLabel, BorderLayout.SOUTH);
        
        JPanel contentPanelLose = new JPanel(new BorderLayout());
        contentPanelLose.add(imagePanel2, BorderLayout.CENTER);
        contentPanelLose.add(messageLabel, BorderLayout.SOUTH);

        frameWin.add(contentPanelWin);
        frameLose.add(contentPanelLose);
        

        frameWin.add(imagePanel);
        frameWin.setVisible(true);

        JOptionPane.showMessageDialog(null,"Welcome to Keep The Boat Afloat! Please choose a topic to take a quiz on");
        int choice = 0;

        while (choice < 7) {
           	frameLose.setVisible(false);
        	frameWin.setVisible(true);
        	
            String input = JOptionPane.showInputDialog("Main Menu\n" +
                    "1. Quiz Instructions\n" +
                    "2. Ports\n" +
                    "3. Marine Life\n" +
                    "4. Ocean Facts\n" +
                    "5. Ship Facts\n" +
                    "6. See your data\n" +
                    "7. Exit\n" +
                    "Enter your choice:");
            try {
            choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
            	System.out.println(" ");
            	continue;
            	
            }
     
            switch (choice) {
       
                case 1:
                	
                    JOptionPane.showMessageDialog(null, "Hello! You can choose 1 of the 4 topics that we have. Once you choose a topic, "
                            + "you will be given 3 random questions out of the 10 you have. If you get a wrong answer, \nyou will be "
                            + "sent back to the menu. If you get an answer correct, the program will give you another question. Once you've gotten "
                            + "three correct, you will be sent back to the menu. \nAt the end, you can see how many points you've earned.\n");
                    break;
                    
                    
                case 2:
                
                    do {
                        JOptionPane.showMessageDialog(null, "You chose Ports");
                        String randomQuestionP = port.getRandomQuestionP();
                        String answerP = JOptionPane.showInputDialog(randomQuestionP);
                        if (port.checkAnswerP(randomQuestionP, answerP)) {
                        	int counts = (count++) + 1;
                            JOptionPane.showMessageDialog(null, "Correct! You got " + counts + " correct!");
                            count++;
                            correctAnswers++;
                            if (count == 3) {
                            	JOptionPane.showMessageDialog(null, "Congrats, you got all three correct");
                            	count = 0;
                            	break;
                            }
                            
                        } else {
                        	frameWin.setVisible(false);
                        	frameLose.setVisible(true);
                            JOptionPane.showMessageDialog(null, "Incorrect\nGAME OVER. You are now being sent to the main menu.");
                            count = 0;
                            wrongAnswers++;
                      
                            break;
                        }
                        
                        
                    } while (count < 3);
                    
                    break;
                    
                    
                case 3:
                    do {
                        JOptionPane.showMessageDialog(null, "You chose Marine Life");
                        String randomQuestionML = marine.getRandomQuestionML();
                        String answerML = JOptionPane.showInputDialog(randomQuestionML);
                        if (marine.checkAnswerML(randomQuestionML, answerML)) {
                            JOptionPane.showMessageDialog(null, "Correct");
                            count++;
                            correctAnswers++;
                            if (count == 3) {
                            	JOptionPane.showMessageDialog(null, "Congrats, you got all three correct");
                            }
                            
                        } else {
                        	frameWin.setVisible(false);
                        	frameLose.setVisible(true);
                            JOptionPane.showMessageDialog(null, "Incorrect\nGAME OVER. You are now being sent to the main menu.");
                            count = 0;
                            wrongAnswers++;
                            break;
                        }
                    } while (marine.getMarineLifeIncremenet() == 3);
                    break;
                    
                    
                case 4:
                	
                    do {
                        JOptionPane.showMessageDialog(null, "You chose Ocean Facts");
                        String randomQuestionOF = oceanF.getRandomQuestionOF();
                        String answerOF = JOptionPane.showInputDialog(randomQuestionOF);
                        if (oceanF.checkAnswerOF(randomQuestionOF, answerOF)) {
                            JOptionPane.showMessageDialog(null, "Correct");
                            count++;
                            correctAnswers++;
                            if (count == 3) {
                            	JOptionPane.showMessageDialog(null, "Congrats, you got all three correct");
                            }
                            
                        } else {
                        	frameWin.setVisible(false);
                        	frameLose.setVisible(true);
                            JOptionPane.showMessageDialog(null, "Incorrect\nGAME OVER. You are now being sent to the main menu.");
                            count = 0;
                            wrongAnswers++;
                            break;
                        }
                    } while (oceanF.getOceanFactsIncremenet() == 3);
                    break;
                    
                    
                case 5:
                    do {
                        JOptionPane.showMessageDialog(null, "You chose Ship Facts");
                        String randomQuestionSF = ship.getRandomQuestionSF();
                        String answerSF = JOptionPane.showInputDialog(randomQuestionSF);
                        if (ship.checkAnswersSF(randomQuestionSF, answerSF)) {
                            JOptionPane.showMessageDialog(null, "Correct");
                            frameWin.setVisible(true);
                            count++;
                            correctAnswers++;
                            if (count == 3) {
                            	JOptionPane.showMessageDialog(null, "Congrats, you got all three correct");
                            }
                        } else {
                        	frameWin.setVisible(false);
                        	frameLose.setVisible(true);
                            JOptionPane.showMessageDialog(null, "Incorrect\nGAME OVER. You are now being sent to the main menu.");
                            count = 0;
                            wrongAnswers++;
                            break;
                        }
                        JOptionPane.showMessageDialog(null,"Congratulations! You win! :) ");
                    } while (ship.getShipFactsIncrement() == 3);
                    break;
                    
                    
                case 6: 
                	JOptionPane.showMessageDialog(null, "Number of correct answers: " + correctAnswers);
                	JOptionPane.showMessageDialog(null, "Number of wrong answers: " + wrongAnswers);
                	
                	
                case 7: 
                	JOptionPane.showMessageDialog(null, "Thank you for playing Keep The Boat Afloat!");
                	break;
            	default:
            	
            		JOptionPane.showMessageDialog(null,"Input mismatch! Please enter a number from the menu");
            		 break;
        
              
                		
                		
                    
                   
            }
        }
        

    }
}


