package Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Pokemon> pokemons;
    private List<Parents> parents;
    private List<Children> children;

    public Person(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void add(Parents parent) {
        this.parents.add(parent);
    }

    public void add(Children child) {
        this.children.add(child);
    }

    public void add(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(this.name).append(System.lineSeparator());
        output.append("Google.Company:").append(System.lineSeparator());
        if (this.company != null) {
            output.append(this.company).append(System.lineSeparator());
        }
        output.append("Google.Car:").append(System.lineSeparator());
        if (this.car != null) {
            output.append(this.car).append(System.lineSeparator());
        }
        output.append("Google.PokemonTrainer.Pokemon:").append(System.lineSeparator());
        this.pokemons.forEach(pokemon -> output.append(pokemon).append(System.lineSeparator()));
        output.append("Google.Parents:").append(System.lineSeparator());
        this.parents.forEach(parent -> output.append(parent).append(System.lineSeparator()));
        output.append("Google.Children:").append(System.lineSeparator());
        this.children.forEach(child -> output.append(child).append(System.lineSeparator()));
        return output.toString();
    }
}