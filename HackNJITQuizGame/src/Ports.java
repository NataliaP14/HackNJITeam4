OliviaBranch
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class Ports {

	public void displayQuestionP(String randomQuestionP) {
		// TODO Auto-generated method stub
		
	}

	public String getRandomQuestionP() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean checkAnswerP(String randomQuestionP, String answerP) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getPortsIncremenet() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	    
	int portsIncrement = 0;
	private Random randomP = new Random();
	private HashMap<String, String> questionsP = new HashMap<>();

	public Ports() {
		initializeQuestionsP();
	    }

	private void initializeQuestionsP() {
		//1
		questionsP.put("Which sea port is known for its iconic red suspension bridge, often referred to as the 'Golden Gate Bridge' \n"
	                + "  a) Port of Los Angeles\n  b) Port of Sydney\n  c) Port of San Francisco\n  d) Port of Vancover\n", "c");
	    //2
		questionsP.put("Which sea port is renowned as the 'Gateway to the Americas'? \n"
	        + "  a) Port of Miami\n  b) Port of Havana\n  c) Port of Cartagena\n  d) Port of Kingston\n", "a");
	    //3
		questionsP.put("The port of Yokohama is an essential port in which country? \n"
	        + "  a) South Korea\n  b) China\n  c) Japan\n  d) Taiwan\n", "c");
	    //4
		questionsP.put("The Port of Durban is a significant port in which African country? \n"
	        + "  a)Nigeria\n  b) South Africa\n  c) Kenya\n  d) Egypt\n", "b");
	    //5
		questionsP.put("Which seaport is famous for its stunning Opera House and Harbor Bridge? \n"
	        + "  a) Port of Auckland\n  b) Port of Melbourne\n  c) Port of Sydney\n  d) Port of Brisbane\n", "c");
	    //6
		questionsP.put("Which port, located in the United Arab Emirates, is one of the largest and busiest ports in the Middle East? \n"
	        + "  a) Port of Dubai\n  b) Port of Abu Dhabi\n  c) Port of Doha\n  d) Port of Muscat\n", "c");
		//7
		questionsP.put("Where in South America is the Port of Valpraiso located? \n"
				+ "  a) Argentina\n  b) Brazil\n  c) Chile\n  d) Peru\n", "c");
		//8
		questionsP.put("The Port of Antwerp is one of the largest ports in Europe situated in which country? \n"
				+ "  a) France\n  b) Belgium\n  c) Germany\n  d) Netherlands\n", "b");
		//9
		questionsP.put(" The Port of Charleston is a key seaport located in which U.S. state? \n"
				+ "  a) Florida\n  b) North Carolina\n  c) Georgia\n  d) South Carolina\n", "d");
		//10
		questionsP.put(" Which seaport, located on the southeastern coast of China, is known for its deep-water harbor and is a major trading hub? \n"
				+ "  a) Port of Hong Kong\n  b) Port of Shanghai\n  c) Port of Shenzhen\n  d) Port of Guangzhou\n", "a");
	        
	    
	    }

	public boolean checkAnswerP(String question, String answer) {
	    String correctAnswer = questionsP.get(question);
	    return answer.equalsIgnoreCase(correctAnswer);
	}

	public String getRandomQuestionP() {
	        
	    Set<String> questionSetP = questionsP.keySet();
	    int randomIndexP = randomP.nextInt(questionSetP.size());
	    String[] questionArrayP = questionSetP.toArray(new String[0]);
	    portsIncrement++;
	    return questionArrayP[randomIndexP];
	      
	    }
	 public int setPortsIncrement() {
	    return portsIncrement;
	 }
	    
	 public int getPortsIncremenet() {
	    return portsIncrement;
	 }

	 public void displayQuestionP(String question) {
	    System.out.println(question);
	 }

public class Ports {
	
main
}
	


