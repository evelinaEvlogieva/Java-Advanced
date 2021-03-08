import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

        Path inPath = Paths.get("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path outPath = Paths.get("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt");

        List<String> inputLines = Files.readAllLines(inPath)
                .stream()
                .filter(s -> !s.isEmpty())
                .sorted()
                .collect(Collectors.toList());

        Files.write(outPath, inputLines);
    }
}
