package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o Primeito Valor: ");
        a = scan.nextInt();

        System.out.println("Digite o Segundo Valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair (a, b);
        int multiplicar= multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println("somar: " + somar);
        System.out.println("subt: " + subtrair);
        System.out.println("mult: " + multiplicar);
        System.out.println("div: " + dividir);

    }

    private static int subtrair (int a, int b) {
        return a - b;
    }

    public static int somar (int a, int b){
        return a + b;
    }

    public static int multiplicar (int a, int b){
        return a * b;
    }
    public static float dividir (float a, float b){
        return a / b;
    }
}
