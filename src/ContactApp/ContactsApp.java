package ContactApp;

import ContactApp.Contact;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


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

        writeFile(dataFile, contactList);


        readFile(dataFile, true);


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

}

