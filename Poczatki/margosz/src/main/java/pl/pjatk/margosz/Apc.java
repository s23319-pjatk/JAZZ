package pl.pjatk.margosz;


import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component

public class Apc {

    private static ApplicationContext applicationContext;

    public void Apc (ApplicationContext applicationContext)
    {
        this.applicationContext=applicationContext;

        applicationContext.getBean("kao",Kao.class).printHelloMessage();
        applicationContext.getBean("bech",Bech.class).printHelloMessage();


    }

}
