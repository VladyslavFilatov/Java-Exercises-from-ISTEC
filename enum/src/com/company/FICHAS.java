package com.company;

public enum FICHAS {
    VERMELHA(10),
    VERDE(15),
    AZUL(20),
    PRATA(50),
    OURO(100);
    private int valor;
FICHAS(int v){
    this.valor=v;
    }

    public int getValor() {
        return valor;
    }
}
