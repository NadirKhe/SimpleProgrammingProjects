/*  
  Author: Nadir Kheiralla
  Title: DNASequence
  Description: Java program used for finding proteins in DNA strands.
*/
public class DNA {

  public static void main(String[] args) {

    //DNA Strand varaibles for testing
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = "ATGTACGCTTAGTGA";
    String fakeDNA = "ABCDEFG";
    String initialSeq = "";

    System.out.print("DNA Sequence length is: ");
    System.out.println(dna2.length());
    System.out.println("");

    //Loop to test if the sequence is a protein
    if (dna2.indexOf("ATG") != -1 && dna2.indexOf("TGA") != -1) {
      initialSeq = dna2.substring(dna2.indexOf("ATG"), dna2.indexOf("TGA") + 3);

      if (initialSeq.length() % 3 == 0) {
        String protein = initialSeq;
        System.out.println("Protein found! Sequence: " + protein);
      }
      else {
        System.out.println("No protein.");
      }      
    }
    else {
      System.out.println("No protein.");
    }
  }
}
