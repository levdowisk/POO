package Areas;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = input.nextDouble();

        double area = Math.pow(lado, 2);
        System.out.printf("Área do quadrado: %.2f\n", area);

        input.close();
    }
}
