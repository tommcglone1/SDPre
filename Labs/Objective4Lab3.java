import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {

    int currentYear = 2022;
    
    Scanner input = new Scanner(System.in);


    System.out.println("How old are you?");
    int age = input.nextInt();

    int birthYear = currentYear - age;

    System.out.println("You were in born in " + birthYear);
    input.close();
    
  }
}