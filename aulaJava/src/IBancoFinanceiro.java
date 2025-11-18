public abstract interface IBancoFinanceiro {
    void abrirConta(String cpf, String nomeTitular);
    double aplicarJuros(double saldo);
    void estadoBanco();
    void transferir(String contaDestino);
    void sacar(double valor);
}