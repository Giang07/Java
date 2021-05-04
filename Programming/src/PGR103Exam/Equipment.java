package PGR103Exam;

public abstract class Equipment {
    private String name;
    private int id;
    private String plass;

    private boolean replace;

    public Equipment(String name, int id, String plass, boolean replace) {
        this.name = name;
        this.id = id;
        this.name = name;
        this.plass = plass;
        this.replace = replace;
    }
}
