package com.ayzaz.mockitoTestExamples;

import com.ayzaz.mockitoTestExamples.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class VerifyAndInjectionTest {

    @Mock
    private CalculatorService calculatorService;

    @InjectMocks
    private MathApp mathApp;

    @Test
    public void testCall(){
        when(calculatorService.add(1,1)).thenReturn(1.0);
        System.out.println(mathApp.testAdd());
        verify(calculatorService).add(1,1);
    }
}
