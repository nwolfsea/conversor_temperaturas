package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);

        double numero;
        System.out.println("Digite uma temperatura em Celsius");
        numero = capture.nextInt();

        double f = numero * 1.8 + 32;
        System.out.println(f);

        double k = numero + 273.15;
        System.out.println(k);

        double re = numero * 0.8;
        System.out.println(re);

        double ra = numero * 1.8 + 32 + 459.67;
        System.out.println(ra);

    }
}
