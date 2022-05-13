package com.ggastos.service;

import com.ggastos.repository.ExpenseTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseTypeService {

    private ExpenseTypeRepository expenseTypeRepository;

    @Autowired
    public ExpenseTypeService(ExpenseTypeRepository expenseTypeRepository) {
        this.expenseTypeRepository = expenseTypeRepository;
    }

    public void create() {

    }

    public void delete() {
        
    }

    public void update() {
        
    }
}
