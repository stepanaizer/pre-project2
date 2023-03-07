package web.services;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(Integer count) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW",520,"white"));
        cars.add(new Car("Mercedes-Benz",220,"red"));
        cars.add(new Car("Nissan",350,"silver"));
        cars.add(new Car("Lexus",300,"grey"));
        cars.add(new Car("Honda",777,"blue"));

        if(count == null || count <= 0 || count >= 5){
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
