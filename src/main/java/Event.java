public class Event {
  private int mPeople;
  private String mFood;
  private String mBeverage;

  public Event(int people, String food, String beverage, String enterainment) {
    mPeople = people;
    mFood = food;
    mBeverage = beverage;
  }

  //getter methods
  public int getsNumberOfPeople() {
    return mPeople;
  }
  public String getsFood() {
    return mFood;
  }
  public String getBeverage() {
    return mBeverage;
  }
  public String getEntertainment() {
    return "";
  }
}
