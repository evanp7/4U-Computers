import java.util.Scanner;

class Main {
  public static void main(String[] args) {

// Scanner 
    Scanner input = new Scanner(System.in);

// Variables
    String ProNoun;
    String Noun;
    String Verb;
    String Sentence;

//Input Screen
    System.out.println("Please enter a proper noun: ");
    ProNoun = input.nextLine();

    System.out.println("Please enter a noun: ");
    Noun = input.nextLine();

    System.out.println("Please enter a verb: ");
    Verb = input.nextLine();

// Replace integers w/ strings *(treat 1, 2 & 3 as "text" instead of integers to use String.replaceAll)
    Sentence = "1 was an interesting 2, but a unique 2. They could 3 better than any other 2. 3ing is 1’s favorite activity.";

    System.out.print(Sentence.replaceAll("1", ProNoun).replaceAll("2", Noun).replaceAll("3", Verb));


  }
}