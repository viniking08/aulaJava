package AtividadePolimorfismo;

public class Especial extends ContaComum {

    private int limite;

    public Especial(String nome, String endereco, String telefone, int numero, int saldo, int tipo, int limite) {
        super(nome, endereco, telefone, numero, saldo, tipo);
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
}
