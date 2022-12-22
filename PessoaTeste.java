package Encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa a1 = new Pessoa();
        a1.setNome("Sávio");
        a1.setSobrenome("Rodrigues");
        System.out.println(a1.getNome());
        System.out.println(a1);
    }
}
