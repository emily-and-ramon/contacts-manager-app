package ContactApp;

import java.util.Scanner;

    public class Input {

//    Create a class named ContactApp.Input that has a private property named scanner.

        //    Creating fields.
        private Scanner scanner = new Scanner(System.in);


//    Constructor



//    The plan template.

        //    The class should have the following methods, all of which return command
//    line input from the user:
//    String getString()
        public String getString() {
            System.out.println("Please enter something.");
            String getStringInput = scanner.nextLine();
            return getStringInput;
        }

        //    boolean yesNo(). The yesNo method should return true if the user enters y,
//    yes, or variants thereof, and false otherwise.
        public boolean yesNo() {
            System.out.println("Please enter either y/n");
            String yesNoInput = scanner.nextLine();
            if (yesNoInput.equals("y")) {
                return true;
            }
            return false;
        }

        //    int getInt(int min, int max). The getInt(int min, int max) method should keep
//    prompting the user for input until they give an integer within the min and max.
        public int getInt(int min, int max) {
            System.out.println("Please enter a number between " + min + " and " + max + ".");
            int getIntMinMaxInput = Integer.parseInt(scanner.nextLine());
            if (getIntMinMaxInput < min || getIntMinMaxInput > max) {
                System.out.println("You entered an invalid integer. Please try again.");
                return getInt(min, max);
            } else {
                System.out.println("You entered a valid integer.");
            }
            return getIntMinMaxInput;
        }

        //    int getInt()
        public int getInt() {
            System.out.println("Please enter an integer.");
            int getIntInput = Integer.parseInt(scanner.nextLine());
            return getIntInput;
        }

        //    double getDouble(double min, double max). The getDouble method should do the same
//    thing, but with decimal numbers.
        double getDouble(double min, double max){
            System.out.println("Please enter a decimal between " + min + " and " + max);
            double getDoubleMinMaxInput = Double.parseDouble(scanner.nextLine());
            if (getDoubleMinMaxInput < min || getDoubleMinMaxInput > max) {
                System.out.println("You entered an invalid decimal. Please try again.");
                return getDouble(min, max);
            } else {
                System.out.println("You entered a valid decimal");
            }
            return getDoubleMinMaxInput;
        }

        //    double getDouble()
        double getDouble() {
            System.out.println("Please enter a decimal.");
            double getDoubleInput = Double.parseDouble(scanner.nextLine());
            return getDoubleInput;
        }



    }

