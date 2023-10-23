public class ExemploForEach {
    public static void main(String[] args){
        String aluno[] = {"Douglas", "Thayane", "Caio", "Rodolfo"};

        for(String novo : aluno){
            System.out.println("O novo aluno se chama: " + novo);
        }
    }
}
