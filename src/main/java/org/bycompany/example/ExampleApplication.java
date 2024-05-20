package org.bycompany.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {

        var ctx = SpringApplication.run(ExampleApplication.class, args); //context

        MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellAStory());
        System.out.println(myFirstService.getCustomProp());
        System.out.println(myFirstService.getCustomPropAnotherFile());
        System.out.println(myFirstService.getCustomPropAnotherFile2());
    }

}
