package DecoratorPresentation;

import DecoratorPresentation.Pizza;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thing dough";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
