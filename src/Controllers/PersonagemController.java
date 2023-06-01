package Controllers;

import Models.characters.Personagem;

import java.util.Scanner;

public class PersonagemController {
    private Scanner scanner;

    /**/
    public PersonagemController(Scanner scanner) {
        this.scanner = scanner;
    }

    /*Métodos*/

    public Personagem criarNovoPersonagem(){
        return instanciaPersonagem(perguntaNome());
    }

    private Personagem instanciaPersonagem(String nome){
        return new Personagem(nome);
    }

    private String perguntaNome(){
        System.out.println("Qual o nome do seu personagem?\n>>>");
        return scanner.nextLine();
    }
}
