package immortuos.utils;

public class Merchant implements Survivor{

    private String type = "merchant";

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
