package Controllers;

import Builders.ParagrafoBuilderImp;
import Models.game.Paragrafo;

import java.io.IOException;


public class ParagrafoController {
    private String paragrafoAtual = "0";
    private ParagrafoBuilderImp construtorParagrafos;


    /*Construtor*/
    // Padrão

    /*Getters*/
    public String getParagrafoAtual() {
        return paragrafoAtual;
    }
    public void setParagrafoAtual(String idAtual){
        this.paragrafoAtual = idAtual;
    }


    /*Métodos*/
    public void atualizaParagrafoAtual(String idAtual){
        setParagrafoAtual(idAtual);
    }

    public void chamaParagrafo(String id) throws IOException {
        Paragrafo paragrafoAtual = construtorParagrafos.carregarParagrafo();
    }

}
