class SinoTibetan extends Language {
  
  //Constructor
  SinoTibetan(String stLangName, int stSpeakers) {
    super(stLangName, stSpeakers, "Asia", "subject-object-verb");

    //Incase the language is Chinese
    if (stLangName.contains("Chinese")) {
      this.wordOrder = "subject-verb-object";
    }
  }
  //Displaying all Asia information the same
  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + 
    " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + 
    this.wordOrder);
  }
}
