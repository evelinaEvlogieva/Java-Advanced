package SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private int kmTravelled;

    public Car(String model, double fuelAmount, double fuelCost){
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.kmTravelled = 0;
    }


    public boolean checkDrivingCapability(int kmAmount) {
        double fuelNeeded = this.fuelCost * kmAmount;
        if (fuelNeeded <= this.fuelAmount){
            this.fuelAmount -= fuelNeeded;
            this.kmTravelled += kmAmount;
            return true;

        }

        return false;
    }

    @Override
    public String toString(){
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.kmTravelled);

    }
}
