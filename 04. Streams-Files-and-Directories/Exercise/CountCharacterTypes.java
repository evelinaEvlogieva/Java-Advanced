import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {
        String basePath = "C:\\Users\\User\\Desktop\\задачи - Advanced\\advanced\\Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources";

        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\output.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(new File(inputPath)));
             PrintWriter writer = new PrintWriter(new FileWriter(outPath))) {

            String line = reader.readLine();
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;

            String vowelTable = "aeiou";
            String punctTable = "!,.?";

            while (line != null) {

                for (char c : line.toCharArray()) {
                    if (vowelTable.contains(c + "")) {
                        vowels++;
                    } else if (punctTable.contains(c + "")) {
                        punctuation++;
                    } else {
                        if (c != ' '){
                            consonants++;
                        }
                    }

                }


                line = reader.readLine();
            }

            writer.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d", vowels, consonants, punctuation);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
