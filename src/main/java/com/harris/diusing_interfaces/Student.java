package com.harris.diusing_interfaces;

import org.springframework.stereotype.Component;

@Component
public class Student {
    Gadget gadget;

    public Student(Gadget gadget) {
        this.gadget = gadget;
    }

    void study() {
        System.out.println("Student is studying");
    }

    void workingWithGadget() {
        gadget.useGadget();
    }
}
