import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
  Event testEvent = new Event(1, "entree", "beer", "music");
  assertEquals(true, testEvent instanceof Event);
  }

}