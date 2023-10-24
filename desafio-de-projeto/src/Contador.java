import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch(ParametrosInvalidosException e) {
            System.out.println("O parâmetro dois deve ser maior que o parâmetro um.");
        }
        

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException("Teste");
        }
        

        int contagem = parametroDois - parametroUm;

        for(int contador = 1; contador <= contagem; contador++){
            System.out.println("Imprimindo o número: "+ contador);
        }
    }
}