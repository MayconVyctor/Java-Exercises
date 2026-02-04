package ExercicioOOPMatrizesSimples;

public class Universidade {
    private Aluno[] alunos;
    private int indice = 0;

    public Universidade() {
        this.alunos = new Aluno[100];
    }

    public void addAluno(Aluno a) {
        if (indice < alunos.length) {
            alunos[indice++] = a;
        }
    }
    public String[] filter(String curso) {
        int count = 0;
        for (int i = 0; i < indice; i++) {
            Aluno a = alunos[i];
            // Verifica cada um dos 3 cursos
            if (curso.equals(a.getCursos()[0]) ||
                    curso.equals(a.getCursos()[1]) ||
                    curso.equals(a.getCursos()[2])) {
                count++;
            }
        }

        String[] resultado = new String[count];
        int pos = 0;
        for (int i = 0; i < indice; i++) {
            Aluno a = alunos[i];
            if (curso.equals(a.getCursos()[0]) ||
                    curso.equals(a.getCursos()[1]) ||
                    curso.equals(a.getCursos()[2])) {
                resultado[pos++] = a.getNome();
            }
        }

        return resultado;
    }

    public void listarTodos() {
        for (int i = 0; i < indice; i++) {
            Aluno a = alunos[i];
            System.out.println("Nome: " + a.getNome());
            System.out.println(", Nota: " + a.getNota());
            System.out.print(", Curso: ");

            for (int j = 0; j < 3; j++) {
                if (a.getCursos()[j] != null) {
                    if (j > 0 && a.getCursos()[j-1] != null) {
                        System.out.print(", ");
                    }
                    System.out.println(a.getCursos()[j]);
                }
            }
        }
    }
}
