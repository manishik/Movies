package com.movie.ctrls;

import com.movie.models.Movie;
import com.movie.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "/movie")
public class MovieController {

    Logger logger = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    MovieService movieService;

    @RequestMapping(path = "/addMovie", method = RequestMethod.PUT)
    Movie createMovie(@RequestBody Movie movie) {
        logger.info("INFO: Inside createMovie..");
        Movie movie1 = movieService.addMovie(movie);
        return movie1;
    }

    @RequestMapping(path = "/getMovieByName", method = RequestMethod.GET)
    Movie getMovie(@RequestBody Movie movie) {
        Movie movie1 = movieService.getMovieByName(movie);
        return movie1;
    }

    @RequestMapping(path = "/editMovie", method = RequestMethod.POST)
    String updateMovie() {
        return "Movie updated.";
    }

    @RequestMapping(path = "/removeMovie", method = RequestMethod.POST)
    String deleteMovie() {
        return "Movie deleted";
    }

    @RequestMapping(path = "/getAllMovie", method = RequestMethod.GET)
    List<Movie> getAllMovie() {
        return movieService.getAllMovies();
    }

}
