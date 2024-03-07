package com.reto.calculator.web.controller;

import com.reto.calculator.domain.service.OperationService;
import com.reto.calculator.persistence.entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/operation")
@CrossOrigin("*")
public class OperationController {

    private final OperationService operationService;

    @Autowired
    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }

    @GetMapping()
    public List<Operation> getAll() {
        return operationService.getAll();
    }

    @GetMapping("/{id}")
    public Operation getById(@PathVariable Long id) {
        return operationService.getById(id);
    }
}
