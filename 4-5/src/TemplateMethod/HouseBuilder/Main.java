package TemplateMethod.HouseBuilder;

public class Main {
    public static void main(String[] args) {
        House house = new StandardBuilder().buildHouse();
        for (String element: house.getHouseParts()) {
            System.out.println(element);
        }
    }
}
