package solid_examples.isp.good;

public class Duck implements  FeatheredCreature {
    private String currentLocation;
    private Integer numberOfFeathers;

    public Duck(String currentLocation, Integer numberOfFeathers) {
        this.currentLocation = currentLocation;
        this.numberOfFeathers = numberOfFeathers;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Integer getNumberOfFeathers() {
        return numberOfFeathers;
    }

    public void setNumberOfFeathers(Integer numberOfFeathers) {
        this.numberOfFeathers = numberOfFeathers;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }
}
