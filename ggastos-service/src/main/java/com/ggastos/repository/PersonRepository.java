package com.ggastos.repository;

import com.ggastos.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Miguel Castro
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
