import java.util.*;
public class MakeStars {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while(in.hasNext()) {
      String line = in.nextLine();
      Scanner n = new Scanner(line);
      while(n.hasNext()) {
        System.out.println(n.next());
      }
    }
  }
}