package com.movie.service;

import com.movie.daoOracle.ActorRepository;
import com.movie.daoOracle.ActressRepository;
import com.movie.daoOracle.MovieRepository;
import com.movie.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    List<Movie> movieSet = new ArrayList<>();

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private ActressRepository actressRepository;

    public Movie addMovie(Movie movie) {
        Movie movie1 = (Movie) movieRepository.save(movie);
        return movie1;
    }

    public Movie removeMovie(Movie movie) {
        return null;
    }

    public Movie updateMovie(Movie movie) {
        return null;
    }

    public Movie getMovieByName(Movie movie) {
        return null;
    }

    public List<Movie> getAllMovies(){
        return movieSet;
    }
}
