package com.ggastos.repository;

import com.ggastos.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Miguel Castro
 */
public interface IncomeRepository extends JpaRepository<Income, Long>{
    
}
