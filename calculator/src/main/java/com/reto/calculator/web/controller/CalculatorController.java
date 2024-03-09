package com.reto.calculator.web.controller;

import com.reto.calculator.CalculatorApplication;
import com.reto.calculator.domain.service.CalculatorService;
import com.reto.calculator.domain.service.OperationService;
import com.reto.calculator.domain.service.OperationServiceImpl;
import com.reto.calculator.persistence.DTO.OperationDTO;
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
    private  final  OperationServiceImpl operationService;
    @Autowired
    public CalculatorController(CalculatorService calculatorService, OperationServiceImpl operationService) {
        this.calculatorService = calculatorService;
        this.operationService = operationService;
    }

    @GetMapping("/sum")
    public double sum(@RequestParam double num1,@RequestParam double num2) {
        OperationDTO operationDTO = new OperationDTO();
        operationDTO.setOperationType("Suma");
        operationDTO.setResult(calculatorService.sum(num1, num2));
        operationDTO.setTime(new Date());
        operationDTO.setOperand1(num1);
        operationDTO.setOperand2(num2);
        operationService.saveOperation(operationDTO);
        return calculatorService.sum(num1, num2);
    }

    @GetMapping("/div")
    public double div(@RequestParam double num1, @RequestParam double num2){
        OperationDTO operationDTO = new OperationDTO();
        operationDTO.setOperationType("Division");
        operationDTO.setResult(calculatorService.div(num1, num2));
        operationDTO.setTime(new Date());
        operationDTO.setOperand1(num1);
        operationDTO.setOperand2(num2);
        operationService.saveOperation(operationDTO);
        return calculatorService.div(num1,num2);
    }

    @GetMapping("/rest")
    public double rest(@RequestParam double num1,@RequestParam double num2){
        OperationDTO operationDTO = new OperationDTO();
        operationDTO.setOperationType("Resta");
        operationDTO.setResult(calculatorService.rest(num1, num2));
        operationDTO.setTime(new Date());
        operationDTO.setOperand1(num1);
        operationDTO.setOperand2(num2);
        operationService.saveOperation(operationDTO);
        return calculatorService.rest(num1,num2);
    }

    @GetMapping("/mult")
    public double mult(@RequestParam double num1,@RequestParam double num2){
        OperationDTO operationDTO = new OperationDTO();
        operationDTO.setOperationType("Multiplicacion");
        operationDTO.setResult(calculatorService.mult(num1, num2));
        operationDTO.setTime(new Date());
        operationDTO.setOperand1(num1);
        operationDTO.setOperand2(num2);
        operationService.saveOperation(operationDTO);
        return calculatorService.mult(num1,num2);
    }


}
