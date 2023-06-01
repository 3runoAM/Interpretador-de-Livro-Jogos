package Builders;

import Models.game.Paragrafo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.PrivilegedAction;
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
        buildTipo(idParagrafo);
    }


    /*Métodos*/
    public void buildTipo(String id) throws IOException {
        propriedadeTipo.load(new BufferedReader(new FileReader("C:\\Users\\Bruno\\Desktop\\Curso Java\\untitled\\Interpretador-de-Livro-Jogos\\src\\Properties Files\\Tipo.properties")));
        paragrafo.setTipo(propriedadeTipo.getProperty(id));
    }

    @Override
    public void buildDescricao() throws IOException {
        propriedadeDescricao.load(new BufferedReader(new FileReader("C:\\Users\\Bruno\\Desktop\\Curso Java\\untitled\\Interpretador-de-Livro-Jogos\\src\\Properties Files\\Descrição.properties")));
        paragrafo.setDescricao(propriedadeDescricao.getProperty(paragrafo.getId()));
    }

    @Override
    public void buildEscolhas() throws IOException {
        propriedadeEscolhas.load(new BufferedReader(new FileReader("C:\\Users\\Bruno\\Desktop\\Curso Java\\untitled\\Interpretador-de-Livro-Jogos\\src\\Properties Files\\Escolhas.properties")));
        String[] escolhasInfo = propriedadeEscolhas.getProperty(paragrafo.getId()).split(",");
        int totalEscolhas = Integer.parseInt(escolhasInfo[0]);
        Map<String, Integer> escolhas = new HashMap<>();
        for (int i = 0; i < totalEscolhas; ++i) {
            String descricaoEscolha = escolhasInfo[i];
            int proxParagrafo = Integer.parseInt(escolhasInfo[i + 1]);
            escolhas.put(descricaoEscolha, proxParagrafo);
        }
        paragrafo.setEscolhas(escolhas);
    }

    @Override
    public void buildItems() throws IOException {
        propriedadeItems.load(new BufferedReader(new FileReader("C:\\Users\\Bruno\\Desktop\\Curso Java\\untitled\\Interpretador-de-Livro-Jogos\\src\\Properties Files\\Items.properties")));
    }

    @Override
    public void buildBatalha() throws IOException {
        propriedadeTipo.load(new BufferedReader(new FileReader("C:\\Users\\Bruno\\Desktop\\Curso Java\\untitled\\Interpretador-de-Livro-Jogos\\src\\Properties Files\\Batalha.properties")));
    }

    @Override
    public Paragrafo getParagrafo() {
        return paragrafo;
    }

    public Paragrafo paragrafoEscolhas() throws IOException {
        buildDescricao();
        buildEscolhas();
        return getParagrafo();
    }
    public Paragrafo paragrafoBatalha() throws IOException {
        buildDescricao();
        buildEscolhas();
        buildBatalha();
        return getParagrafo();
    }
    public Paragrafo paragrafoItems() throws IOException{
        buildDescricao();
        buildEscolhas();
        buildItems();
        return paragrafo;
    }
}
