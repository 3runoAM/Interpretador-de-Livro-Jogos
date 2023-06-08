import Builders.ParagrafoBuilder;
import Builders.ParagrafoBuilderImp;
import Controllers.MenuInicialController;
import Models.game.Paragrafo;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LivroJogo {
    private static Set<Paragrafo> livroJogo = new HashSet<>();
    private static Scanner entradaDeDados = new Scanner(System.in);

    public static void main(String[] args) {
        MenuInicialController menuInicial = new MenuInicialController(entradaDeDados);
        int opcao = menuInicial.menuInicial();
        switch (opcao) {
            case (1) -> {
                String id = "0";
                while (true) {
                    try {
                        ParagrafoBuilderImp constroiParagrafo = new ParagrafoBuilderImp(id);
                        mostraParagrafo(constroiParagrafo.carregarParagrafo());
                        break;
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
    }
    public static void mostraParagrafo(Paragrafo paragrafo) {
        System.out.print(paragrafo);
    }
}

