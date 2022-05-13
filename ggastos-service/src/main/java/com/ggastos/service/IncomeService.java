package com.ggastos.service;

import com.ggastos.model.Income;
import com.ggastos.repository.IncomeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel Castro
 */
@Service
public class IncomeService {

    private final IncomeRepository incomeRepository;

    @Autowired
    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public Income create(Income income) {

        return incomeRepository.save(income);
    }

    public void update(Long id, Income income) {

        Income i = incomeRepository.findById(id).get();
        i.setTypeName(income.getTypeName());
        i.setValue(income.getValue());
        i.setFixed(income.isFixed());

        incomeRepository.save(i);
    }

    public List<Income> findAll() {

        return incomeRepository.findAll();
    }

    public Income findById(Long id) throws Exception {

        Optional<Income> i = incomeRepository.findById(id);
        if (i == null || !i.isPresent()) {

            throw new Exception("Renda não encontrada.");
        }

        return i.get();
    }

    public void deleteById(Long id) {

        incomeRepository.deleteById(id);
    }
}
