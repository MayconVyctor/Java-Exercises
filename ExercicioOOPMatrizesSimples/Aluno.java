package ExercicioOOPMatrizesSimples;

public class Aluno {
    private String nome;
    private double nota;
    private String[] cursos;
    private int quantidadeCursos = 0;

    public Aluno(String nome, double nota, String[] cursosIniciais) {
        this.nome = nome;
        this.nota = nota;
        this.cursos = new String[10];

        for (String curso : cursosIniciais) {
            if (quantidadeCursos < cursos.length) {
                cursos[quantidadeCursos++] = curso;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String[] getCursos() { return cursos; }



    public void addCurso (String curso) {
        if (quantidadeCursos < cursos.length) {
            cursos[quantidadeCursos++] = curso;
        }
    }
}
