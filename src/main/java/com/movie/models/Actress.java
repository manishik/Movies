package com.movie.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Actress")
public class Actress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actress_id")
    private int actressId;

    @Column(name = "actress_first_name")
    private String actressFirstName;

    @Column(name = "actress_last_name")
    private String actressLastName;

    @Column(name = "actress_age")
    private Integer actressAge;

    @ManyToMany(fetch=FetchType.EAGER, mappedBy = "actresses")
    private List<Movie> movies = new ArrayList<Movie>();


    public int getActressId() {
        return actressId;
    }

    public void setActressId(int actressId) {
        this.actressId = actressId;
    }

    public String getActressFirstName() {
        return actressFirstName;
    }

    public void setActressFirstName(String actressFirstName) {
        this.actressFirstName = actressFirstName;
    }

    public String getActressLastName() {
        return actressLastName;
    }

    public void setActressLastName(String actressLastName) {
        this.actressLastName = actressLastName;
    }

    public Integer getActressAge() {
        return actressAge;
    }

    public void setActressAge(Integer actressAge) {
        this.actressAge = actressAge;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

}
