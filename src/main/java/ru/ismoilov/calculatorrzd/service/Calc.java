package ru.ismoilov.calculatorrzd.service;

import org.springframework.stereotype.Service;
import ru.ismoilov.calculatorrzd.model.OperatorModel;
@Service
public class Calc {
    public int addition(OperatorModel operatorModel) {
        return operatorModel.getA() + operatorModel.getB();

    }
    public int subtraction(OperatorModel operatorModel){
        return operatorModel.getA()- operatorModel.getB();
    }
    public double division(OperatorModel operatorModel){
        return (double) operatorModel.getA()/operatorModel.getB();
    }

    public int multiply(OperatorModel operatorModel){
        return  operatorModel.getA()* operatorModel.getB();
    }

    public double squareRoot(OperatorModel operatorModel){
        return Math.sqrt(operatorModel.getC());
    }


}
