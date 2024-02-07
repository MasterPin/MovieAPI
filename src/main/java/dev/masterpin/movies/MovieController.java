package dev.masterpin.movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")//every call to the path /api/v1/movies will be handles by this controller
public class MovieController {
    @Autowired//will let the framework know to instantiate the class MovieRepository for me
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> allMovies(){
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable String imdbId){
        return new ResponseEntity<>(movieService.getMovieById(imdbId),HttpStatus.OK);
    }
}
