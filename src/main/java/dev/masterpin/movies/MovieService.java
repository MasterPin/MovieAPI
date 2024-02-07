package dev.masterpin.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//in here come the db access methods
public class MovieService {
    @Autowired //will let the framework know to instantiate the class MovieRepository for me
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
//Optional<Movie> says that it could be null as well (error handling)
    public Optional<Movie> getMovieById(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }

}
