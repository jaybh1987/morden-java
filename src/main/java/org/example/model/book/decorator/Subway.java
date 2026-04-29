package org.example.model.book.decorator;

public class Subway {

    static Sandwich getWithSaladAndCheese(Sandwich s) {
        return new SaladDecorator(new CheeseDecorator(s));
    }

    static Sandwich getWithSaladAndMeat(Sandwich s) {

        return new MeatDecorator(new SaladDecorator(s));
    }

    public static void main(String[] args) {

        Sandwich plain = new PlainSandwich();

        System.out.println(getWithSaladAndCheese(plain).getDescription());
    }
}

interface Sandwich {

    double getCost();

    String getDescription();

}

class PlainSandwich implements Sandwich {

    @Override
    public double getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Plain Sandwich";
    }
}

abstract class SandwichDecorator implements Sandwich {
    Sandwich sandwichDecorator;

    public SandwichDecorator(Sandwich sandwichDecorator) {
        this.sandwichDecorator = sandwichDecorator;
    }
}

class CheeseDecorator extends SandwichDecorator {

    public CheeseDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return sandwichDecorator.getDescription() + " Added Cheese ";
    }

    @Override
    public double getCost() {
        return sandwichDecorator.getCost() + 50;
    }
}

class SaladDecorator extends SandwichDecorator {

    public SaladDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return sandwichDecorator.getDescription() + "Added Salad";
    }

    @Override
    public double getCost() {
        return sandwichDecorator.getCost() + 20;
    }
}

class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return sandwichDecorator.getDescription() + "Added Meat";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
