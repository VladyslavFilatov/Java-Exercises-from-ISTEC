package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Alfa a = new Alfa(1);
        System.out.println(a.Alfinha);
        Alfa.Bravo b =a.new Bravo(3);
        System.out.println(b.Bravinha);

        Scanner scanner = new Scanner(System.in);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    try {
                        Thread.sleep(1000);
                        System.out.println(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
        System.out.println("Introduza Nome:");
        String nome = scanner.next();
        System.out.println(nome);


    }
}
