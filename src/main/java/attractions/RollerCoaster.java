package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;


public class RollerCoaster  extends Attraction implements IReviewed, ISecurity, ITicketed {

    private double price;

    public RollerCoaster(String name, int rating, double price) {

        super(name, rating);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double doublePrice(){
        return getPrice() * 2;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor() {
        return 0;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 1.45) {
            return true;
        }
        return false;
    }

    public double rollerCoasterCost(Visitor visitor){
        if (visitor.getHeight() >= 2.01){
            return doublePrice();
        }
        return getPrice();
    }
}
