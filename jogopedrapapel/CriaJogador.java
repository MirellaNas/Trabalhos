
package jogopedrapapel;

import java.util.Scanner;

public class CriaJogador {
   

    public static void CriaJogador (){
    
    
        String nome;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do jogador: ");
        nome = sc.nextLine();
        
        //Instânciar um objeto - criar o objeto
        Jogador player1 = new Jogador(nome, 0, 5);
        Jogador player2 = new Jogador("Máquina", 0, 5);
        
        System.out.println("Player 1 ------ " + player1.getNome ()); 
        System.out.println("Player 2 ------ " + player2.getNome()); 
       
    }
    
}
