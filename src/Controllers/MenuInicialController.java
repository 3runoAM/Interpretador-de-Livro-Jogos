package Controllers;

import java.util.Scanner;

public class MenuInicialController {
    private static final int OPCAO_INICIAR_JOGO = 1;
    private static final int OPCAO_CARREGAR_JOGO = 2;
    private Scanner scanner;

    /*Construtor*/
    public MenuInicialController(Scanner sc) {
        this.scanner = sc;
    }

    /*Getters&Setters*/
    public static int getOpcaoIniciarJogo() {
        return OPCAO_INICIAR_JOGO;
    }


    /*Métodos*/
    public int menuInicial() {
        while (true) {
            mostrarMenuInicial();
            try {
                int opcao = perguntaOpcao();
                if (validaOpcao(opcao)) {
                    return opcao;
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção Inválida.");
            }
        }
    }
    public void mostrarMenuInicial() {
        System.out.print("""
                +------------------------------+
                |    1    | Iniciar jogo       |
                |    2    | Carregar jogo      |
                +------------------------------+
                >>>\s""");
    }
    public int perguntaOpcao() {
        return Integer.parseInt(scanner.nextLine());
    }
    public boolean validaOpcao(int opcao) {
        return opcao == OPCAO_INICIAR_JOGO || opcao == OPCAO_CARREGAR_JOGO;
    }
}
