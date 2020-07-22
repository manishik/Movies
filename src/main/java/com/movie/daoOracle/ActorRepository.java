package com.movie.daoOracle;

import com.movie.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {

    //Name of the method need to match the name of the field in class
    List<Actor> findByActorFirstName(String name);

    List<Actor> findByActorAge(int age);

    // All other methods (Need to change method names)
    /*List<Actor> findByNameIs(String name);

    List<Actor> findByNameEquals(String name);

    List<Actor> findByNameIsNull();

    List<Actor> findByNameNot(String name);

    List<Actor> findByNameIsNot(String name);

    List<Actor> findByNameStartingWith(String name);

    List<Actor> findByNameEndingWith(String name);

    List<Actor> findByNameContaining(String name);

    List<Actor> findByNameLike(String name);

    List<Actor> findByAgeLessThan(Integer age);

    List<Actor> findByAgeLessThanEqual(Integer age);

    List<Actor> findByAgeGreaterThan(Integer age);

    List<Actor> findByAgeGreaterThanEqual(Integer age);

    List<Actor> findByAgeBetween(Integer startAge, Integer endAge);

    List<Actor> findByBirthDateAfter(ZonedDateTime birthDate);

    List<Actor> findByBirthDateBefore(ZonedDateTime birthDate);

    List<Actor> findByActiveTrue();

    List<Actor> findByActiveFalse();

    List<Actor> findByAgeIn(Collection<Integer> ages);

    List<Actor> findByNameOrBirthDate(String name, ZonedDateTime birthDate);

    List<Actor> findByNameOrBirthDateAndActive(String name, ZonedDateTime birthDate, Boolean active);

    List<Actor> findByNameOrderByName(String name);

    List<Actor> findByNameOrderByNameDesc(String name);*/

}
