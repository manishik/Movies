package com.movie.daoOracle;

import com.movie.models.Actress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActressRepository extends JpaRepository<Actress, Long> {

    //Name of the method need to match the name of the field in class
    List<Actress> findByActressFirstName(String name);

    List<Actress> findByActressAge(int age);

}
