package org.bycompany.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from my First controller";
    }

    @PostMapping("/post")
    public String post(@RequestBody String message){
        return "request accepted and message is : " + message;
    }

    @PostMapping("/post-order")
    public String postOrder(@RequestBody Order order    ){
        return "request accepted and order is : " + order.toString();
    }

    @PostMapping("/post-order-record")
    public String postOrderRecord(@RequestBody OrderRecord orderRecord    ){
        return "request accepted and order is : " + orderRecord.toString();
    }
}
