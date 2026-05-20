package fundamentos_linguagem_programacao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Digite o valor da base do retângulo: ");
        base = teclado.nextDouble();

        System.out.println("Digite o valor da altura do retângulo: ");
        altura = teclado.nextDouble();

        area = base * altura;

        System.out.printf("A área do Retângulo é: %.2f\n", area);
        System.out.println("Fórmula: a = b x h -> área = base x altura");


    }
}
