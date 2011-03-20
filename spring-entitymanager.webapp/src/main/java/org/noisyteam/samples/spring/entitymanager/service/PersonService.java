package org.noisyteam.samples.spring.entitymanager.service;

import org.noisyteam.samples.spring.entitymanager.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Roman Romanchuk (fatroom@gmail.com)
 */
@Service
public class PersonService extends GenericService<Person> {
    public List<Person> findAllPersons() {
        return createNamedQuery("findAllPersons").getResultList();
    }
}
