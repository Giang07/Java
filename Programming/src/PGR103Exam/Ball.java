package PGR103Exam;

public class Ball extends Equipment{
    private boolean needMoreAir;
    private Type type;

    public Ball(String name, int id, String plass, boolean replace, Type type, boolean needMoreAir) {
        super(name, id, plass, replace);
        this.type = type;
        this.needMoreAir = needMoreAir;
    }
}
