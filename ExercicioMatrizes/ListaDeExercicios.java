package academy.devdojo.maratonajava.introducao.ExercicioMatrizes.Condicionais;

import java.util.Scanner;

public class ListaDeExercicios {
    public static void main(String[] args) {
        //temperaturaSemanal();
        acharPonteSequencia();
        //calculoDeCustoSemestral();
    }

    public static void temperaturaSemanal() {
        Scanner entrada = new Scanner(System.in);
        String[] diasSemana =  {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};
        float[] temperaturalSemanal = new  float[7];
        float somaMedia = 0;
        float maiorTemperatura = 0;
        float menorTemperatura = 0;

        for(int i = 0; i < 7; i++){
            System.out.println("Digite a temperatura de "+ diasSemana[i] +":");
            temperaturalSemanal[i] = entrada.nextFloat();
            somaMedia += temperaturalSemanal[i];

            if(i==0){
                maiorTemperatura = temperaturalSemanal[i];
                menorTemperatura = temperaturalSemanal[i];
            }

            if(temperaturalSemanal[i] > maiorTemperatura){
                maiorTemperatura = temperaturalSemanal[i];
            }
            if(temperaturalSemanal[i] < menorTemperatura){
                menorTemperatura = temperaturalSemanal[i];
            }
        }

        float media = somaMedia/7;
        System.out.println("----Resultado----");
        System.out.println("Temperatura mais alta: "+maiorTemperatura);
        System.out.println("Temperatura menor: "+menorTemperatura);
        System.out.println("Temperatura media: "+media);
    }

    public static void acharPonteSequencia() {
        Scanner scanner = new Scanner(System.in);
        int entradaUsuario = scanner.nextInt();
        scanner.close();

        boolean achouSequencia = false;

        // Começamos do primeiro número da sequência: 1, 2, 3...
        for (int inicio = 1; inicio < entradaUsuario; inicio++) {
            int soma = 0;

            // Tentamos formar uma sequência a partir de 'inicio'
            for (int atual = inicio; soma < entradaUsuario; atual++) {
                soma += atual;

                if (soma == entradaUsuario) {
                    achouSequencia = true;
                    break;
                }
            }

            if (achouSequencia) break; // Se já achou uma, pode parar
        }

        if (achouSequencia) {
            System.out.println("Ponte Aberta");
        } else {
            System.out.println("Ponte Fechada");
        }
    }

    public static void calculoDeCustoSemestral(){
        System.out.println("Informe seu nome : ");
        Scanner nomeCandidato = new Scanner(System.in);
        String nome = nomeCandidato.nextLine();

        System.out.println("Informe a faculdade escolhida: ");
        Scanner faculdadeEscolhida = new Scanner(System.in);
        String faculdade = faculdadeEscolhida.nextLine();

        int mensalidade;
        int custoMatricula;
        int custoTotal = 0;

        if(faculdade.equals("Eng. de Sistemas")){
            mensalidade = 650;
            custoMatricula = 350;
            mensalidade *=6;
            custoTotal = custoMatricula + mensalidade;
        }
        if(faculdade.equals("Direito")){
            mensalidade = 550;
            custoMatricula = 350;
            mensalidade *=6;
            custoTotal = custoMatricula + mensalidade;
        }
        if(faculdade.equals("Eng. de Navegação")){
            mensalidade = 500;
            custoMatricula = 310;
            mensalidade *=6;
            custoTotal = custoMatricula + mensalidade;
        }
        if(faculdade.equals("Eng. de Pesca")){
            mensalidade = 440;
            custoMatricula = 210;
            mensalidade *=6;
            custoTotal = custoMatricula + mensalidade;
        }
        if(faculdade.equals("Contabilidade")){
            mensalidade = 500;
            custoMatricula = 400;
            mensalidade *=6;
            custoTotal = custoMatricula + mensalidade;
        }
        if(faculdade.equals("Administração")){
            mensalidade = 620;
            custoMatricula = 760;
            mensalidade *=6;
            custoTotal = custoMatricula + mensalidade;
        }

        System.out.println("O custo total do semestre para "+nome+ " em " +faculdade+ " é: " +custoTotal);
    }

}
