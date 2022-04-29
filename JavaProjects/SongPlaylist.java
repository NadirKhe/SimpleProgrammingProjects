/*
  Author: Nadir Kheiralla
  Title: Playlist
  Description: Basic Java program used for practice on String manipulation basics.
*/
import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    
    //New playlist array list creation
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("In the End");
    desertIslandPlaylist.add("Crawling");
    desertIslandPlaylist.add("Papercut");
    desertIslandPlaylist.add("One Step Closer");
    desertIslandPlaylist.add("Breaking the Habit");
    desertIslandPlaylist.add("Lonely Day");

    System.out.println(desertIslandPlaylist);

    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove(5);

    System.out.println(desertIslandPlaylist.size());

    int indexA = desertIslandPlaylist.indexOf("In the End");
    int indexB = desertIslandPlaylist.indexOf("Breaking the Habit");

    desertIslandPlaylist.set(indexA, "Breaking the Habit");
    desertIslandPlaylist.set(indexB, "In the End");
    System.out.println(desertIslandPlaylist);
  }
  
}
