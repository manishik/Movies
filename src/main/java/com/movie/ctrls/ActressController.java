package com.movie.ctrls;

import com.movie.models.Actress;
import com.movie.service.ActressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/actress")
public class ActressController {

    Logger logger = LoggerFactory.getLogger(ActressController.class);

    @Autowired
    ActressService actressService;

    @RequestMapping(path = "/addActress", method = RequestMethod.PUT)
    public Actress addActress(@RequestBody Actress actress) {
        Actress actor1 = actressService.addActress(actress);
        return actor1;
    }

    @RequestMapping(path = "/delActress", method = RequestMethod.DELETE)
    public Actress deleteActress(@RequestBody Actress actress) {
        Actress actor1 = actressService.removeActress(actress);
        return actor1;
    }

    @RequestMapping(path = "/updateActress", method = RequestMethod.POST)
    public Actress modifyActress(@RequestBody Actress actress) {
        Actress actor1 = actressService.updateActress(actress);
        return actor1;
    }

    @RequestMapping(path = "/listActress", method = RequestMethod.GET)
    public List<Actress> getAllActress() {
        return actressService.listAllActress();
    }

    @RequestMapping(path = "/findActressByFirstName/{name}", method = RequestMethod.GET)
    public List<Actress> findActressByFirstName(@PathVariable String name) {
        return actressService.findActressByFirstName(name);
    }

    @RequestMapping(path = "/searchActressByAge/{age}", method = RequestMethod.GET)
    public List<Actress> searchActressByAge(@PathVariable int age) {
        return actressService.searchActressByAge(age);
    }
    
    
}
