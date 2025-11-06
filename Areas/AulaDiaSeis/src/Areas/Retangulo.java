package Areas;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = input.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = input.nextDouble();

        double area = base * altura;
        System.out.printf("Área do retângulo: %.2f\n", area);

        input.close();
    }
}