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
    int totalCost = 5 * mPeople;
    return totalCost;
  }
  public int foodCost() {
    int totalCost = 0;
    if (mFood.equals("entree")) {
      totalCost = 10 * mPeople;
    } else if (mFood.equals("light snacks")) {
      totalCost = 5 * mPeople;
    }
    return totalCost;
  }
  public int beverageCost() {
    return 0;
  }
}
