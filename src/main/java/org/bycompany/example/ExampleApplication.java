package org.bycompany.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;


@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        var app = new SpringApplication(ExampleApplication.class);
        app.setDefaultProperties(Collections.singletonMap("spring.profiles.active","test"));
        var ctx = app.run(args); //context

        MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellAStory());
        System.out.println(myFirstService.getCustomProp());
        System.out.println(myFirstService.getCustomPropInt());
        System.out.println(myFirstService.getCustomPropAnotherFile());
        System.out.println(myFirstService.getCustomPropAnotherFile2());
    }

}
