import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int age;
    String firstName;
    String favouriteFood;

    System.out.println("Please enter you age: ");
    age = scan.nextInt();

    System.out.println("Please enter first name:");
    scan.nextLine();
    firstName = scan.nextLine();

    System.out.println("Please enter favourite food: ");
    favouriteFood = scan.nextLine();

    System.out.println(" Age: " + age);
    System.out.println(" firstName: " + firstName);
    System.out.println(" favouriteFood: " + favouriteFood);


    }

}
