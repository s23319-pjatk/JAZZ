package pl.pjatk.margosz;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class Train {
    public String Nazwa;
    public String Kolor;
    public String Szybkosc;

    public Train(String nazwa, String kolor, String szybkosc) {
        this.Nazwa = nazwa;
        this.Kolor = kolor;
        this.Szybkosc = szybkosc;
    }
}
