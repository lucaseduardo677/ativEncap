package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo c = new Circulo(0);

        while (true) {
            System.out.println("--Digite 0 para sair--");
            System.out.print("Raio: ");
            double r = sc.nextDouble();

            if (r == 0) {
                break;
            }

            c.setRaio(r);
            double area = c.calcularArea();
            double perim = c.calcularPerimetro();

            System.out.println("Resultado:");
            System.out.println("Area: " + area);
            System.out.println("Perimetro: " + perim);
            System.out.println();
        }
        sc.close();
    }
}