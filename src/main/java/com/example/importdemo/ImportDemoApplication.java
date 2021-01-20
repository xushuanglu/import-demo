package com.example.importdemo;

import com.xsl.Cricle;
import com.xsl.MainConfig;
import com.xsl.MainConfigTwo;
import com.xsl.Triangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ImportDemoApplication {

    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
//        Cricle cricle = context.getBean(Cricle.class);
//        cricle.sayHello();

        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfigTwo.class);
        Cricle cricle = context.getBean(Cricle.class);
        Triangle triangle = context.getBean(Triangle.class);
        cricle.sayHello();
        triangle.sayHi();

        SpringApplication.run(ImportDemoApplication.class, args);
    }

}
