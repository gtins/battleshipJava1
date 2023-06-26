package components;

class NavioTanque extends Posicao {
    NavioTanque(int linhaInicial, int colunaInicial, char direcao) {
        super("PortaAvião", linhaInicial, colunaInicial, 'N', direcao);
    }

    @Override
    public int getTamanho() {
        return 4;
    }
}