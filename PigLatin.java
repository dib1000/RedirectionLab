import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class PigLatin {
  public static String pigLatinSimple(String s) {
    String ls = s.toLowerCase();
    ArrayList<String> vowels = new ArrayList<String>(Arrays.asList(new String[]{"a","e","i","o","u"}));
    if(vowels.contains(ls.substring(0,1))) {
      return ls + "hay";
    }
    else {
      return ls.substring(1) + ls.charAt(0) + "ay";
    }
  }
  public static String pigLatin(String s) {
    String ls = s.toLowerCase();
    ArrayList<String> diagraphs = new ArrayList<String>(Arrays.asList(new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"}));
    if(ls.length()>1 && diagraphs.contains(ls.substring(0,2))) {
      return ls.substring(2) + ls.substring(0,2) + "ay";
    }
    else {
      return pigLatinSimple(ls);
    }
  }
  public static String pigLatinBest(String s) {
    String ls = s.toLowerCase();
    ArrayList<String> numbers = new ArrayList<String>(Arrays.asList(new String[]{"0","1","2","3","4","5","6","7","8","9"}));
    ArrayList<String> letters = new ArrayList<String>(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","y","z"}));
    if(!(letters.contains(ls.substring(0,1)))) {
      return ls;
    }
    if(letters.contains(ls.substring(ls.length()-1)) || numbers.contains(ls.substring(ls.length()-1))) {
      return pigLatin(ls);
    }
    else {
      String sl = s.substring(0,ls.length()-1);
      return pigLatin(sl) + ls.substring(ls.length()-1);
    }
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while(in.hasNext()) {
      String line = in.nextLine();
      Scanner n = new Scanner(line);
      while(n.hasNext()) {
        String word = n.next();
        System.out.print(pigLatinBest(word));
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
