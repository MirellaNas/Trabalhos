
package jogopedrapapel;

import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {

    public static void Tabuleiro(){
    {
    int palpite, iaComputador;
    
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("1 ---- Pedra");
    System.out.println("2 ---- Papel");
    System.out.println("3 ---- Tesoura");

    palpite = sc.nextInt();
    
    iaComputador = random.nextInt(3)+1;
    
    if (iaComputador == 1)
        System.out.println("1 ---- Pedra");
    else if (iaComputador == 2){
        System.out.println("2 ---- Papel");
    }
    else if (iaComputador == 3){
        System.out.println("3 ---- Tesoura");
    }
    
    if (palpite == iaComputador)
    {
        System.out.println("Empate");
    }
    
    if ((palpite == 1 && iaComputador == 3)||
       (palpite == 2 && iaComputador == 1)||    
       (palpite == 3 && iaComputador == 2))
    {
        System.out.println("Você ganhou!!!");
    }
    
    else if ((palpite == 1 && iaComputador == 2)||
            (palpite == 2 && iaComputador == 3)||    
            (palpite == 3 && iaComputador == 1))
    {
        System.out.println("Você perdeu!!!");
    
    }
    
}
}
}
