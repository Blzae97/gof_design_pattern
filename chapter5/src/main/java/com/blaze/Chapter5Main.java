package com.blaze;

public class Chapter5Main {
    public static void main(String[] args) {
        FirstTypeSingleton firstInstance = FirstTypeSingleton.getInstance();
        System.out.println(firstInstance);

        SecondTypeSingleton secondInstance = SecondTypeSingleton.getInstance();
        System.out.println(secondInstance);

        ThirdTypeSingleton thirdInstance = ThirdTypeSingleton.getInstance();
        System.out.println(thirdInstance);
    }
}