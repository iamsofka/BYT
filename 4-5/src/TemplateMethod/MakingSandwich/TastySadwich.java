package TemplateMethod.MakingSandwich;

public class TastySadwich extends StandardMaker{
    @Override
    public void fryBread() {
        products.add("Bread is fried");
    }

    @Override
    public void addHam() {
        products.add("2 slices of ham are added");
    }

    @Override
    public void addCorn() {
        products.add("25 grams of corn is added");
    }

    @Override
    public void addCheese() {
        products.add("3 slices of cheese are added");
    }
}
