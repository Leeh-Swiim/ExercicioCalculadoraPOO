package com.company.model;

public class Calcular {
    private double valor1;
    private double valor2;
    private double resultado;

    public void adicao(double valor1, double valor2){
        if (valor1>0&&valor2>0){
            resultado = valor1+valor2;
        }
        else {
            throw new IllegalArgumentException("Valor inválido.");
        }
    }

    public void subtracao(double valor1, double valor2){
        if (valor1>0&&valor2>0){
            resultado = valor1-valor2;
        }
        else {
            throw new IllegalArgumentException("Valor inválido.");
        }

    }

    public void multiplicacao (double valor1, double valor2){
        if (valor1>0&&valor2>0){
            resultado = valor1*valor2;
        }
        else {
            throw new IllegalArgumentException("Valor inválido.");
        }

    }

    public void divisao (double valor1, double valor2){
        if (valor1>0&&valor2>0){
            resultado = valor1/valor2;
        }
        else {
            throw new IllegalArgumentException("Valor inválido.");
        }
    }
    public double getResultado(){
        return resultado;
    }
}
