package exercicio2;

public class Pleno extends Desenvolvedor {
    public Pleno() {
        super("Pleno", 4000.0);
    }

    public Pleno(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void codar() {
        System.out.println(nome + " codando com autonomia (nível Pleno).");
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.15;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}

