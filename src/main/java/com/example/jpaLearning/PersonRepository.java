package com.example.jpaLearning;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByName(String name);

    @Query("select p.name from Person p where p.id = :id")
    Optional<String> findPersonNameById(@Param("id") Long id);

    /**
     * 连表查询
     */
    @Query(value = "select new com.example.jpaLearning.UserDTO(p.name,p.age,c.companyName,s.name) " +
            "from Person p left join Company c on  p.id=c.id " +
            "left join School s on p.id=s.id " +
            "where p.id=:personId")
    Optional<UserDTO> getUserInformation(@Param("personId") Long personId);

}