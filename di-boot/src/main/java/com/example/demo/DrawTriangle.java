package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("drawTriangle")
public class DrawTriangle implements Shape {
    @Override
    public String draw() {
        return "this is a Triangle";
    }
}
