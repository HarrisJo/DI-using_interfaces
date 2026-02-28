package com.harris.diusing_interfaces;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Gadget {
    @Override
    public void useGadget() {
        System.out.println("Laptop is getting used");
    }
}
