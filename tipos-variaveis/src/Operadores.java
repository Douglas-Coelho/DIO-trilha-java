public class Operadores {
    
    public static void main(String[] args){

        //String nomeCompleto = "LINGUAGEM" + "JAVA";

        //System.out.println(nomeCompleto);

        //String concatenacao ="?";
        
        //OBSERVAÇÃO: A PARTIR DO MOMENTO EM QUE A CONCATENAÇÃO COMEÇA COM UMA STRING NÃO SE PODE MAIS REALIZAR OPERAÇÕES MATEMÁTICAS, POR ISSO ALGUNS DOS EXEMPLOS
        //ONDE SE COMEÇA CONTATENANDO UMA STRING ACABA RETORNANDO O RESULTADO 1111. UMA EXCEÇÃO É SE OS NÚMEROS ESTIVEREM EM EVIDÊNCIA (), AÍ PODE-SE INICIAR COMA  STRING
        //QUE TUDO APÓS SERÁ CALCULADO.

        //concatenacao = 1+1+1+"1";
        
        //System.out.println(concatenacao);

        //concatenacao = 1+"1"+1+1;

        //System.out.println(concatenacao);

        //concatenacao = 1+"1"+1+"1";

        //System.out.println(concatenacao);

        //concatenacao = "1"+1+1+1;

        //System.out.println(concatenacao);

        //concatenacao = "1"+(1+1+1);

        //OPERADORES TERNÁRIOS

        /*int a, b;

        a = 5;
        b = 6;

        /*EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        String resultado = " ";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
            
        System.out.println(resultado);

        String resultado = a==b ? "Verdadeiro" : "Falso"; //apenas para expressões booleanas

        System.out.println(resultado);*/
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        //equals na parada
        //Equals ele compara conteúdos, ou seja, para númerosé mais interessante utilizar operadores condicionais e para objetos utilizar o "equals".
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??
    }
}
