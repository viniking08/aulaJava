public class ContaBanco implements IContaBanco{

    private String cpfConta;   //
    private String nomeTitular;
    private double saldo;

    public ContaBanco(String numeroConta, String nomeTitular) {
        this.cpfConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    public String getCpfConta() {
        return cpfConta;
    }

    public void setCpfConta(String cpfConta) {
        this.cpfConta = cpfConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
    this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
    this.saldo -= valor;
    }

    @Override
    public void transferir(ContaBanco destinatario, double valor) {   //deixei como acredito que seria se fosse usar
    this.saldo -= valor;
    destinatario.saldo += valor;
    }

    @Override
    public void mostrarSaldo() {
        System.out.println("Seu saldo é de:" + this.saldo);
    }
}
