public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {
    private final String senhaCorreta;
    private boolean acessoLiberado;
    private boolean destrancada;

    public FechaduraEletronica(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
        this.acessoLiberado = false;
        this.destrancada = false;
    }

    @Override
    public void validarAcesso(String senha) {
        acessoLiberado = senhaCorreta != null && senhaCorreta.equals(senha);
    }

    @Override
    public void ligar() {
        if (acessoLiberado) {
            destrancada = true;
        }
    }

    @Override
    public void desligar() {
        destrancada = false;
        acessoLiberado = false;
    }

    public boolean isDestrancada() {
        return destrancada;
    }
}