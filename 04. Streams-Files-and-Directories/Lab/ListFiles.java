import java.io.File;

public class ListFiles {
    public static void main(String[] args) {


        File f = new File("D:\\Files-and-Streams");
        File[] allFiles = f.listFiles();

        if (allFiles == null) return;

        for (File f1 : allFiles) {
            if (!f1.isDirectory()) {
                System.out.printf("%s: [%d]%n", f1.getName(), f1.length());

            }
        }

    }
}
