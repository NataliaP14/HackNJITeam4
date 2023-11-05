import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class ShipFacts {

    int shipFactIncrement = 0;
    private Random randomSF = new Random();
    private HashMap<String, String> questionsSF = new HashMap<>();

    public ShipFacts() {
        initializeQuestionsSF();
    }

    private void initializeQuestionsSF() {
        questionsSF.put("Which ship is known as the \"unsinkable\" ship but tragically sank on its maiden voyage? \n"
                + "  a) Titanic\n  b) Britannic\n  c) Lusitania\n  d) Queen Mary\n", "a");
        //
        questionsSF.put("What is the largest type of warship, typically featuring a flat deck for aircraft takeoffs and landings? \n"
                + "  a) Submarine\n  b) Destroyer\n  c) Aircraft Carrier\n  d) Cruiser\n", "c");
        //
        questionsSF.put("Which explorer's ship, the Santa Maria, is famous for its role in Christopher Columbus's first voyage to the Americas? \n"
                + "  a) Ferdinand Magellan\n  b) Vasco da Gama\n  c) Marco Polo\n  d) Christopher Columbus\n", "d");
        //
        questionsSF.put("What is the term for a ship's steering wheel? \n"
                + "  a) Helm\n  b) Rudder\n  c) Tiller\n  d) Wheelie\n", "a");
        //
        questionsSF.put("Which type of ship is designed for scientific research in oceans and seas? \n"
                + "  a) Cruise ship\n  b) Container ship\n  c) Research vessel\n  d) Fishing boat\n", "c");
        //
        questionsSF.put("The Battle of Trafalgar was fought during which historical period? \n"
                + "  a) Renaissance\n  b) Middle Ages\n  c) Napoleonic Wars\n  d) Cold War\n", "c");
        //
        questionsSF.put("What does the acronym \"SOS\" traditionally stand for in maritime distress signals? \n"
                + "  a) Save Our Ship\n  b) Sailing Over Seas\n  c) Ship On Sight\n  d) None of the above\n", "a");
        //
        questionsSF.put("Which famous pirate ship, captained by Edward Teach, was known for its black sails and fearsome reputation? \n"
                + "  a) Revenge\n  b) Black Pearl\n  c) Queen Anne's Revenge\n  d) Jolly Roger\n", "c");
        //
        questionsSF.put("What is the purpose of a ship's anchor? \n"
                + "  a) Navigation\n  b) Propulsion\n  c) Stability\n  d) Mooring\n", "d");
        //
        questionsSF.put("In naval terms, what does the abbreviation \"U-boat\" refer to? \n"
                + "  a) Underwater boat\n  b) United boat\n  c) Unmanned boat\n  d) Submarine\n", "d");

    }

    public boolean checkAnswersSF(String question, String answer) {
        String correctAnswer = questionsSF.get(question);
        return answer.equalsIgnoreCase(correctAnswer);
    }

    public String getRandomQuestionSF() {
        Set<String> questionSetSF = questionsSF.keySet();
        int randomIndexSF = randomSF.nextInt(questionSetSF.size());
        String[] questionArraySF = questionSetSF.toArray(new String[0]);
        shipFactIncrement++;
        return questionArraySF[randomIndexSF];
    }

    public int setShipFactsIncrement() {
        return shipFactIncrement;
    }

    public int getShipFactsIncrement() {
        return shipFactIncrement;
    }

    public void displayQuestionSF(String question) {
        System.out.println(question);
    }
}