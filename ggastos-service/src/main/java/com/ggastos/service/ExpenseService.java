package com.ggastos.service;

import com.ggastos.model.Expense;
import com.ggastos.repository.ExpenseRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel Castro
 */
@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Expense create(Expense expense) {

        return expenseRepository.save(expense);
    }

    public void update(Long id, Expense expense) {

        Expense e = expenseRepository.findById(id).get();
        e.setType(expense.getType());
        e.setValue(expense.getValue());
        e.setFixed(expense.isFixed());

        expenseRepository.save(e);
    }

    public List<Expense> findAll() {

        return expenseRepository.findAll();
    }

    public Expense findById(Long id) throws Exception {

        Optional<Expense> e = expenseRepository.findById(id);
        if (e == null || !e.isPresent()) {

            throw new Exception("Gasto não encontrado.");
        }

        return e.get();
    }

    public void delete(Long id) {

        expenseRepository.deleteById(id);
    }
}
