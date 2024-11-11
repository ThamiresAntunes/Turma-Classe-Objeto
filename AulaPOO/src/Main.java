import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor(123,"João", "Ciência da Computação");
        Turma turma = new Turma(professor, "POO", "2M345", "ADS", 2);

        turma.adicionarAluno(new Aluno(1, "João", LocalDate.of(2002,9,4)));
        turma.adicionarAluno(new Aluno(2, "Maria", LocalDate.of(2004, 3,24)));
    }
}