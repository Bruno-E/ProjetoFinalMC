
public class Anao extends Heroi {
    private static int VIDA_INICIAL = 7;
    private static int INT_INICIAL = 3;
    private static int ATQ_INICIAL = 2;
    private static int DFS_INICIAL = 2;

    public Anao(String nome) {
        super(nome);
        this.vida = VIDA_INICIAL;
        this.inteligencia = INT_INICIAL;
        this.bonusAtaque = ATQ_INICIAL;
        this.bonusDefesa = DFS_INICIAL;
    }

}
