/*
  Author: Nadir Kheiralla
  Title: Language
  Description: Basic Java program used for practice on Inheritance and Polymorphism for retrieving description and information on languages.
*/
public class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

 //Constructor
  public Language(String initialName, int initialNumSpeakers, String 
  initialRegionsSpoken, String initialWordOrder) {
    name = initialName;
    numSpeakers = initialNumSpeakers;
    regionsSpoken = initialRegionsSpoken;
    wordOrder = initialWordOrder;
  }

  //Method to display information on language
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + 
    " people mainly in " + this.regionsSpoken);
    System.out.println("The language follows the word order: " + 
    this.wordOrder);
  }

  //Main method
  public static void main(String[] args) {
    Language arabic = new Language("Arabic", 313000000, "Middle East", 
    "verb-subject-object"); 
    arabic.getInfo();
    Language achi = new Mayan("Achi", 82600);
    achi.getInfo();
    Language kiche = new Mayan("Ki'che'", 2330000);
    kiche.getInfo();
    Language mandarin = new SinoTibetan("Mandarin Chinese", 898000000);
    mandarin.getInfo();
    Language burmese = new SinoTibetan("Burmese", 36000000);
    burmese.getInfo();
  }
}
