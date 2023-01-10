package com.debuggeando_ideas.seccion04.lambdas;

public class LambdaApp {
    public static void main(String[] args) {
        Math substract1 = new Math() {
            @Override
            public Double execute(Double a, Double b) {
                return a-b;
            }
        };


        System.out.println("@FunctionalInterface Anonymous Class (10.5, 5.5) : "+ substract1.execute(10.5, 5.5));
        System.out.println("@FunctionalInterface Anonymous Class default method sum(10.5, 5.5) : "+ substract1.sum(10.5, 5.5));

        Math substract2 = (a,b)-> a-b;
        Math multiply = (a,b)-> a*b;
        Math divide = (a,b)-> a/b;

        System.out.println("@FunctionalInterface Lambda subs (10.5, 5.5) : "+ substract2.execute(10.5, 5.5));
        System.out.println("@FunctionalInterface Lambda mul (10.5, 5.5) : "+ multiply.execute(10.5, 5.5));
        System.out.println("@FunctionalInterface Lambda div (10.5, 5.5) : "+ divide.execute(10.5, 5.5));
        System.out.println("@FunctionalInterface Lambda  default method sum (10.5, 5.5) : "+ substract2.sum(10.5, 5.5));


    }
}
