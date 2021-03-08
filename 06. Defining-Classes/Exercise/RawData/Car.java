package RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire tires;

    public Car(String model, Engine engine, Cargo cargo, Tire tires){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getModel(){
        return this.model;
    }


    public String getCarCargoType (){
        return cargo.getCargoType();
    }

    public int getCarEnginePower(){
        return engine.getPower();
    }

    public boolean checkPressure (){
        if (this.tires.isUnderOne()){
            return true;
        }
        return false;
    }
}
