
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Por favor, digite o número da Conta: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = sc.nextLine();
            System.out.print("Por favor, digite seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Por favor, digite seu saldo inicial: ");
            double saldo = sc.nextDouble();
            
            StringBuilder sb = new StringBuilder();
            
            sb.append("Olá, ").append(nome)
                    .append(" obrigado por criar uma conta em nosso banco, sua agência é ").append(agencia)
                    .append(", conta ").append(numero)
                    .append(" e seu saldo ").append(saldo).append(" já está disponível");
            System.out.print(sb);
        }
    }
}
