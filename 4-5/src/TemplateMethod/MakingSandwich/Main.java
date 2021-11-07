package TemplateMethod.MakingSandwich;

public class Main {
    public static void main(String[] args) {
        Sandwich sandwich = new TastySadwich().makeSandwich();
        for (String element:sandwich.getProducts()) {
            System.out.println(element);
        }
    }
}
