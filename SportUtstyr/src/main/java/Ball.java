public class Ball extends SportEquipments{
    private boolean needMoreAir;
    private String type;

    public Ball(String name, int id, String plass, boolean replace, String type, boolean needMoreAir) {
        super(name, id, plass, replace);
        this.type = type;
        this.needMoreAir = needMoreAir;
    }

    public boolean getNeedMoreAir() {
        return needMoreAir;
    }

    public String getType() {
        return type;
    }

    public void printBallsState() {
        System.out.println("Name: " + getName() + "\n ID: " + getId() + "\n Place: " + getPlass() +
                "\n Replace: " + getReplace() + "\n Type: " + getType() +
                "\n NeedMoreAir:" + getNeedMoreAir() + "\n");
    }
}
