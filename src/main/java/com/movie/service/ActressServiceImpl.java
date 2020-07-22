package com.movie.service;

import com.movie.daoOracle.ActressRepository;
import com.movie.models.Actress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActressServiceImpl implements ActressService {

    Logger logger = LoggerFactory.getLogger(ActressServiceImpl.class);

    @Autowired
    ActressRepository actressRepository;

    public Actress addActress(Actress actress) {
        logger.info("Service: addActress...");
        Actress Actress1 = actressRepository.save(actress);
        return Actress1;
    }

    public Actress removeActress(Actress actress) {
        logger.info("Service: removeActress...");
        //Always removes by id
        actressRepository.delete(actress);
        return actress;
    }

    public Actress updateActress(Actress actress) {
        logger.info("Service: updateActress...");
        Actress actress1 = actressRepository.save(actress);
        return actress1;
    }

    public List<Actress> listAllActress() {
        return actressRepository.findAll();
    }

    public List<Actress> findActressByFirstName(String name) {
        logger.info("Service: findActressByFirstName...");
        return actressRepository.findByActressFirstName(name);
    }

    public List<Actress> searchActressByAge(int age) {
        logger.info("Service: searchActressByAge...");
        return actressRepository.findByActressAge(age);
    }


}
