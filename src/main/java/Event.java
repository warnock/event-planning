public class Event {
  private int mPeople;
  private String mFood;

  public Event(int people, String food, String beverage, String enterainment) {
    mPeople = people;
    mFood = food;
  }

  //getter methods
  public int getsNumberOfPeople() {
    return mPeople;
  }
  public String getsFood() {
    return mFood;
  }
}
