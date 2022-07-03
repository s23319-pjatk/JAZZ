package pl.MarGosz.MovieService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@RestControllerAdvice
@RequestMapping("/moveis")
public class MovieController {
    public MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies/{id}")
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id, IllegalArgumentException ex) {
        return ResponseEntity.ok ( movieService.getMovie(id));

    }
    @GetMapping("/moveis")
    public  ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(movieService.findAll());
    }

    @PostMapping("/moveis")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.getMovie());
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie) {
        try{
            movieService.save(movie);
        }catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(movie);
    }
}