package com.movie.service;

import com.movie.daoOracle.ActorRepository;
import com.movie.models.Actor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    Logger logger = LoggerFactory.getLogger(ActorServiceImpl.class);

    @Autowired
    ActorRepository actorRepository;

    public Actor addActor(Actor actor) {
        logger.info("Service: addActor...");
        Actor actor1 = actorRepository.save(actor);
        return actor1;
    }

    public Actor removeActor(Actor actor) {
        logger.info("Service: removeActor...");
        //Always removes by id
        actorRepository.delete(actor);
        return actor;
    }

    // UI needs to send ID to update
    public Actor updateActor(Actor actor) {
        logger.info("Service: updateActor...");
        /*Actor actor1 = actorRepository.getOne(actor.getActorId() + 1);
        actor1.setActorAge(actor.getActorAge());
        actor1.setActorFirstName(actor.getActorFirstName());
        actor1.setActorLastName(actor.getActorLastName());*/
        Actor actor1 = actorRepository.save(actor);
        return actor1;
    }

    public List<Actor> listAllActors() {
        return actorRepository.findAll();
    }

    public List<Actor> findActorByFirstName(String name) {
        logger.info("Service: findActorByFirstName...");
        return actorRepository.findByActorFirstName(name);
    }

    public List<Actor> searchActorByAge(int age) {
        logger.info("Service: searchActorByAge...");
        return actorRepository.findByActorAge(age);
    }


}
