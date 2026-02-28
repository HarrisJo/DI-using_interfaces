package com.harris.diusing_interfaces;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Mobile implements  Gadget {
    @Override
    public void useGadget() {
        System.out.println("Mobile is getting used");
    }
}
