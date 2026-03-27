package exercicio2;

public class TesteVetorPolimorfico {
    public static void main(String[] args) {
        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = new Junior();
        devs[1] = new Pleno();
        devs[2] = new Senior();
        devs[3] = new Desenvolvedor();

        for (Desenvolvedor dev : devs) {
            dev.codar();
            System.out.println(dev.calcularBonus());
            System.out.println(dev.toString());
            System.out.println();
        }
    }
}

