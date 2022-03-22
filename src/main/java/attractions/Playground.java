package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements IReviewed, ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= 15;
    }

}
