package com.example.viewcomponentmavendemo.core;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    public String getCoffee(){
        return "Watch Coffee + Software with Josh Long!";
    }

    public String getOfficeHours(){
        return "Watch the Spring Office Hours!";
    }

    public String getSomeOtherProperty(){
        return "Hello Wim";
    }
}
