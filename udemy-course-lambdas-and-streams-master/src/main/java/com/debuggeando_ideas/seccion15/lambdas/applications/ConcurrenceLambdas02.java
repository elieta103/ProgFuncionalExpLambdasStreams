package com.debuggeando_ideas.seccion15.lambdas.applications;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ConcurrenceLambdas02 {

    //Ejecuta en otro hilo, no regresa valor
    static Runnable printerSum = ()->{
        long num = 0;
        System.out.println(Thread.currentThread().getName());
        for (int i=0;i<1000000;  i++){
            num+=i;
        }
        System.out.println("Total : "+num);
    };

    //Ejecuta en otro hilo, si regresa valor
    static  Callable<Long> getSum = ()->{
        long num = 0;
        System.out.println(Thread.currentThread().getName());
        for (int i=0;i<1000000;  i++){
            num+=i;
        }
        return num;
    };

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Pool de threads
        var exec = Executors.newSingleThreadExecutor();
        System.out.println(Thread.currentThread().getName());
        exec.submit(printerSum);

        var result = exec.submit(getSum);
        System.out.println("result : "+result.get());

        exec.shutdown();
    }
}
