package PGR103Exam;

public class TableTennisRacket extends Equipment{
    private boolean newPad;

    public TableTennisRacket(String name, int id, String plass, boolean replace, boolean newPad) {
        super(name, id, plass, replace);
        this.newPad = newPad;
    }

}
