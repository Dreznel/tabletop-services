package service;

import monster.Monster;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class MonsterStatController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(method=GET, path="/monster")
    public Monster getMonsterStats(@RequestParam(value="monsterId", defaultValue="3") int monsterId) {
        return new Monster();
    }
}