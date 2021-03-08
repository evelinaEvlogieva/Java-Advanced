package SumOfCoins;

// Judge  не го приема като част от пакет!!!

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] elements = in.nextLine().substring(7).split(", ");
        int[] coins = new int[elements.length];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(elements[i]);
        }

        int targetSum = Integer.parseInt(in.nextLine().substring(5));


        Map<Integer, Integer> usedCoins = chooseCoins(coins, targetSum);

        for (Map.Entry<Integer, Integer> usedCoin : usedCoins.entrySet()) {
            System.out.println(usedCoin.getKey() + " -> " + usedCoin.getValue());
        }
    }

    public static Map<Integer, Integer> chooseCoins(int[] coins, int targetSum) {
        int index = coins.length - 1;
        int currentSum = 0;

        Map<Integer, Integer> chosenCoins = new LinkedHashMap<>();

        while (currentSum != targetSum && index >= 0){

            int remainingSum = targetSum - currentSum;
            int coinsToTake = remainingSum / coins[index];

            if (coinsToTake != 0){
                chosenCoins.put(coins[index], coinsToTake);
                currentSum += coinsToTake * coins[index];

            }
            index--;
        }
        return chosenCoins;
    }
}