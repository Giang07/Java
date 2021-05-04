package PGR103Exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Exe1 {
    File file = new File("equipment.txt");

    //Scanner fileReader = null;

    //ArrayList<Ball> balls = new ArrayList<>();

    try {
        Scanner fileReader = new Scanner(file);

        int ID = 0;
        while (fileReader.hasNextLine()) {

            String name = fileReader.nextLine();

            if (name.equalsIgnoreCase("Ball"))

                int id = fileReader.nextInt();
                String plass = fileReader.nextLine();
                boolean replace = fileReader.nextBoolean();
                String type = fileReader.nextLine();
                boolean  needMoreAir = fileReader.nextBoolean();
        }
        fileReader.close();
    } catch (FileNotFoundException e)

    {
        e.printStackTrace();
    }
}

