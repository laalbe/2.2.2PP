package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> carList = new ArrayList<>();

    public CarService() {
        carList.add(new Car("Lada", "white", 15));
        carList.add(new Car("Ford", "blue", 5));
        carList.add(new Car("Kia", "green", 7));
        carList.add(new Car("Honda", "pink", 8));
        carList.add(new Car("Mersedes", "green", 3));
    }

    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).toList();
    }
}
