package Encapsulamento;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setFuncao("Programador júnior");
        f1.setMat(12345);
        f1.setNome("Roberto Carlos");
        f1.setSalario(2000.00);
        System.out.println("O funcionário "+ f1.getNome()+" tem o salário de R$" +f1.getSalario());
        System.out.println(f1.toString());
    }
}
