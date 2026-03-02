public class Conta {

    // public deffine a visibilidade como pública
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;

        this.saldo = 0.0f; // O 'f' no final indica que é um número do tipo float
        this.status = true; // true significa que a conta nasce ativa
    }
    //Depositar
    public void depositar(float valor) {
        if (this.status == true) { // Verifica se está ativa
            this.saldo = this.saldo + valor; // Soma o valor ao saldo atual
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso na conta de " + this.nomeCliente + ".");
        } else {
            System.out.println("Erro: Não é possível depositar, a conta de " + this.nomeCliente + " está inativa.");
        }
    }

    //Sacar
    public void sacar(float valor) {
        if (this.status == false) {
            System.out.println("Erro: Conta inativa.");
        } else if (this.saldo >= valor) { // dinheiro suficiente
            this.saldo = this.saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso por " + this.nomeCliente + ".");
        } else {
            System.out.println("Erro: Saldo insuficiente para o saque de R$ " + valor + ".");
        }
    }

    //Encerrar
    public void encerrarConta() {
        if (this.saldo == 0) {
            this.status = false;
            System.out.println("Conta de " + this.nomeCliente + " encerrada com sucesso.");
        } else {
            System.out.println("Aviso: Você precisa zerar o saldo (sacar R$ " + this.saldo + ") antes de encerrar a conta.");
        }
    }

    // toString (Transforma os dados da conta em um texto bonito para leitura)
    public String toString() {
        String statusTexto;
        if (this.status == true) {
            statusTexto = "Ativa";
        } else {
            statusTexto = "Encerrada";
        }

        return "Dados da Conta\n" +
                "Cliente: " + this.nomeCliente + "\n" +
                "Agência: " + this.agencia + " | Conta: " + this.numeroConta + "\n" +
                "Saldo Atual: R$ " + this.saldo + "\n" +
                "Status: " + statusTexto + "\n" +
                "----------------------";
    }
}