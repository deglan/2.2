package org.example;

import org.example.model.Car;
import org.example.model.Country;
import org.example.model.Dimension;
import org.example.model.Market;
import org.example.model.Producer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Country poland = new Country("Polska", 'P');
        Country germany = new Country("Niemcy", 'D');
        Country china = new Country("Chiny", 'C');
        Country netherlands = new Country("Holandia", 'N');
        Country korea = new Country("Korea", 'K');

        Market businessMarket = new Market("business", List.of(poland, germany));
        Market cargoMarket = new Market("cargo", List.of(china, netherlands));
        Market transportMarket = new Market("transport", List.of(germany, china, netherlands));
        Market taxiMarket = new Market("taxi", List.of(poland, korea));
        Market busMarket = new Market("bus", List.of(poland, germany, korea));

        Dimension dim1 = new Dimension(175, 65, 355);
        Dimension dim2 = new Dimension(180, 70, 500);
        Dimension dim3 = new Dimension(160, 75, 350);
        Dimension dim4 = new Dimension(190, 80, 950);
        Dimension dim5 = new Dimension(170, 68, 500);
        Dimension dim6 = new Dimension(185, 72, 852);
        Dimension dim7 = new Dimension(195, 78, 421);
        Dimension dim8 = new Dimension(165, 62, 420);
        Dimension dim9 = new Dimension(200, 85, 465);
        Dimension dim10 = new Dimension(175, 70, 355);

        ArrayList<Dimension> dimensions1 = new ArrayList<>();
        dimensions1.add(dim1);
        dimensions1.add(dim2);
        ArrayList<Dimension> dimensions2 = new ArrayList<>();
        dimensions2.add(dim3);
        dimensions2.add(dim4);
        ArrayList<Dimension> dimensions3 = new ArrayList<>();
        dimensions3.add(dim5);
        dimensions3.add(dim6);
        ArrayList<Dimension> dimensions4 = new ArrayList<>();
        dimensions4.add(dim7);
        dimensions4.add(dim8);
        ArrayList<Dimension> dimensions5 = new ArrayList<>();
        dimensions5.add(dim9);
        dimensions5.add(dim10);


        Producer producer1 = new Producer("Toyota", "Corolla");
        Producer producer2 = new Producer("Honda", "Civic");
        Producer producer3 = new Producer("BMW", "IX2");
        Producer producer4 = new Producer("Volkswagen", "Golf");
        Producer producer5 = new Producer("BMW", "3 Series");
        Producer producer6 = new Producer("Audi", "A4");
        Producer producer7 = new Producer("Mercedes-Benz", "C-Class");
        Producer producer8 = new Producer("Hyundai", "Elantra");
        Producer producer9 = new Producer("BMW", "i4");
        Producer producer10 = new Producer("Nissan", "Altima");

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car(producer1, true, businessMarket, "Sedan", dimensions1));
        cars.add(new Car(producer2, false, cargoMarket, "Hatchback", dimensions2));
        cars.add(new Car(producer3, true, transportMarket, "SUV", dimensions3));
        cars.add(new Car(producer4, false, taxiMarket, "Sedan", dimensions4));
        cars.add(new Car(producer5, true, busMarket, "SUV", dimensions5));
        cars.add(new Car(producer6, true, businessMarket, "Sedan", dimensions1));
        cars.add(new Car(producer7, false, cargoMarket, "Hatchback", dimensions2));
        cars.add(new Car(producer8, true, transportMarket, "SUV", dimensions3));
        cars.add(new Car(producer9, false, taxiMarket, "Sedan", dimensions4));
        cars.add(new Car(producer10, true, busMarket, "SUV", dimensions5));
        cars.add(new Car(producer1, true, businessMarket, "Sedan", dimensions1));
        cars.add(new Car(producer2, false, cargoMarket, "Hatchback", dimensions2));
        cars.add(new Car(producer3, true, transportMarket, "SUV", dimensions3));
        cars.add(new Car(producer4, false, taxiMarket, "Sedan", dimensions4));
        cars.add(new Car(producer5, true, busMarket, "SUV", dimensions5));

        Car.searchCountry(cars);
    }
}