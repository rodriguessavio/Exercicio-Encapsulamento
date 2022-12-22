package Encapsulamento;

import java.util.Scanner;

public class VeiculoTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Veiculo v1 = new Veiculo();

        System.out.println("Informe o modelo do carro: ");
        v1.setModelo(entrada.nextLine());

        System.out.println("Informe a cor do carro: ");
        v1.setCor(entrada.nextLine());

        System.out.println("Informe o ano do carro: ");
        v1.setAno(entrada.nextInt());

        System.out.println(v1.toString());

    }
}
