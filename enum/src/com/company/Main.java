package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(FICHAS.VERMELHA + "=" + FICHAS.VERMELHA.getValor());
        System.out.println(FICHAS.AZUL + "=" + FICHAS.AZUL.getValor());
        System.out.println(FICHAS.VERDE + "=" + FICHAS.VERDE.getValor());
        FICHAS[] fichas = new FICHAS[]{FICHAS.AZUL,FICHAS.VERDE,FICHAS.AZUL};
        int total=0;
        for (FICHAS f: fichas){
            total +=f.getValor();

        }
        System.out.println(total);
    }
}
