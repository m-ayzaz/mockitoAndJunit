package com.ayzaz.mockitoTestExamples.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double add(double input1, double input2){
        return input1 + input2;
    }
    public double subtract(double input1, double input2){
        return input1 - input2;
    }
    public double multiply(double input1, double input2){
        return input1 * input2;
    }
    public double divide(double input1, double input2){
        return input1 / input2;
    }
}
