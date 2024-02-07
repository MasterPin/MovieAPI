package dev.masterpin.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//in here come the db access methods
public class MovieService {
    @Autowired //will let the framework know to instantiate the class MovieRepository for me
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

}
