
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

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
    }
}

