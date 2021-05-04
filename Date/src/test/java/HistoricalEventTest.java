import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HistoricalEventTest {
    @Test
    public void constructorNameTest() {
        HistoricalEvent e = new HistoricalEvent("Hong", new Date(2020, 01, 01));
        assertTrue(e.getStartDate().date.getYear() == 2020
                && e.getName().equalsIgnoreCase("Hong"));
    }
}
