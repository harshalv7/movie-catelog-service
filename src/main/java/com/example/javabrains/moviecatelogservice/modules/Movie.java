package com.example.javabrains.moviecatelogservice.modules;

public class Movie {

    public Movie(){

    }

    private String movieId;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    private String movieName;
    @Override
    public String toString() {
        return "Movie{" +
                "movieId='" + movieId + '\'' +
                ", movieName='" + movieName + '\'' +
                '}';
    }



    public Movie(String movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }


}
