package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 520, "white"));
        cars.add(new Car("Mercedes-Benz", 220, "red"));
        cars.add(new Car("Nissan", 350, "silver"));
        cars.add(new Car("Lexus", 300, "grey"));
        cars.add(new Car("Honda", 777, "blue"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count <= 0 || count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).toList();
        }
    }
}
