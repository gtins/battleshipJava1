import components.Posicao;
import components.Tabuleiro;
import util.CarregadorEmbarcacoes;
import view.Visualizador;

import java.util.List;
import java.util.logging.Logger;

public class Batalha {
    private static final Logger LOG = Logger.getAnonymousLogger();
    private List<Posicao> embarcacoes;
    private Tabuleiro tabuleiro = new Tabuleiro(10);
    private boolean gameOver;

    public  void loader() {
        final String FILE = "C:\\Users\\Pichau\\IdeaProjects\\batalhanaval\\src\\posicoes.csv";
        LOG.info("Iniciando leitura do arquivo");
        embarcacoes = CarregadorEmbarcacoes.carregar(FILE);
        LOG.info("Finalizando leitura arquivo");
    }

    private void criarTabuleiro() {
        for (Posicao posicao : embarcacoes) {
            tabuleiro.adicionarEmbarcacao(posicao);
            LOG.info(posicao.getTipo());
        }
    }

    public static void main(String[] args) {
        Batalha game = new Batalha();
        game.loader();
        game.criarTabuleiro();
        game.visualizar();

    }

    private void visualizar() {
        Visualizador v = new Visualizador(tabuleiro);
        v.ver();
    }
}

//    public static void main(String[] args) {
//        Batalha jogo = new Batalha();
//        jogo.loader();
//        jogo.criarTabuleiro();
//        while(! jogo.gameOver){
//            jogo.visualizar();
//            jogo.jogada();
//            jogo.jogar();
//
//        }
//        jogo.finish();
//
//    }
//
//    private void finish() {
//        //terminar o jogo
//        //pontuação
//        //vencedor
//        //mensagem de fim de jogo
//    }
//
//    private void jogar(){
//        //verificar se a jogada é valida
//        //verificar se a jogada é possivel
//        //retornar se acertou alguma embarcação inimiga
//        //atualizar o tabuleiro (afundadas vs nao afundadas)
//
//    }
//
//    private void jogada(){
//        //insira a coluna e linha da jogada
//
//    }
//
//
//    private void visualizar() {
//        Visualizador v = new Visualizador(tabuleiro);
//        v.ver();
//    }
//}
