package com.movie.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "Movie")
public class Movie implements Serializable {

    public Movie() {
    }

    @Id
   /* @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movieSeq")
    @SequenceGenerator(name = "movieSeq", sequenceName = "movie_seq")*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_year")
    private Date movieYear;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_actor_actress", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private Set<Actor> actors = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_actor_actress", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "actress_id"))
    private Set<Actress> actresses = new HashSet<Actress>();

    @Column(name = "ratings")
    private double ratings;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(Date movieYear) {
        this.movieYear = movieYear;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    public Set<Actress> getActresses() {
        return actresses;
    }

    public void setActresses(Set<Actress> actresses) {
        this.actresses = actresses;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }
}
