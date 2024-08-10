public class Game {
    public static void main(String[] args) {
        Player jogador1 = new Player("Marina_Gameplay2012", 100, 150, 50, 200);
        Player jogador2 = new Player("POO_Best_aula_Games");

        jogador1.ligarAntiCheat();
        jogador1.start();
        jogador1.loser();
        jogador1.start();
        jogador1.winner();
        jogador1.start();
        jogador1.winner();
        jogador1.start();
        jogador1.winner();

        jogador1.start();
        jogador2.ligarAntiCheat();
        jogador2.start();
        jogador2.winner();
        jogador2.start();
        jogador2.loser();
        jogador2.start();
        jogador2.loser();
        jogador2.start();
        jogador2.loser();
    }
}
