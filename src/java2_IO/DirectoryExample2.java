package java2_IO;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExample2 {
    public static void main(String[] args) throws Exception{
        Path path1 = Paths.get("C:/rtemp/subdir");
        Path path2 = Paths.get("C:/rtemp/java.txt");

        if (Files.notExists(path1)) {
            Files.createDirectories(path1);
        }
        if (Files.notExists(path2)) {
            Files.createFile(path2);
        }

        Path path3 = Paths.get("C:/rtemp/");
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path3);
        for (Path path : directoryStream) {
            if (Files.isDirectory(path)) {
                System.out.println("디렉토리: " + path.getFileName());
            } else {
                System.out.println("파일: " + path.getFileName() + "(크기: " + Files.size(path) + ")");
            }
        }
    }
}
