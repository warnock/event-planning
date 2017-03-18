import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(1, "entree", "beer", "music");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void newEvent_getsNumberOfPeople_1() {
    Event testEvent = new Event(1, "entree", "beer", "music");
    assertEquals(1, testEvent.getsNumberOfPeople());
  }

  @Test
  public void newEvent_getsFood_entree() {
    Event testEvent = new Event(1, "entree", "beer", "music");
    assertEquals("entree", testEvent.getsFood());
  }

  @Test
  public void newEvent_getsDrink_beer() {
    Event testEvent = new Event(1, "entree", "beer", "music");
    assertEquals("beer", testEvent.getBeverage());
  }

  @Test
  public void newEvent_getEntertainment_music() {
    Event testEvent = new Event(1, "entree", "beer", "music");
    assertEquals("music", testEvent.getEntertainment());
  }

  @Test
  public void peopleCost_costOfindividualPeople_5() {
    Event testEvent = new Event(1, "entree", "beer", "DJ");
    int expected = 5;
    assertEquals(expected, testEvent.peopleCost());
  }

  @Test
  public void foodCost_costOfFood_10() {
    Event testEvent = new Event(1, "entree", "beer", "DJ");
    assertEquals(10, testEvent.foodCost());
  }

  @Test
  public void beverageCost_costOfBeverage_10() {
    Event testEvent = new Event(1, "entree", "beer", "DJ");
    assertEquals(5, testEvent.beverageCost());
  }

  @Test
  public void entertainmentCost_costOfEnteraiment_150() {
    Event testEvent = new Event(1, "entree", "beer", "DJ");
    assertEquals(150, testEvent.entertainmentCost());
  }

  @Test
  public void totalEventCost_totalCostOfEvent_totalValueOfEvent() {
    Event testEvent = new Event(1, "entree", "beer", "DJ");
    assertEquals(170, testEvent.totalEventCost());
  }

  @Test
  public void couponDealDj_subrtactsCostOfDjIfMoreThan150Peole_Subracts150() {
    Event testEvent = new Event(150, "entree", "beer", "DJ");
    assertEquals(3000, testEvent.couponDealDj());
  }

  @Test
  public void couponDeal50_subrtacts50FromTotalEventCost_Subracts50() {
    Event testEvent = new Event(1, "entree", "beer", "DJ");
    assertEquals(120, testEvent.couponDeal50());
  }
}
