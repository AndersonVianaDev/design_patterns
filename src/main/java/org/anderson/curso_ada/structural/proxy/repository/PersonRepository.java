package org.anderson.curso_ada.structural.proxy.repository;

import org.anderson.curso_ada.structural.proxy.model.Person;

import java.util.HashMap;
import java.util.Map;

public class PersonRepository {

    private Map<Long, Person> database = new HashMap<Long, Person>();

    private static Long countId = 1L;

    public void save(Person person) { database.put(countId++, person); }

    public Person findById(Long id) {
        try {
            Thread.sleep(3000);
            return database.get(id);
        } catch (Exception e) {
            throw new RuntimeException("person not found!");
        }
    }
}
