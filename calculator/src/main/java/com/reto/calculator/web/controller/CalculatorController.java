package com.reto.calculator.web.controller;

import com.reto.calculator.CalculatorApplication;
import com.reto.calculator.domain.service.CalculatorService;
import com.reto.calculator.domain.service.OperationService;
import com.reto.calculator.persistence.entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/calculator")
@CrossOrigin("*")
public class CalculatorController {

    private final CalculatorService calculatorService;

    private  final  OperationService operationService;
    @Autowired
    public CalculatorController(CalculatorService calculatorService, OperationService operationService) {
        this.calculatorService = calculatorService;
        this.operationService = operationService;
    }

    @GetMapping("/sum")
    public double sum(@RequestParam double num1,@RequestParam double num2) {
       /*  double result = calculatorService.sum(num1, num2);
        Operation operation = new Operation();
        operation.setTime(new Date());
        operation.setResult(result);
        operation.setOperationType("Suma");
        operation.setOperand1(num1);
        operation.setOperand2(num2);

        OperationService operationService = new OperationService();
        operationService.saveOperation(operation);*/

        return calculatorService.sum(num1, num2);
    }

    @GetMapping("/div")
    public double div(@RequestParam double num1, @RequestParam double num2){
        return calculatorService.div(num1,num2);
    }

    @GetMapping("/rest")
    public double rest(@RequestParam double num1,@RequestParam double num2){
        return calculatorService.rest(num1,num2);
    }

    @GetMapping("/mult")
    public double mult(@RequestParam double num1,@RequestParam double num2){
        return calculatorService.mult(num1,num2);
    }


}
