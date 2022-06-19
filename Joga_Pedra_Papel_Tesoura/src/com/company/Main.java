package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduza a sua escolha - pedra, papel ou tesoura");
        Scanner leitor = new Scanner(System.in);
        String escolha1 = leitor.next();
        System.out.println("Introduza a sua escolha - pedra, papel ou tesoura");
        String escolha2 = leitor.next();
        if ((escolha1=="pedra" && escolha2=="papel") != (escolha1=="papel" && escolha2=="tesoura") != (escolha1=="tesoura" && escolha2=="pedra")) {
            System.out.println("Ganho jogador 2");

        } else {
            System.out.println("Ganho jogador 1");
        }
    }
}
