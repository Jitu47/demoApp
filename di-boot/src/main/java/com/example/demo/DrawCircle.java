package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("drawCircle")
public class DrawCircle implements Shape{

    @Override
    public String draw() {
        return "This is a Circle";
    }
}
