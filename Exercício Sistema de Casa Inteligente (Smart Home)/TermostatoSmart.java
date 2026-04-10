import java.util.concurrent.ThreadLocalRandom;

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {
    private boolean ligado;

    public TermostatoSmart() {
        this.ligado = false;
    }

    @Override
    public void ligar() {
        ligado = true;
    }

    @Override
    public void desligar() {
        ligado = false;
    }

    @Override
    public double lerTemperatura() {
        if (!ligado) {
            throw new IllegalStateException("Termostato desligado");
        }
        return ThreadLocalRandom.current().nextDouble(18.0, 30.0);
    }

    public boolean isLigado() {
        return ligado;
    }
}