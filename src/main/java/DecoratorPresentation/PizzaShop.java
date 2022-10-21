package DecoratorPresentation;

import DecoratorPresentation.Pizza;

public class PizzaShop {
    public static void main(String[] args) {

        Pizza cheesePizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("INGREDIENTS===" + cheesePizza.getDescription());
        System.out.println("Price=== $" + cheesePizza.getCost());

        System.out.println("=========================");

        Pizza vegetablePizza = new TomatoSauce(new Spinach(new Pineapple(new Mozzarella(new PlainPizza()))));

        System.out.println("INGREDIENTS===" + vegetablePizza.getDescription());
        System.out.println("Price=== $" + vegetablePizza.getCost());







    }
}
