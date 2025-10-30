public class BancoFinanceiro implements IBancoFinanceiro {
    private double saldoTotal;   //saldo de todas as contas
    private double taxaJuros;   //renda passiva do banco
    private int qntdContas;
    private String bancoNome;

    public BancoFinanceiro(double taxaJuros, String bancoNome) {
        this.taxaJuros = taxaJuros;
        this.bancoNome = bancoNome;
        this.bancoNome = bancoNome;
        this.saldoTotal = 0.0;
        this.qntdContas = 0;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public int getQntdContas() {
        return qntdContas;
    }

    public void setQntdContas(int qntdContas) {
        this.qntdContas = qntdContas;
    }

    public String getBancoNome() {
        return bancoNome;
    }

    public void setBancoNome(String bancoNome) {
        this.bancoNome = bancoNome;
    }

    @Override
    public void abrirConta(String cpf, String nomeTitular) {
    ContaBanco conta01 = new ContaBanco(cpf, nomeTitular);
    this.qntdContas += 1;
    }

    @Override
    public double aplicarJuros(double saldo){
    saldo = saldo + saldo * getTaxaJuros();
    return saldo;
    }

    @Override
    public void estadoBanco(){
        System.out.println("nome do banco:" + getBancoNome());
        System.out.println("quantidade de contas é:" + getQntdContas());
        System.out.println("saldo de todas as contas é:" + getSaldoTotal());
        System.out.println("taxa de renda passiva do banco está em:" + getTaxaJuros());
    }
}

