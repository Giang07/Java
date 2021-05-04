package trinn5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public void exe4() {
        File myObj = new File("/Users/thihonggiangpham/IdeaProjects/Programming/opg4.txt");
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public void exe5() {
        try {
            FileWriter fw = new FileWriter("opg5.txt");

            for (int i = 0; i < 5; i++) {
                fw.write("something \n");
            }

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Artist> exe7() {
        File myObj = new File("opg7.txt");
        Scanner myReader = null;

        ArrayList<Artist> artists = new ArrayList<Artist>();
        try {
            myReader = new Scanner(myObj);
            int count = 0;

            String name = "";
            LocalDate localDate = null;
            String city = "";
            String country = "";

            while (myReader.hasNextLine()) {
                count += 1;

                String s = myReader.nextLine();

                if (count % 5 == 1) {
                    name = s;
                } else if (count % 5 == 2) {
                    localDate = LocalDate.parse(s);
                } else if (count % 5 == 3) {
                    city = s;
                } else if (count % 5 == 4) {
                    country = s;
                } else {
                    Artist artist = new Artist(name, localDate, city, country);
                    artists.add(artist);
                }
                //System.out.println(data);
            }

            myReader.close();

            for (Artist a : artists) {
                a.printState();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return artists;

    }

    public void exe8() {
        ArrayList<Artist> artists = exe7();

        //artists.get(1).setArtistName("Han");

        try {
            FileWriter fw = new FileWriter("opg8.txt");

            for (Artist a : artists) {
                fw.write(a.printState() + "\n");
            }

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void extraCreateFile() {

        ArrayList<Artist> artists = exe7();
        //artists.add();

        try {
            FileWriter fw = new FileWriter("extra.txt");

            for (int i = 0; i < artists.size(); i ++) {
                fw.write(i+1 + "\n");
                fw.write(artists.get(i).getArtistName() + "\n" );
                fw.write(artists.get(i).getDateOfBirth() + "\n");
                fw.write(artists.get(i).getCity() + "\n");
                fw.write(artists.get(i).getCountry() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Artist1> extra() {
        File myObj = new File("extra.txt");
        Scanner myReader = null;

        ArrayList<Artist1> artists = new ArrayList<>();

        try {
            myReader = new Scanner(myObj);
            int count = 0;

            int ID = 0;
            String name = "";
            LocalDate localDate = null;
            String city = "";
            String country = "";

            while (myReader.hasNextLine()) {
                count += 1;

                String s = myReader.nextLine();
                if (count % 5 == 0) {
                    ID = count;
                } else if (count % 5 == 1) {
                    name = s;
                } else if (count % 5 == 2) {
                    localDate = LocalDate.parse(s);
                } else if (count % 5 == 3) {
                    city = s;
                } else if (count % 5 == 4) {
                    country = s;
                } else {
                    Artist1 artist = new Artist1(ID, name, localDate, city, country);
                    artists.add(artist);
                }

                //System.out.println(data);
            }

            myReader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return artists;
    }

    public void printUserMeny() {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1: Get Information ");
        System.out.println("2: Based on ID");
        System.out.println("3: Add new");
        System.out.println("4: Change");
        System.out.println("5: Exit");

        ArrayList<Artist1>  artist1s = extra();

        int k = input.nextInt();

        if ( k == 1  ) {
            System.out.println("Print information of Artists:");
            for (Artist1 a : artist1s) {
                a.printState();
            }
        }

        if ( k == 2) {
            System.out.println("Enter ID: ");
            Scanner ID = new Scanner(System.in);

            try {
                artist1s.get(ID.nextInt() -1).printState();
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        if ( k == 3) {
            System.out.println("Add a new Artist: ");

            Scanner name = new Scanner(System.in);
            Scanner date = new Scanner(System.in);
            Scanner city = new Scanner(System.in);
            Scanner country = new Scanner(System.in);

            artist1s.add(new Artist1(artist1s.size()+1, name.nextLine(), LocalDate.parse(date.nextLine()), city.nextLine(), country.nextLine()));
        }

        if (k == 4) {
            System.out.println("Change by ID: ");
            Scanner ID = new Scanner(System.in);

            Artist1 a = artist1s.get(ID.nextInt() -1 );

            System.out.println("Pls enter name, or city, or country, or date");
            Scanner name =  new Scanner(System.in);
            String s = name.nextLine();

            if (s.equalsIgnoreCase("name")) {
                System.out.println("New name:");
                Scanner n = new Scanner(System.in);
                a.setArtistName(n.nextLine());
            }



        }
    }

    public static void main (String[]args){
    /*
    String s0 = args[0];
    int x = Integer.parseInt(args[2]);

     */

        //new Program().exe4();
        //new Program().exe5();
        //new Program().exe7();
        //new Program().exe8();
        new Program().extraCreateFile();


        //System.out.println(s0);
    }
}


