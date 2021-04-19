package com.company;

import java.text.DecimalFormat;

public class Dados {
    private String nome;
    private double peso;
    private double altura;
    DecimalFormat numeroFormatado = new DecimalFormat("00.00");

    public Dados(){
    }

    public Dados(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    String calculaImc(){
        double resultado = (peso / (Math.pow(altura, 2)));
        return numeroFormatado.format(resultado);
    }
    @Override
    public String toString() {
        return
                " Nome -> " + nome + " " + "Imc -> " + calculaImc() + "\n";
    }
}
