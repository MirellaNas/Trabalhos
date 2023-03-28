package jogopedrapapel;

public class Jogador {
    
    private String nome;
    private int    pontos; 
    private int    vida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public Jogador(String nome) {
        this.nome = nome;
    }
        
    public Jogador(String nome, int pontos, int vida) {
        this.nome   = nome;
        this.pontos = pontos;
        this.vida   = vida;
    }
    
    
}
