import java.util.ArrayList;
import java.util.Arrays;
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
}
