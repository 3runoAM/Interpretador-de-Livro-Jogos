package Builders;

import Models.game.Paragrafo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ParagrafoBuilderImp implements ParagrafoBuilder {

    private Paragrafo paragrafo;
    private Properties propriedadeTipo = new Properties();
    private Properties propriedadeDescricao = new Properties();
    private Properties propriedadeEscolhas = new Properties();
    private Properties propriedadeItems = new Properties();
    private Properties propriedadeBatalha = new Properties();


    /*Constructor*/
    public ParagrafoBuilderImp(String idParagrafo) throws IOException {
        this.paragrafo = new Paragrafo(idParagrafo);
        buildPropriedades();
        buildTipo(idParagrafo);
    }


    /*Métodos*/
    private void buildPropriedades() throws IOException {
        propriedadeTipo.load(new BufferedReader(new FileReader("C:\\Users\\Bruno\\Desktop\\Projetos java\\untitled\\Interpretador-de-Livro-Jogos\\src\\Properties Files\\Tipo.properties")));
        propriedadeDescricao.load(new BufferedReader(new FileReader("C:\\Users\\Bruno\\Desktop\\Projetos java\\untitled\\Interpretador-de-Livro-Jogos\\src\\Properties Files\\Descrição.properties")));
        propriedadeItems.load(new BufferedReader(new FileReader("C:\\Users\\Bruno\\Desktop\\Projetos java\\untitled\\Interpretador-de-Livro-Jogos\\src\\Properties Files\\Items.properties")));
        propriedadeEscolhas.load(new BufferedReader(new FileReader("C:\\Users\\Bruno\\Desktop\\Projetos java\\untitled\\Interpretador-de-Livro-Jogos\\src\\Properties Files\\Escolhas.properties")));
        propriedadeBatalha.load(new BufferedReader(new FileReader("C:\\Users\\Bruno\\Desktop\\Projetos java\\untitled\\Interpretador-de-Livro-Jogos\\src\\Properties Files\\Batalha.properties")));
    }

    public void buildTipo(String id) throws IOException {
        paragrafo.setTipo(propriedadeTipo.getProperty(id));
    }

    @Override
    public void buildDescricao() throws IOException {
        paragrafo.setDescricao(propriedadeDescricao.getProperty(paragrafo.getId()));
    }

    @Override
    public void buildEscolhas() throws IOException {
        String[] escolhasInfo = propriedadeEscolhas.getProperty(paragrafo.getId()).split(",");
        int totalEscolhas = Integer.parseInt(escolhasInfo[0]);
        Map<String, String> escolhas = new HashMap<>();
        for (int i = 1; i < totalEscolhas; i++) {
            String descricao = escolhasInfo[i];
            String proxParagrafo = escolhasInfo[i+1];
            escolhas.put(descricao, proxParagrafo);
        }
        paragrafo.setEscolhas(escolhas);
    }

    @Override
    public void buildItems() throws IOException {
        // Construir lógica de instanciar itens
    }

    @Override
    public void buildBatalha() throws IOException {
        // Construit lógica de instanciar batalha
    }

    private Paragrafo paragrafoEscolhas() throws IOException {
        buildDescricao();
        buildEscolhas();
        return paragrafo;
    }

    private Paragrafo paragrafoBatalha() throws IOException {
        buildDescricao();
        buildEscolhas();
        buildBatalha();
        return paragrafo;
    }

    private Paragrafo paragrafoItems() throws IOException {
        buildDescricao();
        buildEscolhas();
        buildItems();
        return paragrafo;
    }

    public Paragrafo carregarParagrafo() throws IOException {
        switch (paragrafo.getTipo()) {
            case ("1") -> {
                return paragrafoEscolhas();
            }
            case ("2") -> {
                return paragrafoBatalha();
            }
            case ("3") -> {
                return paragrafoItems();
            }
        }
        return null;
    }
}
