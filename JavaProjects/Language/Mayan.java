class Mayan extends Language {

  Mayan(String mlangName, int mSpeakers) {
    super(mlangName, mSpeakers, "Central America", "verb-object-subject");
  }
  //Displaying all Central America information the same
  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + 
    " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + 
    this.wordOrder);
    //Checking if Ki'che' is the language for a fun fact
    if (this.name == "Ki'che'") {
      System.out.println("Fun Fact: " + this.name + 
      "is an ergative language");
    }
  }
}
