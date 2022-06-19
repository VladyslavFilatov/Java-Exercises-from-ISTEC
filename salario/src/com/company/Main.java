package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("SB");
        Scanner leitor = new Scanner(System.in);
        float salbruto = leitor.nextFloat();
        float salLiquido = salario(salbruto);//argumento
        System.out.println("O salario liquido é:" + salLiquido);
    }

    public static float salario(float sb) {//parametros
        float sl = 0.0f, tx = 0.0f;
        if (sb > 0) {
            if (sb < 1000) tx = 0.10f;
            else {
                if (sb < 1500) tx = 0.15f;
                else {
                    if (sb < 2000) tx = 0.25f;
                    else tx = 0.30f;
                }
            }
            sl = sb * (1 - tx);
            return sl;
        } else {
            sl = -1.0f;
        }
        return sl;
    }
}