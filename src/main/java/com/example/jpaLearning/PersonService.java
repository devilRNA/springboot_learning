package com.example.jpaLearning;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    void addPerson(Person person);
    List<Person> getALL();
   Optional<Person> getById(Long id);
    Optional<Person> findByName(String name);



}
