package trinn4e;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public void runProgram() {
        System.out.println("Choose oppgave: ");
        //oppgave4();
        //oppgave6();
        oppgave7();
    }

    public void oppgave4() {
        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter three words: ");
        list.add(input.next());
        list.add(input.next());
        list.add(input.next());

        System.out.println("You entered these words: ");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void oppgave6() {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Write some numbers. End with negative.");
        int number = 0;
        while (number >= 0) {
            number = input.nextInt();
            if (number >= 0) {
                numbers.add(number);
            }
        }

        int sum = 0;
        for (int k : numbers) {
            sum += k;
        }

        System.out.println("Sum: " + sum);
    }
/*
    public void oppgave7(){
        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        int choice = 0;
        while (choice != 3) {
            System.out.println("1: Add single word. ");
            System.out.println("2: Display all words. ");
            System.out.println("3: End. ");

            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Write words:  ");
                list.add(input.next());
                list.add(input.next());
            } else if (choice == 2) {
                System.out.println("Here are all the words: ");
                for (String s : list) {
                    System.out.println(s);
                }
            } else {
                System.out.println("End. ");
            }
        }
    }

 */
public void oppgave7(){
    int choice = 0;
    Scanner input = new Scanner(System.in);
    ArrayList<String> strings = new ArrayList<>();
    while(choice!=3){
        System.out.println("1. Add single word");
        System.out.println("2. Display all words");
        System.out.println("3. End");
        choice = input.nextInt();
        if(choice == 1){
            System.out.println("Write word:");
            strings.add(input.nextLine());
            strings.add(input.nextLine());
            strings.add(input.nextLine());
        } else if(choice == 2){
            System.out.println("Here are all the words:");
            for (String s :
                    strings) {
                System.out.println(s);
            }
        } else{
            System.out.println("Bye!");
        }
    }
}


    public static void main(String[] args) {
        new Program().runProgram();
    }
}
