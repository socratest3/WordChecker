import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
{
    WordChecker w = new WordChecker();
    ArrayList<String> words = new ArrayList<String>();
    words.add("an");
    words.add("band");
    words.add("band");
    words.add("abandon");
    WordChecker x = new WordChecker(words);
    System.out.println(x.isWordChain());

    WordChecker b = new WordChecker();
    ArrayList<String> words2 = new ArrayList<String>();
    words2.add("to");
    words2.add("tool");
    words2.add("stool");
    words2.add("tools");
    WordChecker a = new WordChecker(words2);
    System.out.println(a.isWordChain());

    WordChecker d = new WordChecker();
    ArrayList<String> words3 = new ArrayList<String>();
    words3.add("catch");
    words3.add("bobcat");
    words3.add("catchacat");
    words3.add("cat");
    words3.add("at");
    WordChecker e = new WordChecker(words3);
    System.out.println(e.createList("cat"));
    System.out.println(e.createList("catch"));
    System.out.println(e.createList("dog"));

    


}
}
