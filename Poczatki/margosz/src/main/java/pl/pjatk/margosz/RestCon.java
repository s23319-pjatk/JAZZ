package pl.pjatk.margosz;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class RestCon {
    @GetMapping("/hello")
 public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello world");
    }
    @GetMapping("/Train")
    public ResponseEntity<Train> hd(){
        return ResponseEntity.ok(new Train("Tomek", "Niebieski","100"));
    }
    @GetMapping("/Train/{v}")
    public ResponseEntity<String> hkd(@PathVariable String v){
        return ResponseEntity.ok(v);
    }
    @GetMapping("/Train/b")
    public ResponseEntity<String> nbk(@RequestParam String cos){
        return ResponseEntity.ok(cos);
    }
}
