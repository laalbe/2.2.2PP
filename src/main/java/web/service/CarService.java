package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private static final List<Car> carList;

    static  {
        carList = new ArrayList<>();
        carList.add(new Car("Lada", "white", 15));
        carList.add(new Car("Ford", "blue", 5));
        carList.add(new Car("Kia", "green", 7));
        carList.add(new Car("Honda", "pink", 8));
        carList.add(new Car("Mersedes", "green", 3));
    }

    public List<Car> getCars(int count) {
        return carList.stream().limit(count).toList();
    }
}
