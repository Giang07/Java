import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Exe3 {
    public static ArrayList<Integer> printBallsNeedingMoreAir() throws FileNotFoundException {

        ArrayList<Integer> IDs = new ArrayList<Integer>();

        ArrayList[] arrayLists = Exe1.readFile();
        ArrayList<Ball> balls =  arrayLists[0];

        for (Ball b : balls) {
            if (b.getNeedMoreAir()) {
                b.printBallsState();
                IDs.add(b.getId());
            }
        }

        return IDs;
    }

    public static ArrayList<Integer> printEquipmentNeedingToBeReplaced() throws FileNotFoundException{
        ArrayList<Integer> IDs = new ArrayList<>();


        ArrayList[] arrayLists = Exe1.readFile();
        ArrayList<Ball> balls =  arrayLists[0];
        ArrayList<TableTennisRacket> rackets =  arrayLists[1];

        for (Ball b : balls) {
            if (b.getReplace()) {
                b.printBallsState();
                IDs.add(b.getId());
            }
        }

        for (TableTennisRacket r : rackets) {
            if (r.getReplace()) {
                r.printRacketsState();
                IDs.add(r.getId());
            }
        }
        return IDs;

    }

    public static ArrayList<Integer> printTableTennisRacketsNeedingNewPad() throws FileNotFoundException{
        ArrayList<Integer> IDs = new ArrayList<Integer>();

        ArrayList[] arrayLists = Exe1.readFile();
        ArrayList<TableTennisRacket> rackets =  arrayLists[1];

        for (TableTennisRacket r : rackets) {
            if (r.getNewPad()) {
                r.printRacketsState();
                IDs.add(r.getId());
            }
        }
        return IDs;
    }


}
