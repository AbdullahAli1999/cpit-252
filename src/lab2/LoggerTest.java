package lab2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LoggerTest {
    @Test
    public void shouldBeIdenticals()
    {
      Logger log1 = Logger.getInstance();
      Logger log2 = Logger.getInstance();
      assertEquals(log1, log2);
    }
  
}
