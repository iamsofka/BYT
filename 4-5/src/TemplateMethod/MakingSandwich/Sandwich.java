package TemplateMethod.MakingSandwich;

import java.util.ArrayList;

public class Sandwich {
    private ArrayList<String> products;

    public Sandwich(ArrayList <String> sandwichProducts){
        products = sandwichProducts;
    }

    public ArrayList<String> getProducts() {
        return products;
    }
}
