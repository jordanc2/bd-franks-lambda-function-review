package appdata;

import java.util.Objects;

public class YodaData {

    private int number;

    private String planet;

    // Java needs default constructor, Lambda will give JSON parsing error
    // the conversion to & from JSON needs it
    public YodaData() {}

    public YodaData(int number, String planet) {
        this.number = number;
        this.planet = planet;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YodaData yodaData = (YodaData) o;
        return number == yodaData.number && Objects.equals(planet, yodaData.planet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, planet);
    }

    @Override
    public String toString() {
        return "YodaData{" +
                "number=" + number +
                ", planet='" + planet + '\'' +
                '}';
    }
}
