package com.harris.diusing_interfaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiUsingInterfacesApplication {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(DiUsingInterfacesApplication.class, args);

        Student stu = ac.getBean(Student.class);
        stu.study();
        stu.workingWithGadget();
    }

}
