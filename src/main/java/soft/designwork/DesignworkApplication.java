package soft.designwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author 29237
 */
@SpringBootApplication
@CrossOrigin(origins="http://localhost:8088",allowCredentials="true")
public class DesignworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignworkApplication.class, args);
    }

}
