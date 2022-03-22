package attractions ;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    private double price;

    public Dodgems(String name, int rating, double price) {

        super(name, rating);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double halfPrice(){
        return getPrice() / 2;
    }

    public double discountedPrice(Visitor visitor){
        if (visitor.getAge() >= 12) {
            return getPrice();
        }
        return halfPrice();
    }

    @Override
    public double defaultPrice() {
        return 0;
    }

    @Override
    public double priceFor() {
        return 0;
    }
}
