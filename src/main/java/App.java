import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Welcome! Let us plan your event! Please answer a few questions and we will give you an estimate on the cost of your event.");
    System.out.println("How many people are you hosting this event for?");
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
    System.out.println( "---------------------------------------" );
    System.out.println("Number of gusts: " + userEvent.getsNumberOfPeople());
    System.out.println("Type of food: " + userEvent.getsFood());
    System.out.println("Type of beverage: " + userEvent.getBeverage());
    System.out.println("Type of entertainment: " + userEvent.getEntertainment ());
    System.out.println( "---------------------------------------" );
    System.out.println("Your estimated cost for this event will be: " + userEvent.totalEventCost());
    System.out.println( "---------------------------------------" );

    System.out.println("If you have a coupon code please enter it below.");
    String userCoupon = console.readLine();
    if (userCoupon.equals("dealdj")) {
      if (userEvent.getsNumberOfPeople() >= 150) {
        System.out.println("Great! We can offer you a free DJ for your event! The total cost of your even with the discount is now:");
        System.out.println(userEvent.couponDealDj());
      } else if (userEvent.getsNumberOfPeople() < 150) {
        System.out.println("Sorry the coupon for a free DJ only applys if you have 150 or more guest for your event");
      }
    } else if (userCoupon.equals("deal50")) {

    } else {
      // System.out.println("Sorry that is not a valid coupon deal");
    }


  }
}
