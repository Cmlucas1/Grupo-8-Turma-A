package LostInTime;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Jogar {
    //Variavel Global
   String nome = "";
   Scanner entrada = new Scanner (System.in);
    public void IniciarJogo (){
        
        int resposta = 0;
        //Introdução
            System.out.println("Oi, olá\n"
                + "É um prazer conhece-lo! Bem-vindo ao fabuloso mundo POKÉMON, meu nome é Takeo e sou o principal professor Pokémon da região de Santo Amaro.\n"
                + "Mas primeiro me conte mais sobre você...\n");
        //Informações do usuário
            System.out.println("E como se chama?");
            nome = entrada.nextLine();
        //Começo do jogo
            System.out.println("\n\nCerto você é o "+ nome + ". Seja bem-vindo ao mundo Poké...");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println("BRAAAUFSUBFAIOZFA!!!!");
            System.out.println("\nUm barulho pela janela, você larga o vídeo game para ver o que é e percebe que vem de um galpão abandonado.");
            
            String data = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
            
            System.out.println("\nTV - Noticia urgente hoje no dia " + data +
                     "\nalgo surreal aconteceu todos os computadores estão parando de funciona... PIIIIIIIIIIII (sinal da tv também cai).");
            System.out.println("\nIr investigar a explosão?");
            System.out.println("\n1 - Investigar");
            System.out.println("\n2 - Ir dormir");
                
            resposta = entrada.nextInt();
            if (resposta !=1) {
                while (resposta != 1){
                    switch (resposta){
                        case 2:        
                            System.out.println("Tem certeza?");
                            resposta = entrada.nextInt();
                            break;
                        default: System.out.println("Opção inválida!");
                            resposta = entrada.nextInt();
                            break;
                    }
                }
                
                Investigar();
            
            }else {
                Investigar();
            }
            System.out.println("");
            
            
            System.exit(0);//Encerrar programa
    }
    
    public void Investigar(){
        int resposta = 0;
        
        System.out.println("Chegando ao galpão, "+ nome + " decide entrar e se depara com...\n"
                + "Um senhor que estava desesperado. "+ nome +" então decide fazer uma pergunta:\n"
                + nome + ":\n- Meu Deus, o que está acontecendo aqui!!?\n"
                + "PROFESSOR:\n - Não está acontecendo nada. Saia daqui!");
        System.out.println("1 - Insistir");
        System.out.println("2 - Sair");
        resposta = entrada.nextInt();
        if (resposta == 1) {
            Insistir();
        }else {
            System.out.println("Fim de jogo!");
            System.exit(0);
        }
    }
    
    public void Insistir(){
        
        ArrayList<String> colapso = new ArrayList();
        colapso.add("1 - Surgimento do computador");
        colapso.add("2 - Transistores");
        colapso.add("3 - Tipos de memória");
        colapso.add("4 - Criação da memória RAM");
        colapso.add("5 - Portas lógicas");
        colapso.add("6 - Binário");
        
        
        
        System.out.println("Não! Eu preciso saber o que está acontecendo. \n"
                + "Lá fora está um caos. Isso que você está fazendo tem a ver com essa loucura toda?\n"
                + "\nPROFESSOR:\n "
                + "-Sim, estava tentando realizar alguns projetos com a minha mais nova invenção a máquina do tempo,\n"
                + " mas infelizmente acabei causando diversos prejuízos no espaço tempo que acabaram afetando os avanços\n "
                + "tecnológicos, por isso que a tecnologia moderna está entrando em colapso.\n");
        System.out.println(nome + ":");
        System.out.println("-Mais e agora!? O que podemos fazer para reverter essa situação?");
        System.out.println("PROFESSOR:");
        System.out.println("-Temos que voltar no passado exatamente nas datas em que o espaço tempo foi alterado e reverter \n"
                + "essa situação, deixando tudo como era antes.");
        System.out.println("PROFESSOR:");
        System.out.println("-Porem estou lidando com um grande problema, como tenho uma idade muito avançada acho que não irei \n"
                + "suportar essa viagem no tempo. Será que você que é um jovem saudável e muito curioso poderia me ajudar?");
        System.out.println(nome + ":");
        System.out.println("-Claro que posso te ajudar, não posso ver uma situação dessa e não fazer alguma coisa para tentar arrumar essa bagunça!");
        System.out.println("PROFESSOR:");
        System.out.println("Que ótimo eu estaria perdido se você não estivesse aceitado. Porém tenho que te fazer uma pergunta, \n"
                + "você tem algum conhecimento em conceitos da computação? ");
        System.out.println(nome + ":");
        System.out.println("-Sim tenho, aliás estudo em uma ótima escola de tecnologia que é o SENAC.");
        System.out.println("PROFESSOR:");
        System.out.println("-Ótimo, pelos meus cálculos por volta dessas épocas foram onde ocorreram os colapsos:");
        //Exibindo lista (ArrayList)
        String eventos = "";
        for (String evento : colapso) {
            eventos = eventos + evento +"\n";
        }
        System.out.println(eventos);
        System.out.println("PROFESSOR:");
        System.out.println("Qual dessas épocas que eu citei você deseja começar para tentarmos reparar a linha do tempo? ");
        int resposta = entrada.nextInt();
        
        int pontuacaoFinal = 0;
        switch(resposta){
            case 1:
                System.out.println("Surgimento do Computador IAS (5 pontos)");
                System.out.println("Você chegou em 1946 no surgimento do computador IAS.\n"
                        + "Ajuda John von Neumann e seus colaboradores a terminar de projetar esse\n"
                        + "computador pioneiro!!!");
                System.out.println("Qual a estrutura de um computador IAS (Industry Standard Architecture?");
                System.out.println("<A>Memória Principal, CPU(unidade lógica e unicade de controle) e equipamentos.");
                System.out.println("<B>Memória RAM, CPU e equipamentos.");
                System.out.println("<C>Memória RAM, placa mãe, periféricos e equipamentos.");
                System.out.println("<D>Semicondutores, memória e CPU.");
                System.out.println("<E>Nenhuma das opções anteriores.");
                break;
            case 2:
                System.out.println("Transistores (4 pontos)");
                System.out.println("Você está na década de 80 onde um grupo de jovens estão tentando montar\n"
                        + "uma nova placa mãe para um computador, porém eles esqueceram algo\n"
                        + "muito importante... do que é feito um transistor.");
                System.out.println("Um transistor é...");
                System.out.println("<A>Composto de material condutor com pelo menos três terminar para conexão\n"
                        + "a um circuito interno.");
                System.out.println("<B>É um dispositivo dotado de resitêcia, usado em circuitos elétricos para\n"
                        + "proteção, operação ou controle do circuito.");
                System.out.println("<C>Composto de material semicondutor com pelo menos três terminais para conexão\n"
                        + "a um circuito externo.");
                break;
            case 3:
                System.out.println("Tipos de memória (4 pontos)");
                System.out.println("Você está na década de 70 e um jovem chamado Bill Gates está querendo\n"
                        + "projetar computadores. Ajude-o com a questão da memória.");
                System.out.println("BILL GATES:");
                System.out.println("Qual é a memória de 'armazenamento temporário'?");
                System.out.println("<A>Memória RAM.");
                System.out.println("<B>Memória Cache.");
                System.out.println("<C>Memória principal.");
                System.out.println("<D>Memória ROM.");
                break;
            case 4:
                System.out.println("Memória (3 pontos)");
                System.out.println("Ainda na década de 70, Bill Gates possui mais uma questão sobre memória.");
                System.out.println("Analise as afirmações sobre memórias: ");
                System.out.println("1. Parte do computador onde são armazenados programas e dados");
                System.out.println("2. A unidade básica de memória o bit: 0 ou um 1");
                System.out.println("3. O armazenamento das memorias é ilimitado");
                System.out.println("4. Memórias consistem de células, cada uma das quais com informações\n");
                System.out.println("Quais afirmações são verdadeiras e quais são falsas?");
                System.out.println("<A> VVVV");
                System.out.println("<B> FVFV");
                System.out.println("<C> VVFV");
                System.out.println("<D> FFFF");
                System.out.println("<E> FFVV");
                break;
            case 5:
                System.out.println("Portas lógicas (2 pontos)");
                System.out.println("Você está no século 18 nos primórdios da computação, um dos seus\n"
                        + " pioneiros é Charles Babbage, ajude ele a resolver\n"
                        + " uns problemas com a linguagem binária");
                System.out.println("A expressão lógica S = A + B refere-se a qual porta lógica?");
                System.out.println("<A> Porta lógica NAND.");
                System.out.println("<B> Porta lógica NOR.");
                System.out.println("<C> Porta lógica XOR.");
                System.out.println("<D> Porta lógica OR.");
                System.out.println("<E> Porta lógica NOT.");
                break;
            case 6:
                System.out.println("Binário (5 pontos)");
                System.out.println("Ajude Charles Babbage em mais uma questão.");
                System.out.println("Traduzindo o número hexadecimal 5959 2B para binário, resultaria: ");
                System.out.println("<A> 1101 0110 1110 1011 101");
                System.out.println("<B> 1011 0010 0101 0011 011");
                System.out.println("<C> 0011 1001 1101 1111 101");
                System.out.println("<D> 1011 1000 1010 1100 100");
                System.out.println("<E> 1001 1111 1010 0011 001");
                break;
            default:
                break;
                
        }
        
        
    }
}
