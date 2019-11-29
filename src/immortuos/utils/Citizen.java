package immortuos.utils;

public class Citizen implements Survivor {

    private String type = "citizen";

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
