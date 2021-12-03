package passwordGenerator;

import java.util.Arrays;
import java.util.Iterator;

public class PasswordGenerator {


    public static void main(String[] args) {


        //checking options: passwordGenerator 4 f
        int numberOfPasswordsWanted = 1;
        int passLength = 15;
        boolean wantsFile = false;


        if (args.length == 3) {
            try {
                numberOfPasswordsWanted = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Number of passwords not recognized.");
                //e.printStackTrace();
            }
            try {
                passLength = Integer.parseInt(args[1]);
            } catch (NumberFormatException e){
                System.out.println("Desired password length not recognized.");
                //e.printStackTrace();
            }

            if (args[2].equals("f")) {
                wantsFile = true;
            }
        }

        System.out.println("Generating " + numberOfPasswordsWanted + " password(s)");
        System.out.println("saving them to a file:" + wantsFile);
        System.out.println("Length " + passLength);
        //warn at to short pws
        //generationg PWs
        //show extimation of no. of bits
        //output


    }
}