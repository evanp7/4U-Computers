import java.util.Scanner;

class Main {
  public static void main(String[] args) {

// Scanner 
    Scanner input = new Scanner(System.in);

//Question 1
Boolean Answer1; // Variable

    System.out.println("This is a true or false question, please type 'True' or 'False'");
    System.out.println("Does Tesla make electric cars?");
    Answer1 = input.nextBoolean();

    if (Answer1 == true)
    {
      System.out.println("That is correct.");
    }

    else if (Answer1 == false)
    {
      System.out.println("That is incorrect.");
    }
    else
    {
      System.out.println("Please try again.");
    }


// Question 2
String Answer2; // Variable

    System.out.println("This is a multiple choice question");
    System.out.println("What is 2^5? Please type A, B, C or D");
    System.out.println("A) 10");
    System.out.println("B) 30");
    System.out.println("C) 32");
    System.out.println("D) 7");
    Answer2 = input.nextLine();

    if (Answer2 == "C")
    {
      System.out.println("That is correct.");
    }
    else
    {
      System.out.println("That is incorrect. Please try again.");
    }


// Question 3
int Answer3;

    System.out.println("What years are in 21st century?");
    



  }
}