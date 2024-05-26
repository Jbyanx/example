package org.bycompany.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from my First controller";
    }

    @GetMapping("/hello/2")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayHello2(){
        return "Hello 2 from my First controller";
    }
}
