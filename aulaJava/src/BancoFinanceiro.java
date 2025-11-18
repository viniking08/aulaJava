public class BancoFinanceiro implements IBancoFinanceiro {

    private String cpf;
    private String nomeTitular;
    private double saldo;

    public BancoFinanceiro(String cpf, String nomeTitular, double saldoInicial) {
        this.cpf = cpf;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // os métodos são só com print pq a atividade era sobre a interface

    @Override
    public void abrirConta(String cpf, String nomeTitular) {
        System.out.println("Conta aberta para " + nomeTitular + " (CPF: " + cpf + ").");
    }

    @Override
    public double aplicarJuros(double saldo) {
        System.out.println("Aplicando juros ao saldo: " + saldo);
        double novoSaldo = saldo * 1.05; // exemplo simbólico
        System.out.println("Novo saldo com juros: " + novoSaldo);
        return novoSaldo;
    }

    @Override
    public void estadoBanco() {
        System.out.println("----- Estado do Banco -----");
        System.out.println("Titular: " + nomeTitular);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: " + saldo);
    }

    @Override
    public void transferir(String contaDestino) {
        System.out.println("Transferindo para a conta: " + contaDestino);
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Saque solicitado: R$" + valor);
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque concluído. Novo saldo: R$" + saldo);
        }
    }
}

