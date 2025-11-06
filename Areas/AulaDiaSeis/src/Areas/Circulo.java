package Areas;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = input.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Área do círculo: %.2f\n", area);

        input.close();
    }
}
