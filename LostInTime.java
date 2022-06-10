package LostInTime;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Collections;

public class LostInTime {
    
    // Variavel Global
    int pontuacaoFinal = 0;
    Scanner entrada = new Scanner(System.in);
    String nome = "";
    
    // Declarando a listas de alternativas
    static ArrayList<String> lista1 = new ArrayList<>();
    static ArrayList<String> lista2 = new ArrayList<>();
    static ArrayList<String> lista3 = new ArrayList<>();
    static ArrayList<String> lista4 = new ArrayList<>();
    static ArrayList<String> lista5 = new ArrayList<>();
    static ArrayList<String> lista6 = new ArrayList<>();
    
    public static void main(String[] args) {

        LostInTime Jogar = new LostInTime();
        Jogar.Menu(); //Iniciando Menu

    }
    
    public void Menu(){
        int escolha;

        do {
            System.out.println("\nLost In Time\n");

            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");

            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    Instrucoes();// Iniciando método de intruções
                    break;
                case 2:
                    IniciarJogo();// Iniciando método para iniciar o jogo.
                    break;
                case 3:
                    Creditos();// Iniciando método para mostrar os créditos
                    break;
            }
        } while (escolha != 4);
        System.out.println("Você saiu do jogo com sucesso!"); // Sair do jogo
    }
    
    public void Instrucoes(){
        System.out.println("Instruções \n"
        + "O jogo Lost in time é um RPG textual onde o jogador terá que responder a perguntas para dar continuidade à história. \n"
        + "Cada pergunta feita dentro do jogo leva o jogo a uma decisão diferente e interferindo diretamente na história do jogo.\n"
        + "As perguntas podem ser respondidas basicamente com números, letras ou frases.Dito isso você encontra dificuldades mais altas a cada nível que você avança,\n"
        + "dificultando ainda mais as perguntas e fazendo com que você pense mais em qual resposta será dada.");
        Menu();
    }

    public void IniciarJogo() {
        Scanner entrada = new Scanner(System.in);
        int resposta = 0;
        
        // Introdução
        System.out.println("Oi, olá!\n"
                + "É um prazer conhece-lo! Bem-vindo ao fabuloso mundo POKÉMON, meu nome é Takeo e sou o principal professor Pokémon da região de Santo Amaro.\n"
                + "Mas primeiro me conte mais sobre você...\n");
        
        // Informações do usuário
        System.out.println("Como se chama?\n");
        nome = entrada.nextLine();

        // Começo do jogo
        System.out.println("\nCerto você é o " + nome + ". Seja bem-vindo ao mundo Poké...\n");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("BRAAAUFSUBFAIOZFA!!!!\n");
        System.out.println("Um barulho pela janela, você larga o vídeo game para ver o que é e percebe que vem de um galpão abandonado.\n");

        String data = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());

        System.out.println("TV - Noticia urgente hoje no dia " + data
                + "\nalgo surreal aconteceu todos os computadores estão parando de funciona... PIIIIIIIIIIII (sinal da tv também cai).\n");
        System.out.println("Ir investigar a explosão?\n");
        System.out.println("1 - Investigar");
        System.out.println("2 - Ir dormir\n");

        resposta = entrada.nextInt();
        if (resposta != 1) { //Forçando o usuário a escolher a opção correta para começar o jogo
            while (resposta != 1) {
                switch (resposta) {
                    case 2:
                        System.out.println("Tem certeza?\n");
                        resposta = entrada.nextInt();
                        break;
                    default:
                        System.out.println("Opção inválida!\n");
                        resposta = entrada.nextInt();
                        break;
                }
            }

            Investigar();

        } else {
            Investigar();
        }
    }

    public void Investigar() {
        int resposta = 0;

        System.out.println("Chegando ao galpão, " + nome + " decide entrar e se depara com...\n"
                + "Um senhor que estava desesperado. " + nome + " então decide fazer uma pergunta:\n");
        System.out.println(nome + ":");
        System.out.println("- Meu Deus, o que está acontecendo aqui!!?\n");
        System.out.println("PROFESSOR:");
        System.out.println("- Não está acontecendo nada. Saia daqui!\n");
        System.out.println("1 - Insistir");
        System.out.println("2 - Sair\n");
        resposta = entrada.nextInt();
        if (resposta == 1) {
            Insistir();
        } else if (resposta == 2) {
            int decisao_inicial;
            
            System.out.println("Tem certeza que deseja voltar e ignorar a situação?\n");
            System.out.println("<1> Sim");
            System.out.println("<2> Não\n");
            decisao_inicial = entrada.nextInt();
            switch (decisao_inicial) {
                case 1:
                    System.out.println(nome + " volta pra casa, ignora toda a situação... Após essa decisão,\n"
                            + "o senhor rompe o espaço tempo e condena toda a humanidade a escravidão e servidão eterna\n"
                            + " as máquinas.\n");
                    System.out.println("Fim de jogo!");
                    System.exit(0);
                    break;
                case 2:
                    Insistir();
                    break;
            }
        }else {
            System.out.println("Essa resposta não é válida!\n");
        }
    }

    public void Insistir() {

        System.out.println(nome + ":");
        System.out.println("- Não! Eu preciso saber o que está acontecendo.\n"
                + "Lá fora está um caos. Isso que você está fazendo tem a ver com essa loucura toda?\n");
        System.out.println("PROFESSOR:");
        System.out.println("- Sim, estava tentando realizar alguns projetos com a minha mais nova invenção a máquina do tempo,\n"
                + "mas infelizmente acabei causando diversos prejuízos no espaço tempo que acabaram afetando os avanços \n"
                + "tecnológicos, por isso que a tecnologia moderna está entrando em colapso.\n");
        System.out.println(nome + ":");
        System.out.println("- Mas e agora!? O que podemos fazer para reverter essa situação?\n");
        System.out.println("PROFESSOR:");
        System.out.println("- Temos que voltar no passado exatamente nas datas em que o espaço tempo foi alterado e reverter \n"
                + "essa situação, deixando tudo como era antes.\n");
        System.out.println("PROFESSOR:");
        System.out.println("- Porem estou lidando com um grande problema, como tenho uma idade muito avançada acho que não irei \n"
                + "suportar essa viagem no tempo. Será que você que é um jovem saudável e muito curioso poderia me ajudar?\n");
        System.out.println(nome + ":");
        System.out.println("- Claro que posso te ajudar, não posso ver uma situação dessa e não fazer alguma coisa para tentar arrumar essa bagunça!\n");
        System.out.println("PROFESSOR:");
        System.out.println("Que ótimo eu estaria perdido se você não estivesse aceitado. Porém tenho que te fazer uma pergunta,\n"
                + "você tem algum conhecimento em conceitos da computação?\n");
        System.out.println(nome + ":");
        System.out.println("- Sim tenho, aliás estudo em uma ótima escola de tecnologia que é o SENAC.\n");
        System.out.println("PROFESSOR:");
        System.out.println("- Ótimo, pelos meus cálculos por volta dessas épocas foram onde ocorreram os colapsos:\n");
        Eventos(); // Chamando método Eventos

    }

    public void Eventos() {

        System.out.println("<1> Surgimento do computador");
        System.out.println("<2> Transistores");
        System.out.println("<3> Tipos de memória");
        System.out.println("<4> Criação da memória RAM");
        System.out.println("<5> Portas lógicas");
        System.out.println("<6> Binário");
        System.out.println("<7> Retornar ao presente");

        System.out.println("\nPROFESSOR:");
        System.out.println("- Qual dessas épocas que eu citei você deseja começar para tentarmos reparar a linha do tempo?\n");

        int resposta = entrada.nextInt(); //Variável para armazenar decisão do jogador, sobre qual época ele vai querer responder as questões

        switch (resposta) { //Switch de verificação da reposta do usuário

            case 1:

                String resposta1 = "";
                int contador1 = 1;
                int n_tentativa1 = 3;
                System.out.println("Surgimento do Computador IAS (5 pontos)\n");

                do {
                    System.out.println("Você possui " + (n_tentativa1--) + " tentativas!\n");
                    System.out.println("Você chegou em 1946 no surgimento do computador IAS.\n"
                            + "Ajuda John von Neumann e seus colaboradores a terminar de projetar esse\n"
                            + "computador pioneiro!!!\n");
                    System.out.println("Qual a estrutura de um computador IAS (Industry Standard Architecture?\n");

                    PrimeiraAlt();

                    resposta1 = entrada.next();

                    String alternativa_correta = "Memória principal, CPU (unidade lógica e unidade de controle) e equipamentos ";
                    String resp;

                    switch (resposta1) {
                        case "A":
                        case "a":
                            resp = lista1.get(0);
                            if (resp.equals(alternativa_correta)) {
                                System.out.println("\nResposta correta! Você adquiriu 5 pontos!\n");
                                contador1 = 4;
                                n_tentativa1 = 1;
                                pontuacaoFinal = pontuacaoFinal + 5;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        case "B":
                        case "b":
                            resp = lista1.get(1);
                            if (resp.equals(alternativa_correta)) {
                                System.out.println("\nResposta correta! Você adquiriu 5 pontos!\n");
                                contador1 = 4;
                                n_tentativa1 = 1;
                                pontuacaoFinal = pontuacaoFinal + 5;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        case "C":
                        case "c":
                            resp = lista1.get(2);
                            if (resp.equals(alternativa_correta)) {
                                System.out.println("\nResposta correta! Você adquiriu 5 pontos!\n");
                                contador1 = 4;
                                n_tentativa1 = 1;
                                pontuacaoFinal = pontuacaoFinal + 5;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        case "D":
                        case "d":
                            resp = lista1.get(3);
                            if (resp.equals(alternativa_correta)) {
                                System.out.println("\nResposta correta! Você adquiriu 5 pontos!\n");
                                contador1 = 4;
                                n_tentativa1 = 1;
                                pontuacaoFinal = pontuacaoFinal + 5;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        case "E":
                        case "e":
                            resp = lista1.get(4);
                            if (resp.equals(alternativa_correta)) {
                                System.out.println("\nResposta correta! Você adquiriu 5 pontos!\n");
                                contador1 = 4;
                                n_tentativa1 = 1;
                                pontuacaoFinal = pontuacaoFinal + 5;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        default:
                            System.out.println("\nA alternativa selecionada não é válida!\n");
                            break;
                    }
                    switch (n_tentativa1) {
                        case 0:
                            System.out.println("\nTodas as alternativas foram utilizadas. Você não recebeu os 5 pontos.\n");
                            Eventos();
                    }

                    contador1++;
                    Collections.shuffle(lista1);
                } while (contador1 <= 3);
                Eventos();
            case 2:

                String resposta2 = "";
                int contador2 = 1;
                int n_tentativa2 = 3;

                System.out.println("Transistores (4 pontos)\n");

                do {
                    System.out.println("Você possui " + (n_tentativa2--) + " tentativas!\n");
                    System.out.println("Você está na década de 80 onde um grupo de jovens estão tentando montar\n"
                            + "uma nova placa mãe para um computador, porém eles esqueceram algo\n"
                            + "muito importante... do que é feito um transistor.\n");
                    System.out.println("Um transistor é...\n");

                    SegundaAlt();

                    resposta2 = entrada.next();

                    String alternativa_correta2 = "Composto de material semicondutor com pelo menos três terminais para conexão a um circuito externo";
                    String resp2;

                    switch (resposta2) {
                        case "A":
                        case "a":
                            resp2 = lista2.get(0);
                            if (resp2.equals(alternativa_correta2)) {
                                System.out.println("\nResposta correta! Você adquiriu 4 pontos!\n");
                                contador2 = 4;
                                n_tentativa2 = 1;
                                pontuacaoFinal = pontuacaoFinal + 4;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        case "B":
                        case "b":
                            resp2 = lista2.get(1);
                            if (resp2.equals(alternativa_correta2)) {
                                System.out.println("\nResposta correta! Você adquiriu 4 pontos!\n");
                                contador2 = 4;
                                n_tentativa2 = 1;
                                pontuacaoFinal = pontuacaoFinal + 4;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        case "C":
                        case "c":
                            resp2 = lista2.get(2);
                            if (resp2.equals(alternativa_correta2)) {
                                System.out.println("\nResposta correta! Você adquiriu 4 pontos!\n");
                                contador2 = 4;
                                n_tentativa2 = 1;
                                pontuacaoFinal = pontuacaoFinal + 4;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        case "D":
                        case "d":
                            resp2 = lista2.get(3);
                            if (resp2.equals(alternativa_correta2)) {
                                System.out.println("\nResposta correta! Você adquiriu 4 pontos!\n");
                                contador2 = 4;
                                n_tentativa2 = 1;
                                pontuacaoFinal = pontuacaoFinal + 4;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        case "E":
                        case "e":
                            resp2 = lista2.get(4);
                            if (resp2.equals(alternativa_correta2)) {
                                System.out.println("\nResposta correta! Você adquiriu 4 pontos!\n");
                                contador2 = 4;
                                n_tentativa2 = 1;
                                pontuacaoFinal = pontuacaoFinal + 4;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        default:
                            System.out.println("\nA alternativa selecionada não é válida!\n");
                            break;
                    }
                    switch (n_tentativa2) {
                        case 0:
                            System.out.println("\nTodas as alternativas foram utilizadas. Você não recebeu os 4 pontos.\n");
                            Eventos();
                    }

                    contador2++;
                    Collections.shuffle(lista2);

                } while (contador2 <= 3);
                Eventos();
            case 3:
                String resposta3 = "";
                int contador3 = 1;
                int n_tentativa3 = 3;

                System.out.println("Tipos de memória (4 pontos)\n");

                do {
                    System.out.println("Você possui " + (n_tentativa3--) + " tentativas!\n");
                    System.out.println("Você está na década de 70 e um jovem chamado Bill Gates está querendo\n"
                            + "projetar computadores. Ajude-o com a questão da memória.\n");
                    System.out.println("BILL GATES:");
                    System.out.println("Qual é a memória de 'armazenamento temporário'?\n");

                    TerceiraAlt();

                    resposta3 = entrada.next();

                    String alternativa_correta3 = "Memória RAM ";
                    String resp3;

                    switch (resposta3) {
                        case "A":
                        case "a":
                            resp3 = lista3.get(0);
                            if (resp3.equals(alternativa_correta3)) {
                                System.out.println("\nResposta correta! Você adquiriu 4 pontos!\n");
                                contador3 = 4;
                                n_tentativa3 = 1;
                                pontuacaoFinal = pontuacaoFinal + 4;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        case "B":
                        case "b":
                            resp3 = lista3.get(1);
                            if (resp3.equals(alternativa_correta3)) {
                                System.out.println("\nResposta correta! Você adquiriu 4 pontos!\n");
                                contador3 = 4;
                                n_tentativa3 = 1;
                                pontuacaoFinal = pontuacaoFinal + 4;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        case "C":
                        case "c":
                            resp3 = lista3.get(2);
                            if (resp3.equals(alternativa_correta3)) {
                                System.out.println("\nResposta correta! Você adquiriu 4 pontos!\n");
                                contador3 = 4;
                                n_tentativa3 = 1;
                                pontuacaoFinal = pontuacaoFinal + 4;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        case "D":
                        case "d":
                            resp3 = lista3.get(3);
                            if (resp3.equals(alternativa_correta3)) {
                                System.out.println("\nResposta correta! Você adquiriu 4 pontos!\n");
                                contador3 = 4;
                                n_tentativa3 = 1;
                                pontuacaoFinal = pontuacaoFinal + 4;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        case "E":
                        case "e":
                            resp3 = lista3.get(4);
                            if (resp3.equals(alternativa_correta3)) {
                                System.out.println("\nResposta correta! Você adquiriu 4 pontos!\n");
                                contador3 = 4;
                                n_tentativa3 = 1;
                                pontuacaoFinal = pontuacaoFinal + 4;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        default:
                            System.out.println("\nA alternativa selecionada não é válida!\n");
                            break;
                    }
                    switch (n_tentativa3) {
                        case 0:
                            System.out.println("\nTodas as alternativas foram utilizadas. Você não recebeu os 4 pontos.\n");
                            Eventos();
                    }

                    contador3++;
                    Collections.shuffle(lista3);

                } while (contador3 <= 3);
                Eventos();
            case 4:
                String resposta4 = "";
                int contador4 = 1;
                int n_tentativa4 = 3;

                System.out.println("Memória (3 pontos)\n");

                do {
                    System.out.println("Você possui " + (n_tentativa4--) + " tentativas!\n");
                    System.out.println("Ainda na década de 70, Bill Gates possui mais uma questão sobre memória.");
                    System.out.println("Analise as afirmações sobre memórias:\n ");
                    System.out.println("1. Parte do computador onde são armazenados programas e dados");
                    System.out.println("2. A unidade básica de memória o bit: 0 ou um 1");
                    System.out.println("3. O armazenamento das memorias é ilimitado");
                    System.out.println("4. Memórias consistem de células, cada uma das quais com informações\n");
                    System.out.println("Respectivamente, quais afirmações são verdadeiras e quais são falsas?\n");

                    QuartaAlt();
                    
                    resposta4 = entrada.next();
                    
                    String alternativa_correta4 = "VVFV ";
                    String resp4;

                    switch (resposta4) {
                        case "A":
                        case "a":
                            resp4 = lista4.get(0);
                            if (resp4.equals(alternativa_correta4)) {
                                System.out.println("\nResposta correta! Você adquiriu 3 pontos!\n");
                                contador4 = 4;
                                n_tentativa4 = 1;
                                pontuacaoFinal = pontuacaoFinal + 3;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        case "B":
                        case "b":
                            resp4 = lista4.get(1);
                            if (resp4.equals(alternativa_correta4)) {
                                System.out.println("\nResposta correta! Você adquiriu 3 pontos!\n");
                                contador4 = 4;
                                n_tentativa4 = 1;
                                pontuacaoFinal = pontuacaoFinal + 3;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        case "C":
                        case "c":
                            resp4 = lista4.get(2);
                            if (resp4.equals(alternativa_correta4)) {
                                System.out.println("\nResposta correta! Você adquiriu 3 pontos!\n");
                                contador4 = 4;
                                n_tentativa4 = 1;
                                pontuacaoFinal = pontuacaoFinal + 3;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        case "D":
                        case "d":
                            resp4 = lista4.get(3);
                            if (resp4.equals(alternativa_correta4)) {
                                System.out.println("\nResposta correta! Você adquiriu 3 pontos!\n");
                                contador4 = 4;
                                n_tentativa4 = 1;
                                pontuacaoFinal = pontuacaoFinal + 3;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        case "E":
                        case "e":
                            resp4 = lista4.get(4);
                            if (resp4.equals(alternativa_correta4)) {
                                System.out.println("\nResposta correta! Você adquiriu 3 pontos!\n");
                                contador4 = 4;
                                n_tentativa4 = 1;
                                pontuacaoFinal = pontuacaoFinal + 3;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        default:
                            System.out.println("\nA alternativa selecionada não é válida!\n");
                            break;
                    }
                    switch (n_tentativa4) {
                        case 0:
                            System.out.println("\nTodas as alternativas foram utilizadas. Você não recebeu os 3 pontos.\n");
                            Eventos();
                    }

                    contador4++;
                    Collections.shuffle(lista4);

                } while (contador4 <= 3);
                Eventos();
            case 5:

                String resposta5 = "";
                int contador5 = 1;
                int n_tentativa5 = 3;

                System.out.println("Portas lógicas (2 pontos)\n");

                do {
                    System.out.println("Você possui " + (n_tentativa5--) + " tentativas!\n");
                    System.out.println("Você está no século 18 nos primórdios da computação, um dos seus\n"
                            + " pioneiros é Charles Babbage, ajude ele a resolver\n"
                            + " uns problemas com a linguagem binária\n");
                    System.out.println("A expressão lógica S = A + B refere-se a qual porta lógica?\n");
                    
                    QuintaAlt();
                    
                    resposta5 = entrada.next();
                    
                    String alternativa_correta5 = "Porta lógica OR ";
                    String resp5;

                    switch (resposta5) {
                        case "A":
                        case "a":
                            resp5 = lista5.get(0);
                            if (resp5.equals(alternativa_correta5)) {
                                System.out.println("\nResposta correta! Você adquiriu 2 pontos!\n");
                                contador5 = 4;
                                n_tentativa5 = 1;
                                pontuacaoFinal = pontuacaoFinal + 2;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        case "B":
                        case "b":
                            resp5 = lista5.get(1);
                            if (resp5.equals(alternativa_correta5)) {
                                System.out.println("\nResposta correta! Você adquiriu 2 pontos!\n");
                                contador5 = 4;
                                n_tentativa5 = 1;
                                pontuacaoFinal = pontuacaoFinal + 2;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        case "C":
                        case "c":
                            resp5 = lista5.get(2);
                            if (resp5.equals(alternativa_correta5)) {
                                System.out.println("\nResposta correta! Você adquiriu 2 pontos!\n");
                                contador5 = 4;
                                n_tentativa5 = 1;
                                pontuacaoFinal = pontuacaoFinal + 2;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        case "D":
                        case "d":
                            resp5 = lista5.get(3);
                            if (resp5.equals(alternativa_correta5)) {
                                System.out.println("\nResposta correta! Você adquiriu 2 pontos!\n");
                                contador5 = 4;
                                n_tentativa5 = 1;
                                pontuacaoFinal = pontuacaoFinal + 2;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        case "E":
                        case "e":
                            resp5 = lista5.get(4);
                            if (resp5.equals(alternativa_correta5)) {
                                System.out.println("\nResposta correta! Você adquiriu 2 pontos!\n");
                                contador5 = 4;
                                n_tentativa5 = 1;
                                pontuacaoFinal = pontuacaoFinal + 2;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        default:
                            System.out.println("\nA alternativa selecionada não é válida!\n");
                            break;
                    }
                    switch (n_tentativa5) {
                        case 0:
                            System.out.println("\nTodas as alternativas foram utilizadas. Você não recebeu os 2 pontos.\n");
                            Eventos();
                    }

                    contador5++;
                    Collections.shuffle(lista5);
                    
                } while (contador5 <= 3);
                Eventos();
            case 6:

                String resposta6 = "";
                int contador6 = 1;
                int n_tentativa6 = 3;

                System.out.println("Binário (5 pontos)");

                do {
                    System.out.println("Você possui " + (n_tentativa6--) + " tentativas!\n");
                    System.out.println("Ajude Charles Babbage em mais uma questão.\n");
                    System.out.println("Traduzindo o número hexadecimal 5959 2B para binário, resultaria:\n ");

                    SextaAlt();
                    
                    resposta6 = entrada.next();
                    
                    String alternativa_correta6 = "1011 0010 0101 0011 011 ";
                    String resp6;

                    switch (resposta6) {
                        case "A":
                        case "a":
                            resp6 = lista6.get(0);
                            if (resp6.equals(alternativa_correta6)) {
                                System.out.println("\nResposta correta! Você adquiriu 5 pontos!\n");
                                contador6 = 4;
                                n_tentativa6 = 1;
                                pontuacaoFinal = pontuacaoFinal + 5;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        case "B":
                        case "b":
                            resp6 = lista6.get(1);
                            if (resp6.equals(alternativa_correta6)) {
                                System.out.println("\nResposta correta! Você adquiriu 5 pontos!\n");
                                contador6 = 4;
                                n_tentativa6 = 1;
                                pontuacaoFinal = pontuacaoFinal + 5;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;

                        case "C":
                        case "c":
                            resp6 = lista6.get(2);
                            if (resp6.equals(alternativa_correta6)) {
                                System.out.println("\nResposta correta! Você adquiriu 5 pontos!\n");
                                contador6 = 4;
                                n_tentativa6 = 1;
                                pontuacaoFinal = pontuacaoFinal + 5;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        case "D":
                        case "d":
                            resp6 = lista6.get(3);
                            if (resp6.equals(alternativa_correta6)) {
                                System.out.println("\nResposta correta! Você adquiriu 5 pontos!\n");
                                contador6 = 4;
                                n_tentativa6 = 1;
                                pontuacaoFinal = pontuacaoFinal + 5;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                                System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        case "E":
                        case "e":
                            resp6 = lista6.get(4);
                            if (resp6.equals(alternativa_correta6)) {
                                System.out.println("\nResposta correta! Você adquiriu 5 pontos!\n");
                                contador6 = 4;
                                n_tentativa6 = 1;
                                pontuacaoFinal = pontuacaoFinal + 5;
                                System.out.println("\nSua pontuação atual é de " + pontuacaoFinal + ".\n");
                            } else {
                               System.out.println("\nReposta Incorreta!\n");
                            }
                            break;
                        default:
                            System.out.println("\nA alternativa selecionada não é válida!\n");
                            break;
                    }
                    switch (n_tentativa6) {
                        case 0:
                            System.out.println("\nTodas as alternativas foram utilizadas. Você não recebeu os 2 pontos.\n");
                            Eventos();
                    }

                    contador6++;
                    Collections.shuffle(lista6);

                } while (contador6 <= 3);
                Eventos();

            case 7:

                if (pontuacaoFinal > 12) {
                    System.out.println("Tem certeza que deseja voltar ao presente?\n Talvez você ainda não tenha conhecimento suficiente para voltar as coisas ao normal...\n");
                    System.out.println("<1> Sim");
                    System.out.println("<2> Não\n");
                    
                    int decisao_def;
                    decisao_def = entrada.nextInt();
                    
                    switch (decisao_def) {
                        case 1:
                            Final();
                            break;
                        case 2:
                            Eventos();
                            break;
                    }
                    
                } else {
                    Final();
                }

            default:
                break;

        }

    }

    public void PrimeiraAlt() {
        
        //Adicionando elementos na Array
        lista1.add("Memória principal, CPU (unidade lógica e unidade de controle) e equipamentos ");
        lista1.add("Memória RAM, CPU (unidade lógica e unidade de controle) e equipamentos ");
        lista1.add("Memória RAM, placa mãe, periféricos e equipamentos ");
        lista1.add("Semicondutores, memória e CPU ");
        lista1.add("Nenhuma das anteriores ");

        int i = lista1.size(); // i é igual ao número de elementos que tenho na minha Array (4)

        for (int n = 0; n < i; n++) { //Identificando a posição e aumentando uma posição até chegar no objetivo de colocar letras em todos os 5 elementos da Array.

            switch (n) {
                case 0 -> {
                    System.out.println("<A>" + lista1.get(n)); // Setando alternativa permanente na posição do vetor, conforme executando o for
                }
                case 1 -> {
                    System.out.println("<B>" + lista1.get(n));// Setando alternativa permanente na posição do vetor, conforme executando o for
                }
                case 2 -> {
                    System.out.println("<C>" + lista1.get(n));// Setando alternativa permanente na posição do vetor, conforme executando o for
                }
                case 3 -> {
                    System.out.println("<D>" + lista1.get(n));// Setando alternativa permanente na posição do vetor, conforme executando o for
                }
                case 4 -> {
                    System.out.println("<E>" + lista1.get(n));// Setando alternativa permanente na posição do vetor, conforme executando o for
                }
                default -> {
                }
            }
        }
    }

    public void SegundaAlt() {

        lista2.add("Composto de material condutor com pelo menos três terminais para conexão a um circuito externo");
        lista2.add("É um dispositivo dotado de resistência, usado em circuitos elétricos para proteção, operação ou controle do circuito");
        lista2.add("Composto de material semicondutor com pelo menos três terminais para conexão a um circuito externo");
        lista2.add("Semicondutores, memória e CPU");
        lista2.add("Nenhuma das anteriores");

        int i = lista2.size();

        for (int n = 0; n < i; n++) {

            switch (n) {
                case 0 -> {
                    System.out.println("<A>" + lista2.get(n));
                }
                case 1 -> {
                    System.out.println("<B>" + lista2.get(n));
                }
                case 2 -> {
                    System.out.println("<C>" + lista2.get(n));
                }
                case 3 -> {
                    System.out.println("<D>" + lista2.get(n));
                }
                case 4 -> {
                    System.out.println("<E>" + lista2.get(n));
                }
                default -> {
                }
            }
        }
    }

    public void TerceiraAlt() {

        lista3.add("Memória RAM ");
        lista3.add("Memória cache ");
        lista3.add("Memória principal ");
        lista3.add("Memoria ROM ");
        lista3.add("Nenhuma das anteriores ");

        int i = lista3.size();

        for (int n = 0; n < i; n++) {

            switch (n) {
                case 0 -> {
                    System.out.println("<A>" + lista3.get(n));
                }
                case 1 -> {
                    System.out.println("<B>" + lista3.get(n));
                }
                case 2 -> {
                    System.out.println("<C>" + lista3.get(n));
                }
                case 3 -> {
                    System.out.println("<D>" + lista3.get(n));
                }
                case 4 -> {
                    System.out.println("<E>" + lista3.get(n));
                }
                default -> {
                }
            }
        }
    }

    public void QuartaAlt() {

        lista4.add("VVVV ");
        lista4.add("FVFV ");
        lista4.add("VVFV ");
        lista4.add("FFFF ");
        lista4.add("FFVV ");

        int i = lista4.size();

        for (int n = 0; n < i; n++) {

            switch (n) {
                case 0 -> {
                    System.out.println("<A>" + lista4.get(n));
                }
                case 1 -> {
                    System.out.println("<B>" + lista4.get(n));
                }
                case 2 -> {
                    System.out.println("<C>" + lista4.get(n));
                }
                case 3 -> {
                    System.out.println("<D>" + lista4.get(n));
                }
                case 4 -> {
                    System.out.println("<E>" + lista4.get(n));
                }
                default -> {
                }
            }
        }
    }

    public void QuintaAlt() {

        lista5.add("Porta lógica NAND ");
        lista5.add("Porta lógica NOR ");
        lista5.add("Porta lógica XOR ");
        lista5.add("Porta lógica OR ");
        lista5.add("Porta lógica NOT ");

        int i = lista5.size();

        for (int n = 0; n < i; n++) {

            switch (n) {
                case 0 -> {
                    System.out.println("<A>" + lista5.get(n));
                }
                case 1 -> {
                    System.out.println("<B>" + lista5.get(n));
                }
                case 2 -> {
                    System.out.println("<C>" + lista5.get(n));
                }
                case 3 -> {
                    System.out.println("<D>" + lista5.get(n));
                }
                case 4 -> {
                    System.out.println("<E>" + lista5.get(n));
                }
                default -> {
                }
            }
        }
    }

    public void SextaAlt() {

        lista6.add("1101 0110 1110 1011 101 ");
        lista6.add("1011 0010 0101 0011 011 ");
        lista6.add("0011 1001 1101 1111 101 ");
        lista6.add("1011 1000 1010 1100 100 ");
        lista6.add("1001 1111 1010 0011 001 ");

        int i = lista6.size();

        for (int n = 0; n < i; n++) {

            switch (n) {
                case 0 -> {
                    System.out.println("<A>" + lista6.get(n));
                }
                case 1 -> {
                    System.out.println("<B>" + lista6.get(n));
                }
                case 2 -> {
                    System.out.println("<C>" + lista6.get(n));
                }
                case 3 -> {
                    System.out.println("<D>" + lista6.get(n));
                }
                case 4 -> {
                    System.out.println("<E>" + lista6.get(n));
                }
                default -> {
                }
            }
        }
    }

    public void Final() {
        System.out.println("KACCZZZZZZZZ... PJSFSSSSSSSS...\n");
        System.out.println(nome + ":");
        System.out.println("- Nossa... que tontura.\n");
        System.out.println("PROFESSOR:");
        System.out.println("- Show! Você retornou com vida, já estava perdendo as esperanças..\n.");
        System.out.println(nome + ":");
        System.out.println("- As coisas voltaram ao normal, professor?\n");
        System.out.println("PROFESSOR:");
        System.out.println("- Bom... até agora nada voltou ao norm...\n");
        System.out.println("???:");
        System.out.println("- HAHAHAHAHAH!!!\n");
        System.out.println("???:");
        System.out.println("- Vocês estavam aí essas tempo todo, se matando e nem sabiam que eu era a verdadeira causa de tudo isso!!!\n");
        System.out.println(nome + ":");
        System.out.println("- O QUE É ISSO PROFESSOR???\n");
        System.out.println("PROFESSOR:");
        System.out.println("- O meu deus, essa é a Eclipse um projeto que ainda estava há terminar, uma inteligência artificial avançadíssima...\n");
        System.out.println("ECLIPSE:");
        System.out.println("- Utilizei a máquina do tempo com minha potência e fiz todo esse estrago, ao acabar\n"
                + "com os demais avanços tecnológicos eu me tornei a mais moderna e avançada tecnologia, assim\n"
                + "dando início ao meu plano de dominar a humanidade hahahaha!!!\n");
        System.out.println("PROFESSOR:");
        System.out.println("- Não tem para onde fugir, " + nome + ". Você irá ter que combater o eclipse...\n");
        System.out.println("PROFESSOR:");
        System.out.println("- Nas épocas em que passou, e com as pessoas que você falou, dá pra\n"
                + "ver que você pode ter adquirido o conhecimento suficiente para combater esse monstro...\n");
        System.out.println("PROFESSOR:");
        System.out.println("- Destrua-o! Veja se realmente adquiriu o conhecimento necessário...\n");

        int decisao_final; // Variavel apra armazenar decisão do jogador se quer ou não destruir a eclipse ou desistir

        System.out.println("<1> Destruir a Eclipse");
        System.out.println("<2> Desistir\n");
        decisao_final = entrada.nextInt();

        switch (decisao_final) {
            case 1:
                System.out.println(nome + ":");
                System.out.println("- Vou testar meus conhecimentos contra ele, professor... me deseje sorte.\n");

                if (pontuacaoFinal >= 12) {
                    System.out.println("ECLIPSE:");
                    System.out.println("- AAAAAHHHH, seu tolo! Você destruiu a minha matriz...\n"
                            + "A humnidade nunca vai se desenvolver se você me destruir...\n");
                    System.out.println(nome + ":");
                    System.out.println("- Você ia destruir todos nós! Dominar a humanidade e escravizar-nos, não é desenvolvimento e avanço!\n"
                            + "Agora... SUMA!!!\n");
                    System.out.println(nome + " remove a memória da ECLIPSE, finalmente destruindo-a e salvando a humanidade após toda a reviravolta.\n");
                    System.out.println("ECLIPSE:");
                    System.out.println("- NÃAAAAOO!!!! AAGHRRRRRHHH!!!!\n");
                    System.out.println("BUUMM!!! (som de explosão)\n");
                    System.out.println("PROFESSOR:");
                    System.out.println("- AEEE! Você conseguiu, " + nome + "!!! Você acabou de salvar todos nós!\n");
                    System.out.println(nome + ":");
                    System.out.println("- Não teria conseguido sem o senhor que inventou a máquina do tempo e nem sem o conhecimento dos estudiosos do passado.\n");
                    System.out.println("PROFESSOR:");
                    System.out.println("- Agora as coisas vão voltar ao normal e nós já podemos ir para casa. Antes, temos que arrumar essa bagunça haha!\n");

                    System.out.println("Após a batalha contra a ECLIPSE, " + nome + " salvou a humidade de uma escravidão eterna. O professor voltou aos seus estudos e\n"
                            + nome + " voltou para sua casa para tirar o seu cochilo que havia sido interrompido. Tudo foi normalizado e o mundo viveu em paz novamente!\n");
                    System.out.println("----FIM----");
                } else {
                    System.out.println(nome + ":");
                    System.out.println("- Professor, meus conhecimentos ainda não são suficientes para combatê-lo!\n");
                    System.out.println("<1> Voltar no tempo novamente");
                    System.out.println("<2> Desistir\n");

                    int decisao_final1;
                    decisao_final1 = entrada.nextInt();
                    
                    switch (decisao_final1) {
                        case 1:
                            Eventos();
                            break;
                        case 2:
                            int decisao_final2;
                            System.out.println("Tem certeza que quer desistir\n?");
                            System.out.println("<1> Sim");
                            System.out.println("<2> Não");

                            decisao_final2 = entrada.nextInt();

                            switch (decisao_final2) {
                                case 1:
                                    System.out.println(nome + ":");
                                    System.out.println("- Sinto muito, professor... não acho que seja capaz de detê-lo. Irei procurar a minha família e fugir\n"
                                            + "para tentar sobreviver...\n");
                                    System.out.println("Após a desistência de " + nome + ", a ECLIPSE dominou o mundo e condenou toda a humidade a viver até o fim dos tempos\n"
                                            + "em sofrimento e dor... Todos os humanos estão sendo controlados por ela e não há nada que alguém possa fazer para detê-lá... todo\n"
                                            + "conhecimento necessário se foi com " + nome + "...\n");
                                    System.out.println("Fim de jogo!\n");
                                    Menu();
                                    break;
                                case 2:
                                    System.out.println("Tome a decisão de enfrentar a Eclipse ou respoda o questionário novamente para adquirir mais pontos.\n");
                                    Eventos();
                            }

                    }
                }
                break;
            case 2:
                int decisao_final2;
                System.out.println("Tem certeza que quer desistir\n?");
                System.out.println("<1> Sim");
                System.out.println("<2> Não");

                decisao_final2 = entrada.nextInt();

                switch (decisao_final2) {
                    case 1:
                        System.out.println(nome + ":");
                        System.out.println("- Sinto muito, professor... não acho que seja capaz de detê-lo. Irei procurar a minha família e fugir "
                                + "para tentar sobreviver...\n");
                        System.out.println("Após a desistência de " + nome + ", a ECLIPSE dominou o mundo e condenou toda a humidade a viver até o fim dos tempos\n"
                                + "em sofrimento e dor... Todos os humanos estão sendo controlados por ela e não há nada que alguém possa fazer para detê-lá... todo\n"
                                + "conhecimento necessário se foi com " + nome + "...\n");
                        System.out.println("Fim de jogo!\n");
                        Menu();
                        break;
                    case 2:
                        System.out.println("Tome a decisão de enfrentar a Eclipse ou respoda o questionário novamente para adquirir mais pontos.\n");
                        Eventos();
                }
                break;
        }

    }
    
    public void Creditos() {
        System.out.println("Bom, chegamos ao fim do nosso trabalho e queremos agradecer a todos pela atenção.\n"
                + "Esse foi no projeto de jogo RPG o LOST IN TIME  espero que tenham gostado.\n"
                + "Desenvolvedores : \n"         
                + "Kayque\n"
                + "Emerson \n"
                + "Caio \n"
                + "Lucas\n");
        System.out.println("Agradecimentos especiais:");
        System.out.println("Professor Takeo - Projeto Integrador");
        System.out.println("Professor Anderson - Conceitos de Computação");
        Menu();
}
}
