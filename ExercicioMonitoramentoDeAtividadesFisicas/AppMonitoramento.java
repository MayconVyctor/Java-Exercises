package ExercicioMonitoramentoDeAtividadesFisicas;

import java.time.LocalDate;
import java.util.Scanner;

public class AppMonitoramento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Usuario usuario = null;

        while (true) {
            System.out.println("\n=== App de Atividades Físicas ===");
            System.out.println("1. Criar perfil");
            System.out.println("2. Definir meta");
            System.out.println("3. Registrar treino");
            System.out.println("4. Ver progresso");
            System.out.println("5. Ver Plano de Treino");
            System.out.println("6. Sair");

            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    input.nextLine();

                    System.out.print("Nome: ");
                    String nome = input.nextLine();

                    System.out.print("Idade: ");
                    int idade = input.nextInt();

                    System.out.print("Peso (kg): ");
                    double peso = input.nextDouble();

                    if (Validador.nomeValido(nome) && Validador.idadeValida(idade) && Validador.pesoValido(peso)) {
                        usuario = new Usuario(nome, idade, peso);
                        System.out.println("Perfil criado com sucesso!");
                    } else {
                        System.out.println("Dados inválidos!");
                    }
                    break;

                case 2:
                    if (usuario == null) {
                        System.out.println("Crie um perfil primeiro");
                        break;
                    }
                    System.out.print("Meta diária de calorias: ");
                    double valorMeta = input.nextDouble();

                    Meta meta = new Meta(Meta.TipoMeta.CALORIAS_DIARIAS, valorMeta);
                    usuario.definirMeta(meta);
                    System.out.println("Meta definida!");
                    break;

                case 3:
                    if (usuario == null || usuario.getMeta() == null) {
                        System.out.println("Crie um perfil e defina uma meta primeiro");
                        break;
                    }
                    System.out.print("Nome do exercício: ");
                    input.nextLine();

                    String nomeEx = input.nextLine();
                    System.out.print("Duração (minutos): ");

                    int duracao = input.nextInt();
                    System.out.print("Categoria (cardio / forca / flexibilidade / equilibrio): ");
                    String categoria = input.next();

                    Exercicio exercicio = new Exercicio(nomeEx, duracao, categoria);
                    Treino treino = new Treino(LocalDate.now());
                    treino.adicionarExercicio(exercicio);
                    usuario.getHistorico().adicionarTreino(treino);
                    System.out.println("Treino registrado, Calorias: " + exercicio.getCaloriasEstimadas());
                    break;

                case 4:
                    if (usuario == null || usuario.getMeta() == null) {
                        System.out.println(" Nenhuma meta definida.");
                        break;
                    }
                    Progresso progresso = new Progresso(usuario.getMeta(), usuario.getHistorico());
                    double percentual = progresso.getPercentualConcluido();
                    System.out.printf("Progresso: %.1f%%\n", percentual);
                    if (progresso.MetaAtingida()) {
                        System.out.println("Parabéns, Você atingiu sua meta hoje");
                    }
                    break;

                case 5:
                    PlanoTreinamento plano = new PlanoTreinamento("Iniciante");
                    plano.adicionarExercicioSugerido(new Exercicio("Caminhada", 30, "cardio"));
                    plano.adicionarExercicioSugerido(new Exercicio("Agachamento", 15, "forca"));

                    System.out.println("Plano: " + plano.getNome());
                    for (Exercicio ex : plano.getExerciciosSugeridos()) {
                        System.out.println("- " + ex.getNome() + " (" + ex.getDuracaoMinutos() + " min, "
                                + ex.getCategoria() + ", " + ex.getCaloriasEstimadas() + " cal)");
                    }
                    break;

                case 6:
                    System.out.println("Sair");

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}