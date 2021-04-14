import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello");

        SpringApplication.run(HelloWorld.class,args);
    }
    @GetMapping("/hello")
    public String sayhello(@RequestParam(value ="myName", defaultValue ="world")String name){
         return  String.format("Hello %s!", name);
    }
}
