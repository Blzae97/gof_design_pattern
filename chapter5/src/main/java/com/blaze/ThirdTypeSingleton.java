package com.blaze;

public class ThirdTypeSingleton {
    private static volatile ThirdTypeSingleton thirdTypeSingleton;

    private ThirdTypeSingleton() {
    }

    public static ThirdTypeSingleton getInstance() {
        if (thirdTypeSingleton == null) {
            synchronized (ThirdTypeSingleton.class) {
                if (thirdTypeSingleton == null) {
                    thirdTypeSingleton = new ThirdTypeSingleton();
                }
            }
        }
        return thirdTypeSingleton;
    }
}
