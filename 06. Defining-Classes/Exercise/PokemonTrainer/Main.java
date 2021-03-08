package PokemonTrainer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!"Tournament".equals(input)){
            String[] data = input.split("\\s+");
            String trainerName = data[0];
            String name = data[1];
            String element = data[2];
            int health = Integer.parseInt(data[3]);

            Trainer trainer = new Trainer(trainerName);

            Pokemon pokemon = new Pokemon(name, element, health);

            trainers.putIfAbsent(trainerName, trainer);
            trainers.get(trainerName).addPokemon(pokemon);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!"End".equals(input)){
            String element = input;
            for (Trainer trainer : trainers.values()){
                if (trainer.hasElementType(element)){
                    trainer.incrementBadges(1);
                } else {
                    trainer.damagePokemons(10);
                }
            }

            input = scanner.nextLine();
        }

        trainers
                .entrySet()
                .stream()
                .sorted((f, s) -> s.getValue().getBadges() - f.getValue().getBadges())
                .forEach(entry -> {
                    System.out.println(entry.getValue().toString());
                });
    }

}
