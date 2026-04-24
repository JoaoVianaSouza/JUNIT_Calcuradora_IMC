package org.uerj.teste.qualidade.software;

import java.util.Scanner;

public class CalcularIMC {

    public static double calcular(double peso, double altura) {
        if (altura <= 0) return 0;
        return peso / (altura * altura);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu Peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua Altura: ");
        double altura = scanner.nextDouble();

        double imc = calcular(peso, altura);

        String categoria = categorizar(imc);

        System.out.printf("Seu IMC é: %.2f%n", imc);
        System.out.println("Classificação: " + categoria);

        scanner.close();
    }

    public static String categorizar(double imc) {
        if (imc < 18.5) return "Magreza";
        if (imc <= 24.9) return "Normal";
        if (imc <= 29.9) return "Sobrepeso";
        if (imc <= 34.9) return "Obesidade grau I";
        if (imc <= 39.9) return "Obesidade grau II";
        return "Obesidade grau III";
    }
}