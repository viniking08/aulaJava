public interface IBancoFinanceiro {
    void abrirConta(String cpf, String nomeTitular);
    double aplicarJuros(double saldo);
    void estadoBanco();
}
