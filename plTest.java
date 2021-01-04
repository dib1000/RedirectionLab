public class plTest {
  public static void main(String[] a) {
    System.out.println("TESTING pigLatinSimple");
    System.out.println(PigLatin.pigLatinSimple("mock"));
    System.out.println(PigLatin.pigLatinSimple("pie"));
    System.out.println(PigLatin.pigLatinSimple("david"));
    System.out.println(PigLatin.pigLatinSimple("aaron"));
    System.out.println(PigLatin.pigLatinSimple("the"));
    System.out.println(PigLatin.pigLatinSimple("check"));
    System.out.println();

    System.out.println("TESTING pigLatin");
    System.out.println(PigLatin.pigLatin("the"));
    System.out.println(PigLatin.pigLatin("check"));
    System.out.println(PigLatin.pigLatin("skee"));
    System.out.println(PigLatin.pigLatin("emu"));
    System.out.println(PigLatin.pigLatin("grade"));
    System.out.println();

    System.out.println("TESTING pigLatinBest");
    System.out.println(PigLatin.pigLatinBest("*emu"));
    System.out.println(PigLatin.pigLatinBest("4chan"));
    System.out.println(PigLatin.pigLatinBest("fish!"));
    System.out.println(PigLatin.pigLatinBest("fish"));
    System.out.println(PigLatin.pigLatinBest("the."));
    System.out.println(PigLatin.pigLatinBest("cat!"));
    System.out.println(PigLatin.pigLatinBest("amazing?"));
    System.out.println(PigLatin.pigLatinBest("apple%"));
    System.out.println(PigLatin.pigLatinBest("33ls"));
    System.out.println(PigLatin.pigLatinBest("appl3"));
    System.out.println(PigLatin.pigLatinBest("skee!"));
    System.out.println(PigLatin.pigLatinBest("5kee"));
  }
}
