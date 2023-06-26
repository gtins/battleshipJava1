package components;

class ContraTorpedeiro extends Posicao {
    ContraTorpedeiro(int linhaInicial, int colunaInicial, char direcao) {
        super("PortaAvião", linhaInicial, colunaInicial, 'C', direcao);
    }

    @Override
    public int getTamanho() {
        return 3;
    }
}