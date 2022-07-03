package pl.MarGosz.MovieService;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service


public class MovieService {
    void MovieService(MovieRepository kkak){movieRepository=kkak;}
    private MovieRepository movieRepository;

    public Movie getMovie(Long id) {
        if(movieRepository.existsById(id)) {
            return movieRepository.getById(id);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Movie not found");
        }


    }

    public Movie addMovie(@RequestBody Movie movie) {

            movieRepository.save(movie);

        return movie;
    }

}
