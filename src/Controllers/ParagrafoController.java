package Controllers;

import Builders.ParagrafoBuilder;
import Builders.ParagrafoBuilderImp;
import Models.game.Paragrafo;


public class ParagrafoController {
    private String idParagrafoAtual = "0";
    private ParagrafoBuilderImp construtorParagrafos;
    /*Construtor*/
    // Padrão

    /*Getters*/
    public String getIdParagrafoAtual() {
        return idParagrafoAtual;
    }
    public void setIdParagrafoAtual(String idAtual){
        this.idParagrafoAtual = idAtual;
    }

    /*Métodos*/
    public void atualizaParagrafoAtual(String idAtual){
        setIdParagrafoAtual(idAtual);
    }

}
