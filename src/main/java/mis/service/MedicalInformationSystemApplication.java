package mis.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("mis")
public class MedicalInformationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalInformationSystemApplication.class, args);
    }

}
