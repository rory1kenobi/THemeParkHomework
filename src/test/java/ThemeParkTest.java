import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

        Dodgems dodgems;
        Park park;
        Playground playground;
        RollerCoaster rollerCoaster;
        CandyflossStall candyflossStall;
        IceCreamStall iceCreamStall;
        TobaccoStall tobaccoStall;
        ThemePark themePark;
        Visitor grownUp;

        @Before
        public void before() {
            dodgems = new Dodgems("Zippy Dodgems", 5, 4.50);
            park = new Park("Dystopian Hill", 4);
            playground =  new Playground("Hazardous Game Zone", 2);
            rollerCoaster = new RollerCoaster("Love Rollercoaster", 10, 8.40);
            iceCreamStall = new IceCreamStall("Gelati Divini", "Marco da Mosta", ParkingSpot.A1, 8);
            tobaccoStall = new TobaccoStall("Tabac", "Jerry Cigarette", ParkingSpot.B3, 6);
            candyflossStall = new CandyflossStall("Sweet Dreams", "Sarah Sugar", ParkingSpot.B4, 7);
            themePark = new ThemePark(dodgems, park, playground, rollerCoaster, candyflossStall, iceCreamStall, tobaccoStall);
            grownUp = new Visitor(25, 2.05, 25);
        }

        @Test
        public void canGetAllReviewed() {
            assertEquals(7, themePark.getAllReviewed().size());
        }
}
