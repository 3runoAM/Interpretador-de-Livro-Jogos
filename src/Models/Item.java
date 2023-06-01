package Models;

public class Item {
    private String nome;
    private int tamannho;


    /*Construtor*/
    public Item(String nome, int tamannho) {
        this.nome = nome;
        this.tamannho = tamannho;
    }

    /*Getters&Setters*/
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTamannho() {
        return tamannho;
    }
    public void setTamannho(int tamannho) {
        this.tamannho = tamannho;
    }


    /*Métodos*/

}
