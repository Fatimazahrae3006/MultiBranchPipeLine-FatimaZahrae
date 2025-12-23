package com.example;

public class App {
    
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
    }
    
    public String getMessage() {
    return "Bonjour depuis la branche DEVELOP! MultiBranch Pipeline fonctionne!";
}
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
}