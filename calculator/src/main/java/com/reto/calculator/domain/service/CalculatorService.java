package com.reto.calculator.domain.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double sum(double num1,double num2){
        return (num1+num2);
    }

    public double rest(double num1, double num2){
        return (num1-num2);
    }

    public double mult(double num1, double num2){
        return (num1*num2);
    }

    public  double div(double num1,double num2){
        return (num1/num2);
    }


}
