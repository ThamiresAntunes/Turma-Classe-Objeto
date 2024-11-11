import java.util.Arrays;

public class Turma {
    private Professor professor;
    private Aluno alunos[]; //private Aluno[] alunos;
    private String disciplina;
    private String horario;
    private String curso;
    private int sala;
    private int contAlunos;

    public Turma(Professor professor, String disciplina, String horario, String curso, int sala){
        this.professor = professor;
        alunos = new Aluno[20];
        contAlunos = 0;
        this.disciplina = disciplina;
        this.horario = horario;
        this.curso = curso;
        this.sala = sala;
    }

    public boolean adicionarAluno(Aluno aluno){
        if(contAlunos >= alunos.length){
            return false;
        }
        else{
            //alunos[contAlunos++] = aluno;
            alunos[contAlunos] = aluno;
            contAlunos++;
            return true;
        }
    }


}
