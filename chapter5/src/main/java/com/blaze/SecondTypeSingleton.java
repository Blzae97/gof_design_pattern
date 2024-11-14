package com.blaze;

public class SecondTypeSingleton {
    private static final SecondTypeSingleton secondTypeSingleton = new SecondTypeSingleton();

    private SecondTypeSingleton() {
    }

    public static SecondTypeSingleton getInstance() {
        return secondTypeSingleton;
    }
}
