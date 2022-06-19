package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduza um numero");
        Scanner leitor = new Scanner(System.in);
        int num = leitor.nextInt();
        int i = 2;
        boolean primo = true;
        while (i < num && primo == true) {
            if (num%i==0)
                primo = false;
            i += 1;
            }
        if (primo == true) {
            System.out.print("Numero primo: " + num);
        } else {
            System.out.print("Numero nao primo: " + num);
        }
    }
}