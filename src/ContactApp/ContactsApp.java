package ContactApp;

import ContactApp.Contact;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class ContactsApp {

    public static void main(String[] args) {
        String directory = "data";
        String filename = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                System.out.println("Problem creating the directory");
                e.printStackTrace();

            }
        }

            if (! Files.exists(dataFile)) {
                try {
                    Files.createFile(dataFile);
                } catch (IOException e) {
                    System.out.println("Problem creating the file");
                    e.printStackTrace();
                }


            }




        Contact rick = new Contact("Rick", "Sanchez", "1234567891");
//        rick.firstName = "Rick";
//        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
//         prints "Hello from Rick Sanchez!"

//        String directory = "data";
//        String filename = "contacts.txt";
//            ArrayList<String> contactList = new ArrayList<>();
            List<String> contactList = new ArrayList<>();
//        Employee[] obj = new Employee[2] ;
        Contact [] obj = new Contact[2];

//        obj[0] = new Employee(100,"ABC");
        obj[0] = new Contact("Sam","Houston","4566789032");
        obj[0] = new Contact("Emily", "Bowersox", "5555555");


            contactList.add("Ramon");
            contactList.add("Emily");
            contactList.add(obj[0].contactInfo());
//        Student justin = new Student("Justin R");


            System.out.println(contactList);




//        Scanner userInput = new Scanner(System.in);
        Input input   = new Input();
//        userContactApp();

        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5): ");
        int numberSelection = input.getInt(1, 5);

//        If user types 1 use this method.
//        readFile(dataFile, true);


        if (numberSelection == 1) {
            System.out.println("\n");
                readFile(dataFile, true);
                System.out.println("\n");
        } else if (numberSelection == 2) {
            System.out.println("What is the first name of the contact you want to add?");
            String firstNameInput = input.getString();
            System.out.println("What is the last name of the contact you want to add?");
            String lastNameInput = input.getString();
            System.out.println("What is the new contact's phone number?");
            String phoneNumberInput = input.getString();
            obj[0] = new Contact(firstNameInput, lastNameInput, phoneNumberInput);
            contactList.add(obj[0].contactInfo());
            writeFile(dataFile, contactList);
        }
//        switch (userInput)
//        {
//            case 1:
////    case 1: //View all movies
//                System.out.println("\n");
//                readFile(dataFile, true);
//                System.out.println("\n");
//                break;
//        }

//    If user types 2 use this method.
        writeFile(dataFile, contactList);


    }

    public static void writeFile(Path aFile, List<String> aList){
        try {
            Files.write(aFile, aList);
//            Files.write(aFile, aList, StandardOpenOption.APPEND);
        } catch (IOException e){
            System.out.println("Problems writing in the file");
            e.printStackTrace();
        }
    }

    public static List<String> readFile(Path aFile, boolean print){
        List<String> lines;
        try{
            lines = Files.readAllLines(aFile);
            if(print == true){
                for (String line: lines) {
                    System.out.println("lines = " + line);
                }
                return null;
            }
            return lines;
        } catch (IOException e){
            System.out.println("Problems reading the file");
            e.printStackTrace();
            return null;
        }
    }



    public static void userContactApp(Scanner userInput) {
        System.out.println("Do you want to use our contact database (y/n)?");
        String userInputStart = userInput.next().toLowerCase();
        if (userInputStart.equals("y")) {
            System.out.println("Oh good!");
        } else {
            System.exit(0); //
        }
    }




}

