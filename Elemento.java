public class Elemento {
    private String nome;
    private Elemento elemento1;
    private Elemento elemento2;
    private int quantidade1;
    private int quantidade2;
    private int quantidadeHidrogenio;
    

    public Elemento(String nome, Elemento elemento1, int quantidade1, Elemento elemento2, int quantidade2) {
        this.nome = nome;
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
        this.quantidade1 = quantidade1;
        this.quantidade2 = quantidade2;
        this.quantidadeHidrogenio = 0;
    }

     public Elemento(String nome) {
        this.nome = nome;
        this.quantidadeHidrogenio = 1;
    }

     public Elemento(String nome, Elemento elemento1, int quantidade1) {
        this.nome = nome;
        this.elemento1 = elemento1;
        this.quantidade1 = quantidade1;
        this.quantidadeHidrogenio = 0;
    }

    public String getNome() {
        return nome;
    }

    public Elemento getElemento1() {
        return elemento1;
    }

    public Elemento getElemento2() {
        return elemento2;
    }

    public int getQuantidadeHidrogenio() {
        return quantidadeHidrogenio;
    }

    public int getQuantidade1() {
        return quantidade1;
    }

    public int getQuantidade2() {
        return quantidade2;
    }
    
    public void setQuantidadeHidrogenio(int quantidadeHidrogenio) {
        this.quantidadeHidrogenio = quantidadeHidrogenio;
    }
}