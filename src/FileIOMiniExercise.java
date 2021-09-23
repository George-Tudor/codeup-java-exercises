import java.io.IOException;
import java.nio.file.*;

public class FileIOMiniExercise {

    public static void main(String[] args) {
        Path pathToTestDir = Paths.get("src/test");
        try {
            if(Files.notExists(pathToTestDir)) {
                Files.createDirectories(pathToTestDir);
            } else {
                System.out.println("The " + pathToTestDir + " directory already exists!");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
