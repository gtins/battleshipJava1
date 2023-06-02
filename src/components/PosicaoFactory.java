package components;

public class PosicaoFactory {
    public static Posicao criar(String tipo, int linhaInicial, int colunaInicial, char direcao) {
        if (tipo.equals("PortaAvião")) {
            return new PortaAviao(linhaInicial, colunaInicial, direcao);
        } else if (tipo.equals("NavioTanque")) {
            return null;
        } else if (tipo.equals("ContraTorpedeiro")) {
            return null;
        } else if (tipo.equals("Submarino")) {
            return null;
        }

        return null;
    }
}
