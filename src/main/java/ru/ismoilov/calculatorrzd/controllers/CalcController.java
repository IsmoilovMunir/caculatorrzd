package ru.ismoilov.calculatorrzd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.ismoilov.calculatorrzd.model.OperatorModel;
import ru.ismoilov.calculatorrzd.service.Calc;

@RestController
public class CalcController {
    OperatorModel operationModel = new OperatorModel();
    @Autowired
    private Calc calc;

    @RequestMapping("/calculator")
    public String getCalculatorPage(Model model) {
        model.addAttribute("operationModel", operationModel);
        return "calculator";
        /**
         *
         */
    }
    @RequestMapping(value = "/calculator", params = "addition", method = RequestMethod.POST)
    public String addition(@ModelAttribute("operationModel") OperatorModel operationModel, Model model) {
        model.addAttribute("result", calc.addition(operationModel));
        return "calculator";
    }
    @RequestMapping(value = "/calculator", params = "subtraction", method = RequestMethod.POST)
    public String subtraction(@ModelAttribute("operationModel") OperatorModel operationModel, Model model) {
        model.addAttribute("result", calc.subtraction(operationModel));
        return "calculator";
    }
    @RequestMapping(value = "/calculator", params = "division", method = RequestMethod.POST)
    public String division(@ModelAttribute("operationModel") OperatorModel operationModel, Model model) {
        model.addAttribute("result", calc.division(operationModel));
        return "calculator";
    }
    @RequestMapping(value = "/calculator", params = "multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("operationModel") OperatorModel operationModel, Model model) {
        model.addAttribute("result", calc.multiply(operationModel));
        return "calculator";
    }
    @RequestMapping(value = "/calculator", params = "squareRoot", method = RequestMethod.POST)
    public String sqrt(@ModelAttribute("operationModel") OperatorModel operationModel, Model model) {
        model.addAttribute("result", calc.squareRoot(operationModel));
        return "calculator";
    }


}
