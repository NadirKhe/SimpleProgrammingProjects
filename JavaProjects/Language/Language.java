/*
  Author: Nadir Kheiralla
  Title: Language
  Description: Basic Java program used for practice on Inheritance and Polymorphism in a language describer application. 
*/
public class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

 //Constructor
  public Language(String initialName, int initialNumSpeakers, String initialRegionsSpoken, String initialWordOrder) {
    name = initialName;
    numSpeakers = initialNumSpeakers;
    regionsSpoken = initialRegionsSpoken;
    wordOrder = initialWordOrder;
  }

  //Method to display information on language
  public void getInfo() {
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken);
    System.out.println("The language follows the word order: " + wordOrder);
  }

  //Main method
  public static void main(String[] args) {
    Language arabic = new Language("Arabic", 313000000, "Algeria, Bahrain, Chad, Comoros, Djibouti, Egypt, Iraq, Jordan, Kuwait, Lebanon, Libya, Mauritania, Morocco, Oman, Qatar, Saudi Arabia, Somalia, Sudan, Syria, Tunisia, United Arab Emirates, and Yemen.", "verb-subject-object");

    arabic.getInfo();

  }
}
