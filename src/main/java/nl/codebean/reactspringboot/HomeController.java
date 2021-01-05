package nl.codebean.reactspringboot;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {
    @GetMapping("/api/home")
    public String home() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }
}

