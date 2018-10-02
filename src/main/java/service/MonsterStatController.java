package service;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MonsterStatController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}