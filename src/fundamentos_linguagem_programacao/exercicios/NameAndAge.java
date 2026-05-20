package fundamentos_linguagem_programacao.exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String name;
        int nascimento;

        System.out.println("Qual é o seu nome?");
        name = teclado.next();
        System.out.println("Qual seu ano de nascimento?");
        nascimento = teclado.nextInt();

        int idade = LocalDate.now().getYear() - nascimento;
        System.out.printf("Olá %s, você tem %d anos.", name, idade);

    }
}
