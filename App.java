import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    List <Parcel> userParcelArray = new ArrayList<Parcel>();
    System.out.println("Welcome to our package shipment terminal!");

    boolean programRunning = true;

    while (programRunning) {
      System.out.println("Please enter the length in inches: ");
      int userLength = Integer.parseInt(myConsole.readLine());

      System.out.println("Please enter the width in inches: ");
      int userWidth = Integer.parseInt(myConsole.readLine());

      System.out.println("Please enter the height in inches: ");
      int userHeight = Integer.parseInt(myConsole.readLine());

      System.out.println("Please enter the weight in lbs: ");
      int userWeight = Integer.parseInt(myConsole.readLine());

      System.out.println("Please enter the distance in miles: ");
      int userDistance = Integer.parseInt(myConsole.readLine());

      Parcel userParcel = new Parcel(userLength, userWeight, userHeight, userWeight, userDistance);

      System.out.println("For 5 day shipping your cost is: $" + userParcel.costToShip(userParcel));
      System.out.println("For 2-3 day shipping your cost is: $" + (userParcel.costToShip(userParcel) * 2));
      System.out.println("For 1 day shipping your cost is: $" + (userParcel.costToShip(userParcel) * 3));

      System.out.println("Please type 5, 2-3, or 1 to make your selection.");
      String shippingSpeed = myConsole.readLine();

      if (shippingSpeed.equals("5")) {
        System.out.println("Ok your cost for shipping is: $" + userParcel.costToShip(userParcel));
      } else if (shippingSpeed.equals("2-3")) {
        System.out.println("Ok your cost for shipping is: $" + (userParcel.costToShip(userParcel) * 2));
      } else if (shippingSpeed.equals("1")) {
        System.out.println("Ok your cost for shipping is: $" + (userParcel.costToShip(userParcel) * 3));
      }
    }
  }
}
