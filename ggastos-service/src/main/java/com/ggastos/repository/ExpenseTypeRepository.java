package com.ggastos.repository;

import com.ggastos.model.Expense;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseTypeRepository extends JpaRepository<Expense, Long> {

}
