package org.bycompany.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    //@GetMapping("/hello")
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

    @GetMapping("/hello/{user-name}")
    public String pathVar(@PathVariable("user-name") String userName){
        return "my value = "+ userName;
    }

    //localhost:8080/hello?param_name=paramvalue&param_name2=paramvalue2
    @GetMapping("/hello")
    public String paramVar(
            @RequestParam("user-name") String userName,
            @RequestParam("last-name") String userLastName){
        return "my value = "+ userName+ " "+userLastName;
    }
}
