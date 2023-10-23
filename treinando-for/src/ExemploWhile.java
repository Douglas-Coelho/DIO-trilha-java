//Exemplos de while usando random
/*Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, logo, 
enquanto o valor dos doces não igualar a R$ 50,00 ele foi adicionando itens no carrinho. */
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    
public static void main(String[] args){
    double mesada = 50.00;
    while(mesada > 0){
        double valorDoce = valorAleatorio();

        if (valorDoce > mesada){
            valorDoce = mesada;
        }
        System.out.println("Valor doce: " + valorDoce + ".Você adicionou ao carrinho");
        mesada = mesada - valorDoce;
    }

    System.out.println("Mesada = " + mesada);
    System.out.println("Você gastou toda a sua mesada em doce");
}

private static double valorAleatorio(){
    return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}