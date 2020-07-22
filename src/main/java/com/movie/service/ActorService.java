package com.movie.service;

import com.movie.models.Actor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ActorService {

    Actor addActor(Actor actor);

    Actor removeActor(Actor actor);

    Actor updateActor(Actor actor);

    List<Actor> listAllActors();

    List<Actor> findActorByFirstName(String name);

    List<Actor> searchActorByAge(int age);

}
