import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Exe3Test {
    @Test
    public void TestPrintBallsNeedingMoreAir() throws FileNotFoundException {
        ArrayList<Integer> IDs = Exe3.printBallsNeedingMoreAir();
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(12, 15, 14, 2, 3, 5, 6, 21, 33));
        Assert.assertArrayEquals(IDs.toArray(), expected.toArray() );
    }

    @Test
    public void TestPrintEquipMentNeedingToBeReplaced() throws FileNotFoundException {
        ArrayList<Integer> IDs = Exe3.printEquipmentNeedingToBeReplaced();
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(15, 14, 34, 17));
        Assert.assertArrayEquals(IDs.toArray(), expected.toArray() );
    }

    @Test
    public void TestRacketsNeedingNewPad() throws FileNotFoundException {
        ArrayList<Integer> IDs = Exe3.printTableTennisRacketsNeedingNewPad();
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(18));
        Assert.assertArrayEquals(IDs.toArray(), expected.toArray() );
    }
}
