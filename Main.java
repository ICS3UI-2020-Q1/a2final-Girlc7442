import java.util.Scanner;

/**
 *Calculates the subtotal, taxes and total using the diameter of a pizza 
 * @author Cole G.
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask the user how large the diameter of the pizza is (in cm)
    System.out.println("What is the size of the pizza (in cm):");
    //Get the size of the pizza
    int pizzaSize = input.nextInt();

    //Calculates the price of the pizza using the diameter
    double pizzaSizePrice = pizzaSize * 0.50;

    //Price of labour
    final double LABOUR = 0.75;

    //Price of the power required to run the oven
    final double OVEN = 0.99;

    //Calculates the subtotal
    double subtotal = pizzaSizePrice + LABOUR + OVEN;
    //Prints the subtotal to the screen
    System.out.println("Subtotal: $" + subtotal);

    //Calculates the tax
    double tax = subtotal * 0.13;
    //Prints the tax to the screen
    System.out.println("Taxes: $" + tax);

    //Calculates the total
    double total = tax + subtotal;
    //Prints the total to the screen
    System.out.println("Total: $" + total);

    //Prints a message to the screen depending on how large the pizza is
    if(pizzaSize <= 20){
      //Prints the message for a pizza under 20cm in diameter
      System.out.println("We are going to make you a cute little pizza!");
    }else if(pizzaSize >= 21 && pizzaSize <= 40){
      //Prints the message for a pizza over 21cm in diameter but under 40cm in  diameter
      System.out.println("This will be delicious!");
    }else if(pizzaSize >= 41){
      //Prints the message for a pizza over 41cm in diameter
      System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    }


  }
}
