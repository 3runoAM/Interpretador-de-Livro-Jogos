package Models;

public class Partida {
    private int idParagrafoAtual = 0;
    private Personagem personagem;

    /*Construtor*/
    public Partida(Personagem personagem) {
        this.personagem = personagem;
    }

    /*Getters&Setters*/
    public int getIdParagrafoAtual() {
        return idParagrafoAtual;
    }
    public void setIdParagrafoAtual(int idParagrafoAtual) {
        this.idParagrafoAtual = idParagrafoAtual;
    }
    public Personagem getPersonagem() {
        return personagem;
    }
    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    /*Métodos*/
    public void atualizaIdParagrafoAtual(int idParagrafoAtual){
        this.idParagrafoAtual = idParagrafoAtual;
    }


}
