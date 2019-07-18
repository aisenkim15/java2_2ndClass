package java2_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveExample2 {
    public static void main(String... args) throws IOException {
        Path sourcePath = Paths.get("usnumbers.txt");
        Path destinationPath = Paths.get("/home/aisen/Downloads/usnumbers.txt");

        Path path = Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("File moved to" + path);
        System.out.println("File moved exits: " + Files.exists(path));
        System.out.println("File to move exits: " + Files.exists((sourcePath)));
        System.out.println(path.getClass().getName());
    }
}
