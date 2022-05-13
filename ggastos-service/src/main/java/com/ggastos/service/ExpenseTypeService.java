package com.ggastos.service;

import java.util.List;
import java.util.Optional;

import com.ggastos.model.ExpenseType;
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

    public ExpenseType findOne(long id) throws Exception {
        Optional<ExpenseType> expenseType = expenseTypeRepository.findById(id);
        if (expenseType == null || !expenseType.isPresent()) {
            throw new Exception("Id não encontrado no banco!");
        }
        return expenseType.get();
    }

    public List<ExpenseType> findAll() {
        return expenseTypeRepository.findAll();
    }

    public void create(ExpenseType expenseType) {
        expenseTypeRepository.save(expenseType);
    }

    public void update(long id, ExpenseType ex) throws Exception {
        ExpenseType expenseType = findOne(id);
        expenseType.setName(ex.getName());
        expenseTypeRepository.save(expenseType);
    }

    public void delete(long id) throws Exception {
        ExpenseType expenseType = findOne(id);
        expenseTypeRepository.delete(expenseType);
    }

}
