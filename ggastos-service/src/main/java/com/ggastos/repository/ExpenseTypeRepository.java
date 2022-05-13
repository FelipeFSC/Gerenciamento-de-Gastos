package com.ggastos.repository;

import com.ggastos.model.ExpenseType;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseTypeRepository extends JpaRepository<ExpenseType, Long> {

}
