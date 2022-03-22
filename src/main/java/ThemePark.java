import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.TobaccoStall;

import java.util.ArrayList;

public class ThemePark {

    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyFlossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    public ThemePark(Dodgems dodgems, Park park, Playground playground, RollerCoaster rollerCoaster, CandyflossStall candyFlossStall, IceCreamStall iceCreamStall, TobaccoStall tobaccoStall) {
        this.dodgems = dodgems;
        this.park = park;
        this.playground = playground;
        this.rollerCoaster = rollerCoaster;
        this.candyFlossStall = candyFlossStall;
        this.iceCreamStall = iceCreamStall;
        this.tobaccoStall = tobaccoStall;
    }

    public ArrayList getAllReviewed(){
        ArrayList<IReviewed> AllReviewed = new ArrayList<>();
        AllReviewed.add(this.dodgems);
        AllReviewed.add(this.park);
        AllReviewed.add(this.rollerCoaster);
        AllReviewed.add(this.playground);
        AllReviewed.add(this.candyFlossStall);
        AllReviewed.add(this.iceCreamStall);
        AllReviewed.add(this.tobaccoStall);

        return AllReviewed;
    }
}
