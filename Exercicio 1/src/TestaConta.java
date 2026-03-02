public class TestaConta {

    public static void main(String[] args) {

        System.out.println("- Teste do Joaão:");

        Conta c1 = new Conta(12345, 1, "João Silva");

        // tenta depositar
        c1.depositar(500.0f);

        // tenta sacar
        c1.sacar(200.0f);
        System.out.println(c1.toString());


        System.out.println("\n- Teste da Maria:");

        //
        Conta c2 = new Conta(54321, 2, "Maria Souza");


        c2.sacar(50.0f);


        System.out.println("\nConta do João Encerrada");


        c1.encerrarConta();

        c1.sacar(300.0f);
        c1.encerrarConta();
        System.out.println(c1.toString());
    }
}