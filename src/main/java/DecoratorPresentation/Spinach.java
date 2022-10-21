package DecoratorPresentation;

public class Spinach extends ToppingDecorator {


    public Spinach(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Spinach";
    }

    @Override
    public double getCost() {
        return super.getCost() + .25;
    }

}