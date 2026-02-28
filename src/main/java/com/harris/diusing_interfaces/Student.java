package com.harris.diusing_interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    Gadget gadget;
    Gadget specificGadget;

    @Autowired
    public Student(Gadget gadget, @Qualifier("mobile") Gadget specificGadget) {
        this.gadget = gadget;
        this.specificGadget = specificGadget;
    }

    void study() {
        System.out.println("Student is studying");
    }

    void workingWithGadget() {
        gadget.useGadget();
        specificGadget.useGadget();
    }
}
