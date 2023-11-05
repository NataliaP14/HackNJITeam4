import java.util.HashMap;
import java.util.Random;
import java.util.Set;

 Neel

public class MarineLife {
	
	int marineLifeIncrement = 0;
    private Random randomML = new Random();
    private HashMap<String, String> questionsML = new HashMap<>();

    public MarineLife() {
        initializeQuestionsML();
    }

    private void initializeQuestionsML() {
    	//1
        questionsML.put("Which of the following is the largest animal in the world? \n"
        		+ "  a) Blue Whale\n  b) Great White Shark\n  c) Giant squid\n  d) Killer whale\n", "b");
        //2
        questionsML.put("What portion of the seafloor has been accurately mapped by scientists? \n"
        + "  a) 100%\n  b) 75%\n  c) 15%\n  d) 5%\n", "b");
        //3
        questionsML.put("What is the process by which corals expel algae living in their tissues, causing them to turn white, known as? \n"
        		+ "  a) Coral purging\n  b) Coral eruption\n  c) Coral bleaching\n  d) Coral fading\n", "c");
        //4
        questionsML.put("Which species of fish is known for its ability to change its gender? \n"
        		+ "  a)Clownfish\n  b) Parrotfish\n  c) Angelfish\n  d) Seahorse\n", "b");
        //5
        questionsML.put("What is the collective term for a group of jellyfish? \n"
        		+ "  a) Swarm\n  b) School\n  c) Herd\n  d) Smack\n", "d");
        //6
        questionsML.put("Which of the following marine creatures is considered bioluminescent? \n"
        		+ "  a) Sea anemone\n  b) Sea cucumber\n  c) lanternfish\n  d) Octopus\n", "c");
        //7
        questionsML.put("What is the function of a blowhole in whales and dolphins? \n"
        		+ "  a) Breathing\n  b) Communication\n  c) Eating\n  d) Hearing\n", "a");
        //8
        questionsML.put("Which species is known for having the largest brain-to-body mass ratio among all vertebrates? \n"
        		+ "  a) Bottlenose dolphin\n  b) sperm whale\n  c) Elephant seal\n  d) Manatee\n", "b");
        //9
        questionsML.put("What do you call the phenomenon where certain species of fish, such as salmon, return to their birthplace to reproduce? \n"
        		+ "  a) Spawning\n  b) Migration\n  c) Homing\n  d) Nesting\n", "a");
        //10
        
     
    }

    public boolean checkAnswerML(String question, String answer) {
        String correctAnswer = questionsML.get(question);
        return answer.equalsIgnoreCase(correctAnswer);
    }

    public String getRandomQuestionML() {
    	
        Set<String> questionSetML = questionsML.keySet();
        int randomIndexML = randomML.nextInt(questionSetML.size());
        String[] questionArrayML = questionSetML.toArray(new String[0]);
        marineLifeIncrement++;
        return questionArrayML[randomIndexML];
      
    }
    public int setMarineLifeIncrement() {
    	return marineLifeIncrement;
    }
    
    public int getMarineLifeIncremenet() {
    	return marineLifeIncrement;
    }

    public void displayQuestionML(String question) {
        System.out.println(question);
    
    }
    main
