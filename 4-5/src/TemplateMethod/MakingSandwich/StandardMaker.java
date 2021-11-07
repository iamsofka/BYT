package TemplateMethod.MakingSandwich;

import java.util.ArrayList;

public abstract class StandardMaker {
    protected ArrayList<String> products;

    public StandardMaker(){
        products = new ArrayList<>();
    }

    public final Sandwich makeSandwich() {
        fryBread();
        addHam();
        addCorn();
        addCheese();
        return new Sandwich(products);
    }

    public abstract void fryBread();
    public abstract void addHam();
    public abstract void addCorn();
    public abstract void addCheese();
}
