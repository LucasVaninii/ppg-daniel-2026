package exercicio2;

public class Desenvolvedor {
    protected String nome;
    protected double salarioBase;

    public Desenvolvedor() {
        this.nome = "Desenvolvedor";
        this.salarioBase = 3000.0;
    }

    public Desenvolvedor(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void codar() {
        System.out.println(nome + " está codando.");
    }

    public double calcularBonus() {
        return salarioBase * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}

