package exercicio2;

public class Senior extends Desenvolvedor {
    public Senior() {
        super("Senior", 6000.0);
    }

    public Senior(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void codar() {
        System.out.println(nome + " codando e revisando (nível Senior).");
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.20;
    }

    @Override
    public String toString() {
        return "Senior{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}

