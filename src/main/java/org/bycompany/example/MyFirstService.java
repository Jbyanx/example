package org.bycompany.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-file-2.properties")
})
public class MyFirstService {
    private final MyFirstClass myFirstClass;
    @Value("${my.custom.property}")
    private String customProp;
    @Value("${my.custom.property.int}")
    private Integer customPropInt;
    @Value("${my.prop}")
    private String customPropAnotherFile;
    @Value("${my.prop.2}")
    private String customPropAnotherFile2;

    public MyFirstService(@Qualifier("bean1") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory(){
        return "The dependency is saying: "+myFirstClass.sayHello()+" from the service";
    }

    public String getCustomProp(){
        return this.customProp;
    }

    public String getCustomPropAnotherFile() {
        return customPropAnotherFile;
    }

    public String getCustomPropAnotherFile2() {
        return customPropAnotherFile2;
    }

    public Integer getCustomPropInt() {
        return customPropInt;
    }
}
