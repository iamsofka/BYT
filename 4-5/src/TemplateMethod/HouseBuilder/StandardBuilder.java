package TemplateMethod.HouseBuilder;

public class StandardBuilder extends HouseBuilder{
    @Override
    public void addWalls() {
        houseParts.add("white standard walls");
    }

    @Override
    public void putWindows() {
        houseParts.add("big windows");
    }

    @Override
    public void addHeatingSystem() {
        houseParts.add("60 sq meters system");
    }
}
