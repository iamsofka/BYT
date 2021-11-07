package TemplateMethod.HouseBuilder;

import java.util.ArrayList;

public class House {
    private ArrayList <String> houseParts;

    public House(ArrayList <String> parts){
        houseParts = parts;
    }

    public ArrayList<String> getHouseParts() {
        return houseParts;
    }
}

