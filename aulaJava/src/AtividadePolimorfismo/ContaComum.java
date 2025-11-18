package AtividadePolimorfismo;

public class ContaComum extends Pessoa {

    private int numero;
    private int saldo;
    private int tipo;

    public ContaComum(String nome, String endereco, String telefone, int numero, int saldo, int tipo) {
        super(nome, endereco, telefone);
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void sacar(int valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }
        saldo -= valor;
    }

    public void depositar(int valor) {
        saldo += valor;
    }
}