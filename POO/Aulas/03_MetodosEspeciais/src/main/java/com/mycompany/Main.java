package com.mycompany;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Vermelha", 0.5f);
        c1.status();
        
        Caneta c2 = new Caneta("BIC", "Preta", 0.4f);
        c2.status();
    }
}