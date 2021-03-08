package RawData;

import java.util.List;

public class Tire {
    private List<Double> pressures;
    private List<Integer> ages;


    public Tire(List<Double> pressures, List<Integer> ages){
        this.pressures = pressures;
        this.ages = ages;

    }


    public boolean isUnderOne (){
        for (Double pressure : this.pressures) {
            if (pressure < 1){
                return true;
            }
        }
        return false;
    }
}
