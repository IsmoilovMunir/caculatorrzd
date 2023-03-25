package ru.ismoilov.calculatorrzd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    private Calc  calculateSimple;

    @RequestMapping("/calculator")
    public String getCalculatorPage(Model model){
        model.addAttribute("operationModel",operationModel);
        return "calculator";
    }

    @RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel")  OperatorModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.add(String.valueOf(operationModel)));
        return "calculator";
    }

}
