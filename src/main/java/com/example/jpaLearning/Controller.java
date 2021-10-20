package com.example.jpaLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    PersonServiceImpl personService;

    @GetMapping("add/{name}")
    public String add(@PathVariable String name){
        try{
            Person person = new Person(name, 24);
            personService.addPerson(person);
            return "OK";
        }
        catch (Exception exception){
            return "Ops!";
        }
    }

    @GetMapping("get/{id}")
    public Optional<Person> getOne(@PathVariable Long id){
        return personService.getById(id);
    }


    @GetMapping("name/{name}")
    public Optional<Person> getOne2(@PathVariable String name){
        return personService.findByName(name);
    }

    @GetMapping("getname/{id}")
    public Optional<String> getName(@PathVariable Long id){
        return personService.getName(id);
    }


    @GetMapping("getall")
    public List<Person> all(){

        return personService.getALL();
    }

    @GetMapping("getid8")
    public Optional<UserDTO> returntest(){
        return personService.getUserInformation(Long.parseLong("8"));
    }


}
