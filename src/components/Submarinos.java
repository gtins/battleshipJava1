package components;

class Submarinos extends Posicao {
    Submarinos(int linhaInicial, int colunaInicial, char direcao) {
        super("PortaAvião", linhaInicial, colunaInicial, 'S', direcao);
    }

    @Override
    public int getTamanho() {
        return 2;
    }
}