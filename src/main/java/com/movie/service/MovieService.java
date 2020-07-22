package com.movie.service;

import com.movie.models.Movie;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MovieService {

    Movie addMovie(Movie movie);

    Movie removeMovie(Movie movie);

    Movie updateMovie(Movie movie);

    Movie getMovieByName(Movie movie);

    List<Movie> getAllMovies();
}
