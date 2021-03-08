import java.util.*;

public class Voina_Numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayer = getPlayersCards(scanner.nextLine());
        Set<Integer> secondPlayer = getPlayersCards(scanner.nextLine());

        for (int round = 0; round < 50; round++) {
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()){
                break;
            }

            Iterator<Integer> firstPlayerIterator = firstPlayer.iterator();
            Iterator<Integer> secondPlayerIterator = secondPlayer.iterator();

            int firstPlayerCard = firstPlayerIterator.next();
            firstPlayer.remove(firstPlayerCard);

            int secondPlayerCard = secondPlayerIterator.next();
            secondPlayer.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard){
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
            } else if (firstPlayerCard < secondPlayerCard){
                secondPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            } else {
                firstPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            }

        }

        if (firstPlayer.size() > secondPlayer.size()){
            System.out.println("First player win!");
        } else if (firstPlayer.size() < secondPlayer.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }

    static LinkedHashSet<Integer> getPlayersCards(String line) {
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        Arrays.stream(line.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(result::add);

        return result;
    }
}
