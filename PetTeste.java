package Encapsulamento;

import java.util.Scanner;

public class PetTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pet p1 = new Pet();
        System.out.println("Informe o nome do seu pet: ");
        p1.setNome(entrada.nextLine());
        System.out.println("Informe a raça do seu pet: ");
        p1.setRaca(entrada.nextLine());
        System.out.println("Informe a idade do seu pet: ");
        p1.setIdade(entrada.nextInt());

        Pet p2 = new Pet();
        p2.setNome(entrada.nextLine());
        System.out.println("Informe o nome do seu outro pet: ");
        p2.setNome(entrada.nextLine());
        System.out.println("Informe a raça do seu pet: ");
        p2.setRaca(entrada.nextLine());
        System.out.println("Informe a idade do seu pet: ");
        p2.setIdade(entrada.nextInt());
        System.out.println(p2.toString());
        System.out.println(p1.toString());

    }
}
