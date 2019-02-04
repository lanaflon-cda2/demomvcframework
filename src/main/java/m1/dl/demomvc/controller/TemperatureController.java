package m1.dl.demomvc.controller;

import m1.dl.demomvc.domain.Temperature;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TemperatureController {

    @GetMapping("/convertisseur")
    protected String getCelciusTemperateurToBeConverted(Model model) {
        model.addAttribute("temperature", new Temperature());
        return "convinput";
    }

    @PostMapping("/convertisseur")
    protected String printConvertedTemperateur(Temperature temperature, Model model) {
        model.addAttribute("celsius", temperature.getCelsius());
        model.addAttribute("fahrenheit", temperature.getFahrenheit());
        return "convoutput";
    }


}
