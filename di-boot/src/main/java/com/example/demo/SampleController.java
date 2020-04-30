package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    @Qualifier("drawTriangle") // qualifier is a  way to identify if two classes implements same interface
    //@Qualifier("drawCircle")        // uncomment this and comment above to see
    Shape shape;

    //Constructors not necessary as autowired takes conroll of every thing and has a setter to inject.
    public void SampleController(Shape shape){
        this.shape = shape;
    }

    @RequestMapping ("/")
    public String show(){
        return shape.draw();
    }
}
