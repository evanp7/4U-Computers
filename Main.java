import java.util.Scanner;

class main {
  public static void main(String[] args) {

// Scanner 
    Scanner input = new Scanner(System.in);


// Variables
    String AniName;
    int StartAmount;
    int CurrYear = 2020;
    int ProjYear;
    int ProjPop;

// Input screen
    System.out.println("Please enter the type of animal");
    AniName = input.nextLine();

    System.out.println("Please enter the current number of" + AniName);
    StartAmount = input.nextInt();

    System.out.println("Please enter the projection year");
    ProjYear = input.nextInt();

// Output screen
    System.out.println("Type of animal: " + AniName);



  }
}