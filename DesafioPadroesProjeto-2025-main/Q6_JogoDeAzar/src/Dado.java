import java.util.Random;

interface IDado {
    void rolar();
    int getValor();
}

public class Dado implements IDado{
    private int lados;
    private int valorJogada;
    private final Random random;

    public Dado(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    @Override
    public void rolar() {
        valorJogada = random.nextInt(lados) + 1;
    }

    @Override
    public int getValor() {
        return valorJogada;
    }
}
