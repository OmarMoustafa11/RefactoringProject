package DecoratorPresentation;

public class Pineapple extends ToppingDecorator {


    public Pineapple(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Pineapple";
    }

    @Override
    public double getCost() {
        return super.getCost() + .25;
    }
}
