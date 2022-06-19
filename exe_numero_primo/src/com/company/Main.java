package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        do {
            System.out.println(" Introduza um numero");
            Scanner leitor = new Scanner(System.in);
            int num = leitor.nextInt();
            if (num<0)
                break;
            int i = 2;
            boolean primo = true;
            while (i < num - 1 && primo == true) {
                if (num % i == 0)
                    primo = false;
                i += 1;
            }
            if (primo == true) {
                System.out.print("Numero primo: " + num);
            } else {
                System.out.print("Numero nao primo: " + num);
            }
        }while (true);
    }
}
