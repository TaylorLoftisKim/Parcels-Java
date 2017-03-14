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

      System.out.println("For five plus day shipping your cost is: " + userParcel.costToShip(userParcel));

    }
  }
}
