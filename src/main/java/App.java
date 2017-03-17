import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Welcome to the Event Party Planning Committee! We would love to help you set up your speicial event! Please answer a few questions to help us, help you better.");
    System.out.println("How many people will be attending your event?");
    String userNumberOfPeople = console.readLine();
    int numberOfPeople = Integer.parseInt(userNumberOfPeople);
    
  }
}
