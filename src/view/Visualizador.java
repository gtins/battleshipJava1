package view;
import components.Tabuleiro;
public class Visualizador {
    private final Tabuleiro tabuleiro;
    public Visualizador(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    public void ver() {
        int tamanho = tabuleiro.getTamanho(); //pega o tamanho que esta na classe tabuleiro
        char[][] matriz = tabuleiro.getMatriz(); //mesma coisa para a matriz
        System.out.print(" ====================================\n");
        System.out.print(" =====         PLACAR " + tabuleiro.getPontuacao() + "         ===== \n");
        System.out.print(" ====================================\n");
        System.out.print("            0 1 2 3 4 5 6 7 8 9\n");
// prints normais
        for (int linha = 0; linha < tamanho; linha++) { //for normal
            System.out.print("          " + linha + " ");
            for (int coluna = 0; coluna < tamanho; coluna++) {
                char caracter = matriz[linha][coluna];
                if (caracter == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(caracter);
                }
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.print(" ====================================\n");
    }
}