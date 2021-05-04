import org.junit.Test;

import java.time.DateTimeException;

import static org.junit.Assert.assertTrue;

public class DateTest {
    @Test
    public void testDate() {
        Date d1 = new Date(2021, 3, 5);
        Date d2 = new Date(2021, 3, 20);
        assertTrue(Date.dayDiff(d1, d2) == 15);
    }

    @Test
    public void testNowEquality() {
        Date d1 = new Date();
        Date d2 = new Date();
        assertTrue(Date.dayDiff(d1,d2) == 0);
    }

    @Test
    public void testSince() {
        Date d = new Date(2020, 03, 05);
        int e = Date.dayDiff(d, new Date());
        assertTrue(Date.daysSince(d) == e);
    }

}
