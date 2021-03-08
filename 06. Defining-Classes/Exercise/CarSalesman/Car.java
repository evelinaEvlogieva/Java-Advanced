package CarSalesman;

public class Car {
    private String model;
    private String engine;
    //не са задължителни:
    private int weight;
    private String color;

    public Car (String model, String engine){
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }

    public Car (String model, String engine, int weight){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = "n/a";
    }

    public Car (String model, String engine, String color){
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = color;

    }

    public Car (String model, String engine, int weight, String color){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }


    public String getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
