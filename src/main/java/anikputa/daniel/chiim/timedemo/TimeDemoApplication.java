package anikputa.daniel.chiim.timedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimeDemoApplication {
	public TimeDemoApplication(){
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		SpringApplication.run(TimeDemoApplication.class, args);
	}

}
