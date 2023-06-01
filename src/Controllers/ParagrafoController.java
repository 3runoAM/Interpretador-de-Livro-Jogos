package Controllers;

import Models.Partida;

import java.util.Properties;

public class ParagrafoController {
    private Properties descricao = new Properties();
    private Properties escolhas = new Properties();
    private Properties acoes = new Properties();
    private Partida partida;


    /*Métodos*/
    public int idParagrafoAtaul(){
        return partida.getIdParagrafoAtual();
    }

}
