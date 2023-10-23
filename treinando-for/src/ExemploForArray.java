public class ExemploForArray {
    public static void main(String[] args){
        String alunos[] = {"Douglas", "Ramon", "Albert", "Victor", "Rodrigo"};

        for(int i = 0; i < alunos.length; i++){
            System.out.println("O aluno " + alunos[i] + " está na posição x= " + i);
        }
    }
}
