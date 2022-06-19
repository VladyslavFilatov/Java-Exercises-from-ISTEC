package com.company;

public class Main {

    public static void main(String[] args) {

        int resp = somaN(3);
        System.out.println(resp);

    }


    public static int somaN(int n) {
        int soma=0, parcela,contador;
        for (contador=0, parcela=1;contador < n;contador++){
            soma +=parcela;
            parcela++;
        }
        return soma;
    }

    public static int somaP(int n) {
        int parcela = 1, soma = 0, contador=0;
        do {
            soma += parcela++;
            contador++;
        } while (contador < n);
        return soma;
    }
}
