package org.example.mySpring;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{

    @PostConstruct
    public void doInitialization(){
        System.out.println("do init this BEAN");
    }
    @PreDestroy
    public  void doDestroy(){
        System.out.println("do this BEAN destroy ");
    }

    @Override
    public String getSong() {
        System.out.println("Yesterday");

         return  "Yesterday";
    }
}
