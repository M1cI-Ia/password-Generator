package passwordGenerator;

public class PasswordGenerator {
    private static int numberOfPasswordsWanted = 1;
    private static int passLength = 15;
    private static boolean wantsFile = false;

    public static void main(String[] args) {


        //checking options: passwordGenerator <numberOfPasswords> <desiredLength> <f=print them to a file>

        if (args.length == 0) {
            //TODO: continue with default settings
            System.out.println("Using default settings");
        } else if (args.length == 2) {
            getDesiredSettings(args);

        } else if (args.length == 3) {
            getDesiredSettings(args);

            if (args[2].equals("f")) {
                wantsFile = true;
            } else {
                printUsageInfo();
                System.exit(0);
            }
        } else {
            printUsageInfo();
            System.exit(0);
        }

        System.out.println("Generating " + numberOfPasswordsWanted + " password(s)");
        System.out.println("saving them to a file:" + wantsFile);
        System.out.println("Length " + passLength);
        //TODO:warn at to short pws

        //generationg PWs


        //show extimation of no. of bits
        //output


    }

    protected static void getDesiredSettings(String[] arr) {

        try {
            numberOfPasswordsWanted = Integer.parseInt(arr[0]);
            passLength = Integer.parseInt(arr[1]);
        } catch (NumberFormatException e) {
            System.out.println("number of passwords or desired length not recognized");
        }
    }

    protected static void printUsageInfo() {
        //TODO
        System.out.println("usage");
    }
}