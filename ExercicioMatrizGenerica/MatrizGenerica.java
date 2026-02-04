package ExercicioMatrizGenerica;


public class MatrizGenerica {
    private String[][] grade;
    private int n;

    public MatrizGenerica(int tamanho, String[] valores) {
        this.n = tamanho;
        this.grade = new String[n][n];
        int posicao = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grade[i][j] = valores[posicao];
                posicao++;
            }
        }
    }

    public void mostrarOriginal() {
        System.out.println("Matriz Original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grade[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mostrarDiagonal() {
        System.out.print("Diagonal Principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(grade[i][i] + " ");
        }
        System.out.println();
    }

    public void mostrarTransposta() {
        System.out.println("Matriz Transposta:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(grade[i][j] + " ");
            }
            System.out.println();
        }
    }
}