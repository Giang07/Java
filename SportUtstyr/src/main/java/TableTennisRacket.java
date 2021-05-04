public class TableTennisRacket extends SportEquipments{
    private boolean newPad;

    public TableTennisRacket(String name, int id, String plass, boolean replace, boolean newPad) {
        super(name, id, plass, replace);
        this.newPad = newPad;
    }

    public boolean getNewPad() {
        return newPad;
    }

    public void printRacketsState() {
        System.out.println("Name: " + getName() + "\n ID: " + getId() + "\n Place: " + getPlass() +
                "\n Replace: " + getReplace() +
                "\n Newpad:" + getNewPad() + "\n");
    }
}
