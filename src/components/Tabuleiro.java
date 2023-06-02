package components;

public class Tabuleiro {
    private char[][] matriz;
    private int tamanho;

    public Tabuleiro(int tamanho) {
        this.matriz = new char[tamanho][tamanho];
        this.tamanho = tamanho;
    }

    public void adicionarEmbarcacao(Posicao posicao) {
        int linhaInicial = posicao.getLinhaInicial();
        int colunaInicial = posicao.getColunaInicial();
        char caracter = posicao.getCaracter();
        int horizontal = 0;
        int vertical = 0;
        int tamanho = posicao.getTamanho();

        System.out.println("Tamanho ehhhh" + tamanho);

        matriz[linhaInicial][colunaInicial] = caracter;

        if( Character.toUpperCase(posicao.getDirecao()) == 'H') {
            horizontal = 1;
        } else {
            vertical = 1;
        }
        for( int i = 0; i< tamanho; i++) {
            matriz[linhaInicial + (i * vertical) ][colunaInicial + (i * horizontal)] = caracter;
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public char[][] getMatriz() {
        return this.matriz;
    }
}

