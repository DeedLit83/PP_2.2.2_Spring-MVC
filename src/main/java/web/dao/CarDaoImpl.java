package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Toyota LC Prado 120", "green", "X220PE22RUS"));
        carList.add(new Car("Toyota LC 300", "white", "X221PE22RUS"));
        carList.add(new Car("Toyota LC 200", "black", "X222PE22RUS"));
        carList.add(new Car("Toyota LC Prado 150", "purple", "X223PE22RUS"));
        carList.add(new Car("Toyota LC Prado", "indigo", "X224PE22RUS"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}