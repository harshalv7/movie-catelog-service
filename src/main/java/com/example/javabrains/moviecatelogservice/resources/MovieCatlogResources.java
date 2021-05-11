package com.example.javabrains.moviecatelogservice.resources;

import com.example.javabrains.moviecatelogservice.modules.CatelogItems;
import com.example.javabrains.moviecatelogservice.modules.Movie;
import com.example.javabrains.moviecatelogservice.modules.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.security.IdentityScope;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catelog")
public class MovieCatlogResources {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/{userId}")
    public List<CatelogItems> getCatelog(@PathVariable("userId") String userId){

        List<Rating> ratingList = Arrays.asList(
                new Rating("1111", "7"),
                new Rating("2222","8"),
                new Rating("3333","9")
        );

        return ratingList.stream().map(rating -> {
                    //Movie movie = restTemplate.getForObject("http://localhost:8889/movies/" + rating.getMovieId(), Movie.class);
            Movie movie = webClientBuilder.build()
                    .get()
                    .uri("http://localhost:8889/movies/" + rating.getMovieId())
                    .retrieve()
                    .bodyToMono(Movie.class)
                    .block();
            return new CatelogItems(movie.getMovieName(), "Desc", rating.getRating());
                }).collect(Collectors.toList());


         /*return Collections.singletonList(
                 new CatelogItems("Transformers", "Hollywood Movie", 4  )
         );*/
    }

}
