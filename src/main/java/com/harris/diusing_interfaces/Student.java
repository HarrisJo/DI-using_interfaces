package com.harris.diusing_interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    Gadget gadget;

    @Autowired
    public Student(@Qualifier("mobile") Gadget gadget) {
        this.gadget = gadget;
    }

    void study() {
        System.out.println("Student is studying");
    }

    void workingWithGadget() {
        gadget.useGadget();
    }
}
