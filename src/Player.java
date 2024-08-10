public class Player {
    public String user;
    public int level;
    public boolean start;
    public int wins;
    public int loses;
    public int played;
    public boolean antiCheat = false;

    //Para jogador antigo
    public Player(String user, int level, int wins, int loses, int played) {
        this.user = user;
        this.level = level;
        this.wins = wins;
        this.loses = loses;
        this.played = played;
        this.start = false;
        this.antiCheat = false;
    }

    //Para jogador novo
    public Player(String user) {
        this(user, 0, 0, 0, 0);
    }

    public void winner(){
        wins++;
        played++;
        level++;
        System.out.println("Voce ganhou, agora esta com: " + wins + " vitorias, e completou " + played + " partidas jogadas.");
        System.out.println("Parabens voce upou para o level " + level);
    }
    public void loser(){
        loses++;
        played++;
        level--;
        System.out.println("Voce perdeu, agora esta com: " + loses + " derrotas, e completou " + played + " partidas jogadas.");
        System.out.println("Infelizmente voce caiu de level " + level);
    }

    public void start(){
        if (antiCheat == true){
            start = true;
            System.out.println("Partida iniciada!");
        } else {
            System.out.println("Por favor ative o seu anti-cheat para iniciar.");
        }
    }

    public void ligarAntiCheat(){
        antiCheat = true;
        System.out.println("Anti-cheat aberto, seja bem vindo(a) " + user + ".");
    }
}