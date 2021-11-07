package TemplateMethod.HouseBuilder;

import java.util.ArrayList;

public abstract class HouseBuilder {

        protected ArrayList<String> houseParts;

        public HouseBuilder(){
            houseParts = new ArrayList<>();
        }

        public final House buildHouse() {
            addWalls();
            putWindows();
            addHeatingSystem();
            return new House(houseParts);
        }

        public abstract void addWalls();
        public abstract void putWindows();
        public abstract void addHeatingSystem();

}
