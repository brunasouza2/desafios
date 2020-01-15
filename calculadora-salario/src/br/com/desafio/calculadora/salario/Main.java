package br.com.desafio.calculadora.salario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu salário bruto:");
        String salarioBruto = scanner.next();

        CalculadoraSalario calculadoraSalario = new CalculadoraSalario();
        int salarioLiquido = calculadoraSalario.calcularSalarioLiquido(Double.valueOf(salarioBruto));
        System.out.println("Seu salario líquido é: "+salarioLiquido);
    }
}
