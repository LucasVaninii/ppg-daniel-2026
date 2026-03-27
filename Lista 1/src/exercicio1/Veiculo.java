package exercicio1;

public class Veiculo {
    public String marca;
    public String modelo;
    public float velocidade;

    public Veiculo(String marca, String modelo, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void mover() {
        System.out.println("Veículo se movendo...");
    }

    public void abastecer() {
        System.out.println("Veículo reabastecendo...");
    }
}

