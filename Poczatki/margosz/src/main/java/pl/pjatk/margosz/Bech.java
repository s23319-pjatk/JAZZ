package pl.pjatk.margosz;


import org.springframework.stereotype.Component;

public class Bech {

    public Bech(Kao kao) {
        System.out.println("Hello from Bech");
        kao.printHelloMessage();
    }

    public void printHelloMessage() {
        System.out.println("baton");
    }
}
