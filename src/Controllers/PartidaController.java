package Controllers;

import Models.Partida;
import Models.Personagem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;
import java.util.Scanner;

public class PartidaController {
    private static Scanner scanner;
    private Properties descricaoProperties = new Properties();
    private Properties escolhasProperties = new Properties();
    private Properties acoesProperties = new Properties();
    private BufferedReader reader;
    private String descricaoPath;
    private String escolhasPath;
    private String acoesPath;

    /*Constutor*/
    public PartidaController(String descricaoPath, String escolhasPath, String acoesPath, Scanner scanner) {
        this.descricaoPath = descricaoPath;
        this.escolhasPath = escolhasPath;
        this.acoesPath = acoesPath;
        this.scanner = scanner;
    }

    /**/
    public static Personagem novoPersonagem(String nome){
        return new Personagem(nome);
    }
    public static String perguntaNome(){
        System.out.print("Dê um nome ao seu personagem: ");
        return scanner.nextLine();
    }
    public static String perguntaCaminho(){
        System.out.print("Insira o caminho do arquivo: ");
        return scanner.nextLine();
    }

}
