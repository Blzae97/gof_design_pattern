package com.blaze;

public class FirstTypeSingleton {
    private static FirstTypeSingleton uniqueInstance;

    private FirstTypeSingleton(){}

    public static FirstTypeSingleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new FirstTypeSingleton();
        }

        return uniqueInstance;
    }
}
