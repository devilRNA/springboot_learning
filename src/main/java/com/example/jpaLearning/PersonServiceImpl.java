package com.example.jpaLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("PersonService")
public class PersonServiceImpl implements PersonService{
    @Autowired
    PersonRepository personRepository;


    @Override
    public void addPerson(Person person) {
    personRepository.save(person);

    }

    @Override
    public List<Person> getALL() {

        return personRepository.findAll();
    }

    @Override
    public Optional<Person> getById(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public Optional<Person> findByName(String name) {
        return personRepository.findByName(name);
    }

    public Optional<String> getName(Long id){
        return personRepository.findPersonNameById(id);
    }

    public Optional<UserDTO> getUserInformation(Long id){
        return personRepository.getUserInformation(id);
    }
}
