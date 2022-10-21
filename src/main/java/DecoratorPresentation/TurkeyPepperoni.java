package DecoratorPresentation;

import DecoratorPresentation.Pizza;
import DecoratorPresentation.ToppingDecorator;

public class TurkeyPepperoni extends ToppingDecorator {

    public TurkeyPepperoni(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Turkey Pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + .75;
    }
}
