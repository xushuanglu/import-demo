package com.example.importdemo;

import com.xsl.*;
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

//        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfigTwo.class);
//        Cricle cricle = context.getBean(Cricle.class);
//        Triangle triangle = context.getBean(Triangle.class);
//        cricle.sayHello();
//        triangle.sayHi();

        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfigureThree.class);
        Cricle cricle = context.getBean(Cricle.class);
        Triangle triangle = context.getBean(Triangle.class);
        Rectangle rectangle = context.getBean(Rectangle.class);
        cricle.sayHello();
        triangle.sayHi();
        rectangle.sayHi();

        SpringApplication.run(ImportDemoApplication.class, args);
    }

}
