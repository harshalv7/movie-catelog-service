package com.example.javabrains.moviecatelogservice.modules;

public class Rating {


    public Rating(String movieId, String rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    private String movieId;
    private String rating;
    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }



    @Override
    public String toString() {
        return "Rating{" +
                "movieId='" + movieId + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

}
