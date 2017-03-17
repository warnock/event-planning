import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Welcome let us plan yor event! Please answer a few questions so we can get you an estimate of your event");
    System.out.println("How many people will be attending your event?");
    String userNumberOfPeople = console.readLine();
    int numberOfPeople = Integer.parseInt(userNumberOfPeople);
    // System.out.println("Great we can throw you an event with " + numberOfPeople + " guest!");

    System.out.println("will you be wanting entrees, or light snacks?");
    String userTypeOfFood = console.readLine();

    System.out.println("Will you be wanting beer, wine, or soda?");
    String userTypeOfBeverage = console.readLine();

    System.out.println("Are you looking for a full band or DJ?");
    String userTypeOfEntertainment = console.readLine();

    Event userEvent = new Event(numberOfPeople, userTypeOfFood, userTypeOfBeverage, userTypeOfEntertainment);

    System.out.println("Here is your event details:");
    System.out.println( "----------------------" );
    System.out.println("Number of gusts: " + userEvent.getsNumberOfPeople());
    System.out.println("Type of food: " + userEvent.getsFood());
    System.out.println("Type of beverage: " + userEvent.getBeverage());
    System.out.println("Type of entertainment: " + userEvent.getEntertainment());
  }
}
