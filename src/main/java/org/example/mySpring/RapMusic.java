package org.example.mySpring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class RapMusic implements Music{


    @Override
    public String getSong() {
        System.out.println("Kasta - Sister");
        return "Kasta - Sister";
    }
}
