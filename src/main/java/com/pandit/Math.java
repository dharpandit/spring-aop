package com.pandit;

import org.springframework.stereotype.Component;

@Component
public class Math{

    public int multiply( int a, int b){
        return a * b;
    }

    public int add(int a, int b){
        return a + b;
    }

    public float divide(int a, int b){
        return a/b;
    }

}
