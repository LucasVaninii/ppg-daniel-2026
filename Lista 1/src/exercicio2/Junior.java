package exercicio2;

public class Junior extends Desenvolvedor {
    public Junior() {
        super("Junior", 2500.0);
    }

    public Junior(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void codar() {
        System.out.println(nome + " codando com orientação (nível Junior).");
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.10;
    }

    @Override
    public String toString() {
        return "Junior{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}

