import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exe1 {

    public static ArrayList[] readFile() throws FileNotFoundException {

        File file = new File("equipment.txt");

        ArrayList<Ball> balls = new ArrayList<>();
        ArrayList<TableTennisRacket> rackets = new ArrayList<>();

        try {
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {

                String name = fileReader.nextLine();

                if (name.equalsIgnoreCase("Ball")) {
                    int ID = Integer.parseInt(fileReader.nextLine());
                    String plass = fileReader.nextLine();
                    boolean replace = Boolean.parseBoolean(fileReader.nextLine());
                    String type = fileReader.nextLine();
                    boolean needMoreAir = Boolean.parseBoolean(fileReader.nextLine());

                    balls.add(new Ball(name, ID, plass, replace, type, needMoreAir));
                }

                if (name.equalsIgnoreCase("TableTennisRacket")) {
                    int ID = Integer.parseInt(fileReader.nextLine());
                    String plass = fileReader.nextLine();
                    boolean replace = Boolean.parseBoolean(fileReader.nextLine());
                    boolean needMoreAir = Boolean.parseBoolean(fileReader.nextLine());

                    rackets.add(new TableTennisRacket(name, ID, plass, replace, needMoreAir));
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return new ArrayList[] {balls, rackets};
    }




}
