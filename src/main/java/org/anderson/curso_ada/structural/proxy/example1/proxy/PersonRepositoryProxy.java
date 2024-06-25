package org.anderson.curso_ada.structural.proxy.example1.proxy;

import org.anderson.curso_ada.structural.proxy.example1.model.Person;
import org.anderson.curso_ada.structural.proxy.example1.repository.PersonRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class PersonRepositoryProxy extends PersonRepository {

    private Logger log = Logger.getLogger(this.getClass().getName());

    private Map<Long, Person> cache = new HashMap<Long, Person>();

    @Override
    public void save(Person person) {
        log.info("Initiating save method call");
        super.save(person);
        log.info("Save method call completed");
    }

    @Override
    public Person findById(Long id) {
        log.info("Initiating findById method call");
        Long start = System.currentTimeMillis();
        Person person = null;
        if(cache.containsKey(id)) {
            log.info("Catching the person by cache");
            person = cache.get(id);
        } else {
            person =  super.findById(id);
            cache.put(id, person);
        }
        Long end = System.currentTimeMillis();
        log.info("FindById method call completed in " + (end - start) + " ms");
        return person;
    }
}
