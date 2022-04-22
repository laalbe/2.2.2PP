package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private CarService carService = new CarService();

    @GetMapping (value = "/cars")
    public String printTableCars(ModelMap model,
                                 @RequestParam (defaultValue = "5") int count) {
        model.addAttribute("cars", carService.getCarList(count));
        return "cars";
    }
}