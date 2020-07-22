package com.movie.ctrls;

import com.movie.models.Actor;
import com.movie.service.ActorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/actor")
public class ActorController {

    Logger logger = LoggerFactory.getLogger(ActorController.class);

    @Autowired
    ActorService actorService;

    @RequestMapping(path = "/addActor", method = RequestMethod.PUT)
    public Actor addActor(@RequestBody Actor actor) {
        logger.info("RestController: addActor..");
        Actor actor1 = actorService.addActor(actor);
        return actor1;
    }

    @RequestMapping(path = "/delActor", method = RequestMethod.DELETE)
    public Actor deleteActor(@RequestBody Actor actor) {
        logger.info("RestController: deleteActor..");
        Actor actor1 = actorService.removeActor(actor);
        return actor1;
    }

    @RequestMapping(path = "/updateActor", method = RequestMethod.POST)
    public Actor modifyActor(@RequestBody Actor actor) {
        logger.info("RestController: modifyActor..");
        Actor actor1 = actorService.updateActor(actor);
        return actor1;
    }

    @RequestMapping(path = "/listActors", method = RequestMethod.GET)
    public List<Actor> getAllActor() {
        logger.info("RestController: getAllActor..");
        return actorService.listAllActors();
    }

    @RequestMapping(path = "/findActorByFirstName/{name}", method = RequestMethod.GET)
    public List<Actor> findActorByFirstName(@PathVariable String name) {
        logger.info("RestController: findActorByFirstName..");
        return actorService.findActorByFirstName(name);
    }

    @RequestMapping(path = "/searchActorByAge/{age}", method = RequestMethod.GET)
    public List<Actor> searchActorByAge(@PathVariable int age) {
        logger.info("RestController: searchActorByAge..");
        return actorService.searchActorByAge(age);
    }

}
