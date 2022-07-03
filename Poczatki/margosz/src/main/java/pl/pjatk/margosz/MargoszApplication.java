package pl.pjatk.margosz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ImportResource("classpath:hhh.xml")
public class MargoszApplication {

	public static void main(String[] args) {
		SpringApplication.run(MargoszApplication.class, args);
	}

}
