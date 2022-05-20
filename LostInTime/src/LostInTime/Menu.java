package LostInTime;

import java.util.Scanner;

public class Menu {
     public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int escolha = 0;
        
        do {
            System.out.println("Escolha uma opção:");
        
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            
            escolha = entrada.nextInt();
            
            switch (escolha){
                case 1:
                    System.out.println("As instruções serão exibidas em breve... mas antes, \n"
                            + "escolha a opção correta do exercícío.\n");
                break;
                case 2:
                    Jogar jogar; //Criando objeto para a classe Jogar.
                    jogar = new Jogar();//Estanciando a classe Jogar, dentro do objeto jogar.
                    jogar.IniciarJogo();//Iniciando método. 
                break;      
                case 3:
                     System.out.println("Os créditos serão exibidos em breve... mas antes, \n"
                            + "escolha a opção correta do exercícío.\n");
                break;    
            }
        } while (escolha != 4);
                System.out.println("Você saiu do jogo com sucesso!");
    
    }
}
