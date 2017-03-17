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
    Event testEvent = new Event(1, "entree", "beer", "music");
    int expected = 5;
    assertEquals(expected, testEvent.peopleCost());
  }

  @Test
  public void foodCost_costOfFood_10() {
    Event testEvent = new Event(1, "entree", "beer", "music");
    assertEquals(10, testEvent.foodCost());
  }

  @Test
  public void beverageCost_costOfBeverage_10() {
    Event testEvent = new Event(1, "entree", "beer", "music");
    assertEquals(5, testEvent.beverageCost());
  }

}
