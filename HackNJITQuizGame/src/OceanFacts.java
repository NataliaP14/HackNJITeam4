import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class OceanFacts {

   //incrementing 
    int OceanFactsIncrement = 0;
    private Random randomOF = new Random();
    //hashmap for the questions and answers

    private HashMap<String, String> questionsOF = new HashMap<>();

    public OceanFacts() {
        initializeQuestionsOF();
    }



    //creating questions from the hashmap

    private void initializeQuestionsOF() {
        //1
        questionsOF.put("What percentage of the Earth's surface is covered by oceans?\n"
        		+ "A) Approximately 50%\n"
        		+ "B) Approximately 60%\n"
        		+ "C) Approximately 70%\n"
        		+ "D) Approximately 80%","C");
        //2
        questionsOF.put("Which of the following is the world's largest ocean?\n"
        		+ "A) Indian Ocean\n"
        		+ "B) Atlantic Ocean\n"
        		+ "C) Pacific Ocean\n"
        		+ "D) Southern Ocean","C");
        //3
        questionsOF.put("What causes the bioluminescent glow often observed in certain parts of the ocean?\n"
        		+ "A) Algae blooms\n"
        		+ "B) Underwater volcanoes\n"
        		+ "C) Bioluminescent fish\n"
        		+ "D) Phytoplankton","D");
        //4
        questionsOF.put("How much of the Earth's oxygen is produced by the oceans?\n"
        		+ "A) About 10%\n"
        		+ "B) About 20%\n"
        		+ "C) About 30%\n"
        		+ "D) About 50%","A");
        //5
        questionsOF.put("What is the name of the deepest known part of the ocean?\n"
        		+ "A) Mariana Trench\n"
        		+ "B) Puerto Rico Trench\n"
        		+ "C) Tonga Trench\n"
        		+ "D) Philippine Trench","A");
        //6
        questionsOF.put("What causes the tides in the ocean?\n"
        		+ "A) Gravitational pull of the moon and sun\n"
        		+ "B) Wind patterns\n"
        		+ "C) Earth's rotation speed\n"
        		+ "D) Oceanic temperature changes\n"
        		+ "\n","A");
        //7
        questionsOF.put("Which marine creature is known for undertaking the longest migration?\n"
        		+ "A) Humpback whale\n"
        		+ "B) Leatherback sea turtle\n"
        		+ "C) Great white shark\n"
        		+ "D) Albatross", "B");
        //8
        questionsOF.put("What percentage of the world's species are estimated to live in the oceans?\n"
        		+ "A) About 25%\n"
        		+ "B) About 50%\n"
        		+ "C) About 75%\n"
        		+ "D) About 80%", "A");
        //9
        questionsOF.put("What is the main component of seawater that makes it salty?\n"
        		+ "A) Sodium chloride\n"
        		+ "B) Potassium chloride\n"
        		+ "C) Magnesium chloride\n"
        		+ "D) Calcium chloride", "A");


    }

    public boolean checkAnswerOF(String question, String answer) {
        String correctAnswer = questionsOF.get(question);
        return answer.equalsIgnoreCase(correctAnswer);
    }

    //generating a random question from the hashmap
    public String getRandomQuestionOF() {

        Set<String> questionSetOF = questionsOF.keySet();
        int randomIndexOF = randomOF.nextInt(questionSetOF.size());
        String[] questionArrayOF = questionSetOF.toArray(new String[0]);
        OceanFactsIncrement++;
        return questionArrayOF[randomIndexOF];

    }
    public int setOceanFactsIncrement() {
        return OceanFactsIncrement;
    }

    public int getOceanFactsIncremenet() {
        return OceanFactsIncrement;
    }

    //displaying the question
public void displayQuestionOF(String question) {
        System.out.println(question);
    }
}



