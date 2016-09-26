package seminars;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import seminars.controlers.SeminarController;

@EnableAutoConfiguration
@SpringBootApplication
//@ComponentScan({"seminars.services", "seminars.repositories", "seminars.controlers"})
public class App {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

}
