package com.movie.service;

import com.movie.models.Actress;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ActressService {

    Actress addActress(Actress actor);

    Actress removeActress(Actress actor);

    Actress updateActress(Actress actor);

    List<Actress> listAllActress();

    List<Actress> findActressByFirstName(String name);

    List<Actress> searchActressByAge(int age);

}
