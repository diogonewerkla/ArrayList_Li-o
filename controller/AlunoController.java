package controller;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;

public class AlunoController {
    private List<Aluno> listaAlunos;

    public AlunoController(){
        listaAlunos = new ArrayList();
    } 
    public void setAluno(Aluno a){
        listaAlunos.add(a);
    }
    public Aluno getAluno(int index){
        return listaAlunos.get(index);
    }
    public String mostrarAlunos(){
        StringBuilder sb = new StringBuilder();
        for(Aluno a:listaAlunos){
            sb.append(a.toString()+"\n");
        }
        return sb.toString();
    }

    public void removerAluno(int index){
        listaAlunos.remove(index);
    }

    public void localizarAluno(int matricula){
        for(Aluno aluno:listaAlunos){
            if(aluno.getMatricula() == matricula){
                System.out.println(listaAlunos.indexOf(aluno)); 
            }
        }
    }

    public void limparLista(){
        listaAlunos.clear();
    }

    public void viradaSemestre(){
        for(Aluno aluno: listaAlunos){
            aluno.setCiclo(aluno.getCiclo()+1);
        }
    }
}