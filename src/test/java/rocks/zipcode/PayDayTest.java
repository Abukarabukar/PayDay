package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayDayTest {

    @Test
    public void pay() {
        PayDay payDay1 = new PayDay();
        PayDay payDay2 = new PayDay();
        PayDay payDay3 = new PayDay();
        java.lang.String string1 = payDay1.pay("Kris", 21.5, 10.0, 0.05);
        java.lang.String string2 = payDay2.pay("Dolio", 23.0, 12.0, 0.05);
        java.lang.String string3 = payDay3.pay("Karen", 21.5, 12.0, 0.05);
        assertEquals("Kris 215.00 10.75 204.25", string1);
        assertEquals("Dolio 276.00 13.80 262.20", string2);
        assertEquals("Karen 258.00 12.90 245.10", string3);

    }
}