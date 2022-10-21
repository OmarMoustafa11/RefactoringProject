package DecoratorPresentation;

import DecoratorPresentation.Pizza;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Tomato Sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + .25;
    }
}
