package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerCars {

    @GetMapping("/cars")
    public String getCars(@RequestParam(required = false) Integer count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Model1", 2000, 10000));
        cars.add(new Car("Model2", 2005, 15000));
        cars.add(new Car("Model3", 2010, 20000));
        cars.add(new Car("Model4", 2015, 25000));
        cars.add(new Car("Model5", 2020, 30000));

        if (count != null && count >= 1 && count < cars.size()) {
            cars = cars.subList(0, count);
        }

        model.addAttribute("cars", cars);
        return "cars";
    }

}
