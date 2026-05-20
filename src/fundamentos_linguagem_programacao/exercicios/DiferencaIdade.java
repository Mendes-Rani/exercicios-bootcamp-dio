package fundamentos_linguagem_programacao.exercicios;

import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome1, nome2;
        int idade1, idade2;
        System.out.println("Digite o nome da 1° pessoa: ");
        nome1 = teclado.next();
        System.out.println("Digite a idade da 1° pessoa: ");
        idade1 = teclado.nextInt();

        System.out.println("Digite o nome da 2° pessoa: ");
        nome2 = teclado.next();
        System.out.println("Digite a idade da 2° pessoa: ");
        idade2 = teclado.nextInt();

        int diferenca = Math.abs(idade1 - idade2);

        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + ", é de " + diferenca + " ano(s)");

    }
}
