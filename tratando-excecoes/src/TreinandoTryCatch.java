import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TreinandoTryCatch {
    public static void main(String[] args) throws Exception {
        
        //Controle de fluxo
        try{
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
        catch(InputMismatchException e){
            System.out.println("Em altura e idade são permitidos apenas valores numéricos.");
        }
    }
}
