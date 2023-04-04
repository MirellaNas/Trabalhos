package JogoV1;


import JogoV1.Personagem;

public class JogoV1{
  public static void main (String [] args) throws InterruptedException {
    
    Personagem cacador = new Personagem("John",10,0,0); 
   
    Personagem fominha = new Personagem("Fominha",4,6,2);
    
    Personagem soneca = new Personagem ("Soneca",2,6,4);
   
    while (true)
    {
    cacador.cacar();
    soneca.dormir();
    fominha.comer();
    cacador.comer();
    soneca.dormir();
    fominha.comer();
    cacador.dormir();
    soneca.dormir();
    fominha.cacar();
    cacador.cacar();
    soneca.comer();
    fominha.dormir();
    cacador.cacar();
    soneca.cacar();
    fominha.dormir();
    System.out.println("====================");
    Thread.sleep(5000); 
  }
}
}