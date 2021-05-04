public abstract class SportEquipments {
    private String name;
    private int id;
    private String plass;

    private boolean replace;

    public SportEquipments(String name, int id, String plass, boolean replace) {
        this.name = name;
        this.id = id;
        this.name = name;
        this.plass = plass;
        this.replace = replace;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPlass() {
        return plass;
    }

    public boolean getReplace() {
        return replace;
    }
}
