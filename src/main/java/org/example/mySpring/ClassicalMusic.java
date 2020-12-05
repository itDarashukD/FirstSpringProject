package org.example.mySpring;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ClassicalMusic implements Music{


    private ClassicalMusic(){};//делаем метод фабрика

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }



    public void doMyInit(){
        System.out.println("doing so initialization");
    }
    public void doMyDestroy(){
        System.out.println("destroyes BINs");
    }
    @Override
    public String getSong() {
        System.out.println("Hungarian rapsody");
         return  "Hungarian rapsody";
    }
}
