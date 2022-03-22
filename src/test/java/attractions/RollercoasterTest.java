package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40);
        visitor = new Visitor(14, 1.36, 25);
        visitor2 = new Visitor(14, 2.01, 25);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isOlderThan12AndIsTallerThan145cm(){
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void hasPrice(){
        assertEquals(8.40, rollerCoaster.getPrice(), 0.00);
    }

    @Test
    public void canChargeDoublePrice(){
        assertEquals(16.80, rollerCoaster.doublePrice(), 0.00);
    }

    @Test
    public void canChargeDoublePriceForOver200cm(){
        assertEquals(16.80, rollerCoaster.rollerCoasterCost(visitor2), 0.00);
    }
}
