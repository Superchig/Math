package main;

import generic.Factors;

import java.util.Scanner;

/**
 * Created by Chiggie on 4/1/2015.
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean keepUsing = true;

        do {
            System.out.println("Welcome to Christopher and Jack's math thing, of sorts! \n");

            System.out.println("1. Find the greatest common factor.");
            System.out.println("2. Quit.");

            System.out.print("Input option> ");

            String choice = sc.nextLine();

            switch(choice) {

                case "1":
                    System.out.println("Input the first integer.");
                    String GCF1String = sc.nextLine();
                    System.out.println("Input the second integer.");
                    String GCF2String = sc.nextLine();

                    int GCF1 = stringToInt(GCF1String);
                    int GCF2 = stringToInt(GCF2String);

                    System.out.println("The GCF is: " + Factors.getGCF(GCF1, GCF2));
                    break;
                case "2":
                    System.out.println("Quitting...");
                    keepUsing = false;
            }

        } while (keepUsing);

    }

    public static int stringToInt(String input) {

        try {

            Integer transInteger = new Integer(input);
            int output = transInteger.intValue();
            return output;

        } catch (Exception e) {

            System.out.println("D'oh! That isn't an integer.");
            return -1;

        }


    }

}
