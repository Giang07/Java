import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Exe1Test {
    @Test
    public void TestExe1 () {
        try {

            ArrayList[] arrayLists = Exe1.readFile();
            ArrayList<Ball> balls =  arrayLists[0];
            ArrayList<TableTennisRacket> rackets =  arrayLists[1];

            for (Ball b : balls) {
                b.printBallsState();
            }

            for (TableTennisRacket r : rackets) {
                r.printRacketsState();
            }

            System.out.println(rackets.size());

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
