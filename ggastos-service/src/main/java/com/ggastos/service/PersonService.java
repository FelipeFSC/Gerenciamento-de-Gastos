package com.ggastos.service;

import com.ggastos.model.Person;
import com.ggastos.repository.PersonRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel Castro
 */
@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person create(Person person) {

        return personRepository.save(person);
    }
    
    //ANALISAR
    public Person update(Long id, Person person) {

        Person p = personRepository.findById(id).get();
        p.setNome(person.getNome());
        p.setExpenses(person.getExpenses());
        p.setIncomes(person.getIncomes());

        return personRepository.save(p);
    }

    public List<Person> findAll() {

        return personRepository.findAll();
    }

    public Optional<Person> findById(Long id) {

        return personRepository.findById(id);
    }

    public void deleteById(Long id) {

        personRepository.deleteById(id);
    }
}
