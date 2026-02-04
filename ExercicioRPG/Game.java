package ExercicioRPG;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        ArrayList<Characterer> personagens = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== RPG SIMPLES ===");
            System.out.println("1. Criar Guerreiro");
            System.out.println("2. Criar Feiticeiro");
            System.out.println("3. Criar Caçador");
            System.out.println("4. Listar Personagens");
            System.out.println("5. Executar Ação");
            System.out.println("6. Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Guerreiro: ");
                    String nomeG = sc.nextLine();
                    Warrior g = new Warrior(nomeG, 1, 0, 100, 20, 15, 18, 16);
                    personagens.add(g);
                    System.out.println("Guerreiro criado!");
                    break;

                case 2:
                    System.out.print("Nome do Feiticeiro: ");
                    String nomeF = sc.nextLine();
                    Sorcerer f = new Sorcerer(nomeF, 1, 0, 80, 12, 8, 25, 100);
                    personagens.add(f);
                    System.out.println("Feiticeiro criado!");
                    break;

                case 3:
                    System.out.print("Nome do Caçador: ");
                    String nomeC = sc.nextLine();
                    Hunter c = new Hunter(nomeC, 1, 0, 90, 18, 10, 22, 18);
                    personagens.add(c);
                    System.out.println("Caçador criado!");
                    break;

                case 4:
                    if (personagens.isEmpty()) {
                        System.out.println("Nenhum personagem.");
                    } else {
                        for (int i = 0; i < personagens.size(); i++) {
                            Characterer p = personagens.get(i);
                            String tipo = "";
                            if (p instanceof Warrior) tipo = "Guerreiro";
                            else if (p instanceof Sorcerer) tipo = "Feiticeiro";
                            else if (p instanceof Hunter) tipo = "Caçador";
                            System.out.println((i+1) + ". " + p.getName() + " (" + tipo + ") - Vida: " + p.getLife());
                        }
                    }
                    break;

                case 5:
                    if (personagens.isEmpty()) {
                        System.out.println("Crie personagens primeiro!");
                        break;
                    }

                    for (int i = 0; i < personagens.size(); i++) {
                        System.out.println((i+1) + ". " + personagens.get(i).getName());
                    }
                    System.out.print("Escolha quem vai agir (número): ");
                    int atorIndex = sc.nextInt() - 1;
                    sc.nextLine();

                    if (atorIndex < 0 || atorIndex >= personagens.size()) {
                        System.out.println("Inválido.");
                        break;
                    }

                    Characterer ator = personagens.get(atorIndex);
                    if (ator.getLife() <= 0) {
                        System.out.println("Personagem morto!");
                        break;
                    }

                    // Mostra alvos
                    for (int i = 0; i < personagens.size(); i++) {
                        System.out.println((i+1) + ". " + personagens.get(i).getName());
                    }
                    System.out.print("Escolha o alvo (número): ");
                    int alvoIndex = sc.nextInt() - 1;
                    sc.nextLine();

                    if (alvoIndex < 0 || alvoIndex >= personagens.size()) {
                        System.out.println("Alvo inválido.");
                        break;
                    }

                    Characterer alvo = personagens.get(alvoIndex);

                    System.out.println("\nAções:");
                    System.out.println("1. Atacar");
                    if (ator instanceof Healer) System.out.println("2. Curar");
                    if (ator instanceof Inspirer) System.out.println("3. Inspirar");
                    if (ator instanceof Spellcaster) System.out.println("4. Conjurar");
                    if (ator instanceof Observer) System.out.println("5. Observar");

                    System.out.print("Escolha a ação: ");
                    int acao = sc.nextInt();
                    sc.nextLine();

                    // Executa ação
                    switch (acao) {
                        case 1:
                            ator.attack(alvo);
                            break;
                        case 2:
                            if (ator instanceof Healer) {
                                ((Healer) ator).healing(alvo);
                            }
                            break;
                        case 3:
                            if (ator instanceof Inspirer) {
                                ((Inspirer) ator).inspirit(alvo);
                            }
                            break;
                        case 4:
                            if (ator instanceof Spellcaster) {
                                ((Spellcaster) ator).conjure(alvo);
                            }
                            break;
                        case 5:
                            if (ator instanceof Observer) {
                                ((Observer) ator).observe(alvo);
                            }
                            break;
                        default:
                            System.out.println("Ação inválida.");
                    }
                    break;

                case 6:
                    rodando = false;
                    System.out.println("Fim do jogo.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}