package be.businesstraining;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloRestController {
    @GetMapping
    public String sayHello() {
        return "Hello hello, Bienvenue Cheikh dans CI/CD ....";
    }
}
