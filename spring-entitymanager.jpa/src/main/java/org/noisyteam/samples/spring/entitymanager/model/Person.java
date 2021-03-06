package org.noisyteam.samples.spring.entitymanager.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * Person model.
 *
 * @author Roman Romanchuk (fatroom@gmail.com)
 */
@Entity
@NamedQuery(name = "findAllPersons", query = "select p from Person p")
public class Person {
    @Id
    private long id;
    private String name;
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: "+name+" age: "+age;
    }
}
