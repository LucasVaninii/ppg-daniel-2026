package exercicio1;

public class TesteSistemaVeiculos {
    public static void main(String[] args) {
        Veiculo veiculo = new Aviao("Boeing", "737", 900.0f, 11000.0f);
        veiculo.mover();

        veiculo = new CarroEletrico("Tesla", "Model 3", 180.0f, 500);
        veiculo.mover();
    }
}

