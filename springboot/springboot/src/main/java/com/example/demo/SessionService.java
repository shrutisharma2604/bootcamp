package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionService implements ExecuteService {
    //Bean Injection method
    @Autowired //1. using Autowired notation
    DemoService demoService;

    @Autowired //2. using constructor
    SessionService(DemoService demoService){
        this.demoService=demoService;
    }

    @Autowired //3.using setter method
    void  setDemoService(DemoService demoService){
        this.demoService=demoService;
    }

    public void createSession(){
        System.out.println("Session Created");
        demoService.createDemo();
    }

    @Override
    public void PrimaryEx() {
        System.out.println("use of primary annotation");
    }

}
