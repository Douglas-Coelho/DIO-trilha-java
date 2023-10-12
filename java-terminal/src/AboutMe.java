import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args) {
        // //os argumentos começam com indice 0
        // String nome = args [0];
        // String sobrenome = args [1];
        // int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        // double altura = Double.valueOf(args[3]);

        // System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        // System.out.println("Tenho " + idade + " anos ");
        // System.out.println("Minha altura é " + altura + "cm ");
        
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //criando objeto scanner

        System.out.println("Digite seu nome: "); //solicitanto as informações para o usuário
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        //imprindo as informações para o usuário

        System.out.println("Olá, meu nome é: " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Tenho " + altura + "cm de altura.");
    }
}
