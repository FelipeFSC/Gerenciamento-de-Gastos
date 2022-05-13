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
    
    public void update(Long id, Person person) {

        Person p = personRepository.findById(id).get();
        p.setNome(person.getNome());
        p.setExpenses(person.getExpenses());
        p.setIncomes(person.getIncomes());

        personRepository.save(p);
    }

    public List<Person> findAll() {

        return personRepository.findAll();
    }

    public Person findById(Long id) throws Exception {
        
        Optional<Person> p = personRepository.findById(id);
        if (p == null || !p.isPresent()) {
            
            throw new Exception("Pessoa não encontrada.");
        }
        
        return p.get();
    }

    public void deleteById(Long id) {

        personRepository.deleteById(id);
    }
}
