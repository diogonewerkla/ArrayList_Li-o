import controller.AlunoController;
import model.Aluno;

public class MainAluno {
    public static void main (String[] args){
        AlunoController ac = new AlunoController();
        Aluno a1 = new Aluno(10, "Ale", "DSM", 5);
        ac.setAluno(a1);
        ac.setAluno(new Aluno(40, "Enzo", "ADS", 3));
        ac.setAluno(new Aluno(20, "Diogo", "DSM", 2));
        ac.setAluno(new Aluno(80, "Arni", "COMEX", 2));
        
        System.out.println(ac.getAluno(2));

        System.out.println(ac.mostrarAlunos());

        ac.removerAluno(3);

        System.out.println(ac.mostrarAlunos());

        ac.localizarAluno(20);

        ac.viradaSemestre();
        System.out.println(ac.mostrarAlunos());

        ac.limparLista();
        System.out.println(ac.mostrarAlunos());

    }
}