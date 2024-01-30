package com.ayzaz.mockitoTestExamples;

import com.ayzaz.mockitoTestExamples.service.CalculatorService;

public class MathApp {

    private CalculatorService calService;

    public MathApp(CalculatorService calService) {
        this.calService = calService;
    }

    public String testAdd(){
        return "Processed result : " + calService.add(1,1);
    }
}
