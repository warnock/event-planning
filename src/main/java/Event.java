public class Event {
  private int mPeople;
  private String mFood;
  private String mBeverage;
  private String mEntertainment;

  public Event(int people, String food, String beverage, String enterainment) {
    mPeople = people;
    mFood = food;
    mBeverage = beverage;
    mEntertainment = enterainment;
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
    return mEntertainment;
  }
  public int peopleCost(){
    int totalcost = 5 * mPeople;
    return totalcost;
  }
  public int foodCost() {
    return 0;
  }
}
