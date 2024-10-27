import java.util.Scanner;

public class InicioCadastro {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Seja Bem-Vindo ao seu Controle Financeiro!");

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário líquido recebido:");
        Double salario = scanner.nextDouble();

        Usuario usuario = new Usuario(nome, salario);
        Calculadora.calcularGastos(usuario);

        scanner.close();
    }
}
