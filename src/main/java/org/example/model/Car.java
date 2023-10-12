package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@AllArgsConstructor
@Data
public class Car {

    private Producer producer;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    ArrayList<Dimension> dimensions;

    public static void searchCountry(ArrayList<Car> cars) {
        for (Car car : cars) {
            if (car.producer.getModel().equalsIgnoreCase("BMW") &&
                    car.isAutomaticGear &&
                    car.hasLargeTrunkCapacity(car.getDimensions())) {
                for (Country country : car.market.getCountries()) {
                    System.out.println(country.getCountryName() + " - " + country.getCountrySign());
                }
            }
        }
    }

    public boolean hasLargeTrunkCapacity(ArrayList<Dimension> dimensions) {
        for (Dimension dimension : dimensions) {
            if (dimension.getTankCapacity() > 300) {
                return true;
            }
        }
        return false;
    }
}

