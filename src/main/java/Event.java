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
  //end getter methods

  public int peopleCost(){
    int totalCost = 5 * getsNumberOfPeople();
    return totalCost;
  }
  public int foodCost() {
    int totalCost = 0;
    if (getsFood().equals("entree")) {
      totalCost = 10 * getsNumberOfPeople();
    } else if (getsFood().equals("light snacks")) {
      totalCost = 5 * getsNumberOfPeople();
    }
    return totalCost;
  }
  public int beverageCost() {
    int totalCost = 0;
    if (getBeverage().equals("beer")) {
      totalCost = 5 * getsNumberOfPeople();
    } else if (getBeverage().equals("wine")) {
      totalCost = 10 * getsNumberOfPeople();
    } else if (getBeverage().equals("soda")) {
      totalCost = 2 * getsNumberOfPeople();
    }
    return totalCost;
  }
  public int entertainmentCost() {
    int totalCost = 0;
    if (getEntertainment().equals("DJ")) {
      totalCost = 150;
    } else if (getEntertainment().equals("full band")) {
      totalCost = 250;
    }
    return totalCost;
  }
  public int totalEventCost() {
    int totalCost = peopleCost() + foodCost() + beverageCost() + entertainmentCost();
    return totalCost;
  }
  public int couponDealDj() {
    int totalCost = 0;
    if (getsNumberOfPeople() >= 150) {
    totalCost = totalEventCost() - 150;
  }
    return totalCost;
  }

  public int couponDeal50() {
    // int totalCost = totalEventCost() - 50;
    return 0;
  }
}
