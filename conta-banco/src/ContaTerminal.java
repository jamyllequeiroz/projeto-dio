import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Atributos (valores iniciais fornecidos como exemplo)
        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para criar a conta, forneça as informações abaixo.");

        // Solicita o número da conta
        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();
        // Consome a nova linha deixada pelo nextInt()
        scanner.nextLine();

        // Solicita a agência
        System.out.print("Digite o número da agência: ");
        agencia = scanner.nextLine();

        // Solicita o nome do cliente
        System.out.print("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        // Solicita o saldo
        System.out.print("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();
        // Consome a nova linha deixada pelo nextDouble()
        scanner.nextLine();

        // Fecha o scanner
        scanner.close();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}
