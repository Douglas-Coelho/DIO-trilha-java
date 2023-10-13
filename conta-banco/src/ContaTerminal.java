import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite o número da sua conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o número da sua agencia: ");
        String agencia = sc.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Digite seu saldo em conta: ");
        double saldo = sc.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " Já está dispon878ível.");

    }
}
