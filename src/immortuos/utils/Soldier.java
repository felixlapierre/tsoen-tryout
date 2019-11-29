package immortuos.utils;

public class Soldier implements Survivor {

    private String type = "soldier";

    @Override
    public void notify(Event event) {

    }

    @Override
    public Point getLocation() {
        return null;
    }

    @Override
    public String getType() {
        return type;
    }
}
