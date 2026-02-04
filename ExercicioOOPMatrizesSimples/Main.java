package ExercicioOOPMatrizesSimples;

public class Main {
    public static void main(String[] args) {
        Universidade universidade = new Universidade();

        Aluno luSilva = new Aluno("Lu Silva", 1, new String[]{"Logica "});
        Aluno mayconVyctor = new Aluno("Maycon Vyctor", 3, new String[]{"programação 2 ", "Sistemas operacionais 2 "});
        Aluno liviaFerraz = new Aluno("Livia Ferraz", 2, new String[]{"Algebra Linear ", "banco de dados1 "});

        universidade.addAluno(luSilva);
        universidade.addAluno(mayconVyctor);
        universidade.addAluno(liviaFerraz);

        mayconVyctor.addCurso("Algebra Linear");
        liviaFerraz.setNota(10);

        System.out.println("Alunos em 'Algebra Linear':");
        String[] alunosAlgebra = universidade.filter("Algebra Linear");
        for (String nome : alunosAlgebra) {
            System.out.println(nome);
        }

        System.out.println("\nTodos os alunos:");
        universidade.listarTodos();
    }
}


