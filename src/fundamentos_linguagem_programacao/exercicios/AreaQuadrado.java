package fundamentos_linguagem_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double lado, area;
        System.out.println("Digite o valor do lado do quadrado: ");
        lado = teclado.nextDouble();

        area = lado * lado;

        System.out.printf("A área do quadrado é igual a: %.2f\n", area);
        System.out.println("Fórmula usada: a = l x l -> área = lado x lado");


    }
}
